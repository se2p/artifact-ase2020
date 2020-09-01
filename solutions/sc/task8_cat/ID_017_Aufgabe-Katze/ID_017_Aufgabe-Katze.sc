program strid "ID_017_Aufgabe-Katze"

actor Stage is ScratchStage begin 
    image strid "Bühnenbild1" "797b03bdb8cf6ccfc30c0692d533d998.png"
    image strid "Hintergrund-Manege-klein" "79b6284624632e81a5f0bbe203f9df84.svg"
    image strid "Hintergrund-Affenjagd" "38400304784072f5523520c97646fef9.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Hintergrund-Affenjagd")
    end 

end 

actor Katze is ScratchSprite begin 
    image Katze "21842fb50ad963e6ed8d8a68ef1e7d17.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Katze")
    end 

    script on startup do begin 
        repeat forever begin 
            if (touchingObject(locate actor "Ball")) then begin 
                sayTextFor("Hab ich dich!", 2)
            end 
        end 
    end 

end 

actor Ball is ScratchSprite begin 
    image Ball "b1d78b051b1587207d6c4fb04a86c9a7.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Ball")
    end 

    script on startup do begin 
    end 

end 