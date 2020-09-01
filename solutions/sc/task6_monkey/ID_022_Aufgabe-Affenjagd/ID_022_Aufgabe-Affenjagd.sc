program strid "ID_022_Aufgabe-Affenjagd"

actor Stage is ScratchStage begin 
    image strid "Bühnenbild1" "797b03bdb8cf6ccfc30c0692d533d998.png"
    image strid "Hintergrund-Manege-klein" "79b6284624632e81a5f0bbe203f9df84.svg"
    image strid "Hintergrund-Affenjagd" "38400304784072f5523520c97646fef9.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Hintergrund-Affenjagd")
    end 

end 

actor Affe is ScratchSprite begin 
    image Affe "7847b73225b11941e978666b709a2c06.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Affe")
    end 

    script on startup do begin 
    end 

end 

actor strid "Zirkusdirektor-rennend" is ScratchSprite begin 
    image strid "Zirkusdirektor-rennend" "a5e99045008feccd3adaca82ccbf27ef.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Zirkusdirektor-rennend")
    end 

    script on startup do begin 
        repeat forever begin 
            pointTowards(locate actor "Affe")
            moveSteps(10)
        end 
    end 

end 