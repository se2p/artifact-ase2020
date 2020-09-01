program strid "ID_041_Aufgabe-Elefant"

actor Stage is ScratchStage begin 
    image strid "Bühnenbild1" "797b03bdb8cf6ccfc30c0692d533d998.png"
    image strid "Hintergrund-Manege-klein" "79b6284624632e81a5f0bbe203f9df84.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Hintergrund-Manege-klein")
    end 

end 

actor Elefant1 is ScratchSprite begin 
    image Elefant1 "c002a84c038ca40e9ae8cb8787e31d3c.svg"
    image Elefant2 "cc4abdc80079a8cfb3d56333823d11f0.svg"
    image Elefant3 "928ad58f623e44e8dca302c077d46c2f.svg"
    image Elefant4 "8601bb462d5462d06b0dbfff42f929cf.svg"
    image Elefant5 "6cc644abb992090fcfc64c1d47c0520d.svg"
    image Elefant6 "441b8b425ecea279401e2af2030c4346.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Elefant6")
    end 

    script on startup do begin 
        repeat 10 times begin 
            changeCostumeTo("Elefant1")
            changeCostumeTo("Elefant2")
            changeCostumeTo("Elefant3")
            changeCostumeTo("Elefant4")
            changeCostumeTo("Elefant5")
            changeCostumeTo("Elefant6")
        end 
    end 

end 