program strid "ID_099_Aufgabe-Affenjagd"

actor Stage is ScratchStage begin 
    image strid "Bühnenbild1" "797b03bdb8cf6ccfc30c0692d533d998.png"
    image strid "Hintergrund-Manege-klein" "79b6284624632e81a5f0bbe203f9df84.svg"
    image strid "Hintergrund-Affenjagd" "38400304784072f5523520c97646fef9.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Hintergrund-Affenjagd")
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
        end 
    end 

end 

actor Affe is ScratchSprite begin 
    image Affe "7847b73225b11941e978666b709a2c06.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Affe")
    end 

    script on startup do begin 
        repeat forever begin 
            pointTowards(locate actor "Banane")
            moveSteps(1)
        end 
    end 

end 