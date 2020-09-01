program strid "ID_088_Aufgabe-Pferd"

actor Stage is ScratchStage begin 
    image strid "Bühnenbild1" "797b03bdb8cf6ccfc30c0692d533d998.png"
    image strid "Hintergrund-Manege-klein" "79b6284624632e81a5f0bbe203f9df84.svg"
    image goal1 "81155036ce45af8fcc0dceab08fad03f.png"
    image strid "train tracks2" "3629e7535d317a9b1c5e8f8c86a480a2.png"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("train tracks2")
    end 

    script on startup do begin 
    end 

end 

actor Airplane is ScratchSprite begin 
    image airplane2 "e06d54ee05f71143cf9601696c41a5c3.png"
    sound pop "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("airplane2")
    end 

end 