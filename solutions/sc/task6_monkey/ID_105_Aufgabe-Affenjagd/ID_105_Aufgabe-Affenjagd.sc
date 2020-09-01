program strid "ID_105_Aufgabe-Affenjagd"

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
    end 

end 

actor Elephant is ScratchSprite begin 
    image strid "elephant-a " "b59873e9558c1c456200f50e5ab34770.svg"
    image strid "elephant-b " "2c9b5e0125d95b8bc511f6bb09b5ea2f.svg"
    sound pop "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("elephant-a ")
    end 

end 

actor Monkey1 is ScratchSprite begin 
    image strid "monkey1-a" "8c6acfaa66994eef0a2d6cf6cb98821f.svg"
    image strid "monkey1-b" "5fe67355b138279795dd32a4758c39fa.svg"
    sound pop "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("monkey1-a")
    end 

end 

actor Lion is ScratchSprite begin 
    image strid "lion-a" "1a0b4d27fb11a656789077e56efd2ef4.svg"
    image strid "lion-b" "7d4a983f4121ff4814833ae11cebebb3.svg"
    sound meow "83c36d806dc92327b9e7049a565c6bff.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("lion-b")
    end 

end 

actor Butterfly3 is ScratchSprite begin 
    image strid "butterfly3 " "210de5553b5ad6c5aa14ecfc4bce73a0.svg"
    sound pop "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("butterfly3 ")
    end 

end 