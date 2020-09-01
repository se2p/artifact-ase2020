program strid "ID_118_Aufgabe-Pferd"

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
                turnRight(180)
            end else begin 
                changeGraphicEffectBy("color", 25)
            end 
        end 
    end 

end 

actor Banane is ScratchSprite begin 
    image Banane "d0bc9fc01d7a03a2d3b0fc5066743234.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Banane")
    end 

    script on startup do begin 
        repeat forever begin 
            turnRight(180)
        end 
    end 

end 

actor Banane2 is ScratchSprite begin 
    image Banane "d0bc9fc01d7a03a2d3b0fc5066743234.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Banane")
    end 

    script on startup do begin 
        repeat forever begin 
            turnRight(180)
        end 
    end 

end 

actor Banane3 is ScratchSprite begin 
    image Banane "d0bc9fc01d7a03a2d3b0fc5066743234.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Banane")
    end 

    script on startup do begin 
        repeat forever begin 
            turnRight(180)
        end 
    end 

end 

actor Banane4 is ScratchSprite begin 
    image Banane "d0bc9fc01d7a03a2d3b0fc5066743234.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Banane")
    end 

    script on startup do begin 
        repeat forever begin 
            turnRight(180)
        end 
    end 

end 

actor Banane5 is ScratchSprite begin 
    image Banane "d0bc9fc01d7a03a2d3b0fc5066743234.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Banane")
    end 

    script on startup do begin 
        repeat forever begin 
            turnRight(180)
        end 
    end 

end 

actor Banane6 is ScratchSprite begin 
    image Banane "d0bc9fc01d7a03a2d3b0fc5066743234.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Banane")
    end 

    script on startup do begin 
        repeat forever begin 
            turnRight(180)
        end 
    end 

end 

actor Banane7 is ScratchSprite begin 
    image Banane "d0bc9fc01d7a03a2d3b0fc5066743234.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Banane")
    end 

    script on startup do begin 
        repeat forever begin 
            turnRight(180)
        end 
    end 

end 