program strid "ID_062_Aufgabe-Pferd"

actor Stage is ScratchStage begin 
    image strid "Bühnenbild1" "797b03bdb8cf6ccfc30c0692d533d998.png"
    image strid "Hintergrund-Manege-klein" "79b6284624632e81a5f0bbe203f9df84.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Hintergrund-Manege-klein")
    end 

end 

actor Pferd is ScratchSprite begin 
    image Pferd "e3c31624b041dec74c1e8918ba6e7b14.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Pferd")
    end 

    script on startup do begin 
        if (touchingMousePointer()) then begin 
            turnRight(90)
        end else begin 
            changeGraphicEffectBy("color", 122222)
        end 
    end 

end 