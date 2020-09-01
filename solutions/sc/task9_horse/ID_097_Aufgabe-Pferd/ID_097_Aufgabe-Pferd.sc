program strid "ID_097_Aufgabe-Pferd"

actor Stage is ScratchStage begin 
    image strid "Bühnenbild1" "797b03bdb8cf6ccfc30c0692d533d998.png"
    image strid "Hintergrund-Manege-klein" "79b6284624632e81a5f0bbe203f9df84.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Hintergrund-Manege-klein")
    end 

end 

actor Pferd is ScratchSprite begin 
    image Pferd "d8ee8b80cd0de1fce8c2d532da8881f3.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Pferd")
    end 

    script on startup do begin 
        repeat forever begin 
            if (touchingMousePointer()) then begin 
                turnRight(15)
            end else begin 
                changeGraphicEffectBy("color", 25)
            end 
        end 
    end 

end 