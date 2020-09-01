#!/bin/bash

set -o pipefail

litterbox="$1"
if [ ! -f "$litterbox" -o -z "$litterbox" ]
then
    echo "LitterBox .jar file not found!"
    exit 1
fi

in="$2"
if [ ! -d "$in" -o -z "$in" ]
then
    echo "No valid input directory specified!"
    exit 1
fi

out="$3"
if [ ! -d "$out" -o -z "$out" ]
then
    echo "No valid output directory specified!"
    exit 1
fi

bastet="$4"
if [ ! -f "$bastet/scripts/bastet.sh" -o -z "$bastet" ]
then
    echo "No valid BASTET root directory specified!"
    exit 1
fi

basedir=$(pwd)
parse_err_proj_dir="$basedir/sb3-parse-err/"
mkdir -p "$parse_err_proj_dir"

for file in $(find $in -type f -name "*.sb3")
do  
    cd $basedir

    # 1. Translate the given Scratch project to LeILa
    basefile=`basename $file`
    filename="${basefile%.*}"
    exercisename=`basename $(dirname $file)`

    makepath="$out/$exercisename/$filename"
    mkdir -p $makepath
    leilafile=`realpath $makepath/${filename}.sc`
    echo "Exporting to $leilafile"

    if [ ! -d $makepath ] 
    then
        echo "Invalid make path dir!"
        exit 1
    fi

    unzip -o -q $file -d $makepath
    java -jar $litterbox --leila --path $file -n -o $makepath > /dev/null 2>&1
    rm $makepath/project.json


    # 2. Test if the resulting LeILA program can be parsed by BASTET
    cd $bastet

    bastet_resultfile=$(mktemp)
    ./scripts/bastet.sh \
        -c config/parse-only.json \
        -I src/public/library.sc \
        -S test/specs/empty.sc \
        -P $leilafile \
        > $bastet_resultfile 2>&1

    parsingerror=$(cat $bastet_resultfile | egrep "Failed to verify:|Running BASTET failed with:" | cut -d":" -f2)
    rm $bastet_resultfile

    if [ -z "$parsingerror" ]
    then
        echo -e "\tParsing successful!"
    else
        sb3file=$basedir/$file
        cp $sb3file $parse_err_proj_dir/

        echo -e "\tParsing failed with: $parsingerror"
        echo -e "\tProject: $sb3file"
    fi 

done
