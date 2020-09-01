program strid "ID_119_Aufgabe-Pferd"

actor Stage is ScratchStage begin 
    image strid "Bühnenbild1" "797b03bdb8cf6ccfc30c0692d533d998.png"
    image strid "Hintergrund-Manege-klein" "79b6284624632e81a5f0bbe203f9df84.svg"
    image strid "city with water" "c8ed9fb535ddc0c5edceced4c69600be.png"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("city with water")
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
                turnRight(90)
            end else begin 
                changeGraphicEffectBy("color", 25)
            end 
        end 
    end 

end 