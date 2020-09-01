program strid "ID_100_Aufgabe-Elefant"

actor Stage is ScratchStage begin 
    image strid "Bühnenbild1" "797b03bdb8cf6ccfc30c0692d533d998.png"
    image strid "Hintergrund-Manege-klein" "79b6284624632e81a5f0bbe203f9df84.svg"
    image pool "6cab934df643d2fc508cfa90c0c4059b.png"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("pool")
    end 

end 

actor Elefant1 is ScratchSprite begin 
    image Elefant1 "ccc9b47e53addb2f0209886d04321873.svg"
    image Elefant2 "cc4abdc80079a8cfb3d56333823d11f0.svg"
    image Elefant3 "928ad58f623e44e8dca302c077d46c2f.svg"
    image Elefant4 "8601bb462d5462d06b0dbfff42f929cf.svg"
    image Elefant5 "6cc644abb992090fcfc64c1d47c0520d.svg"
    image Elefant6 "441b8b425ecea279401e2af2030c4346.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Elefant5")
    end 

    script on startup do begin 
        repeat 10 times begin 
            changeCostumeTo("Elefant1")
            wait 1 seconds 
            changeCostumeTo("Elefant3")
            wait 1 seconds 
            changeCostumeTo("Elefant2")
            wait 1 seconds 
            switchBackdropToNext()
            changeCostumeTo("Elefant4")
            wait 1 seconds 
            changeCostumeTo("Elefant5")
            wait 1 seconds 
            changeGraphicEffectBy("color", 25)
            changeCostumeTo("Elefant6")
        end 
    end 

end 

actor Elefant2 is ScratchSprite begin 
    image Elefant1 "ccc9b47e53addb2f0209886d04321873.svg"
    image Elefant2 "cc4abdc80079a8cfb3d56333823d11f0.svg"
    image Elefant3 "928ad58f623e44e8dca302c077d46c2f.svg"
    image Elefant4 "8601bb462d5462d06b0dbfff42f929cf.svg"
    image Elefant5 "6cc644abb992090fcfc64c1d47c0520d.svg"
    image Elefant6 "441b8b425ecea279401e2af2030c4346.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Elefant5")
    end 

    script on startup do begin 
        repeat 10 times begin 
            changeCostumeTo("Elefant1")
            wait 1 seconds 
            changeCostumeTo("Elefant3")
            wait 1 seconds 
            changeCostumeTo("Elefant2")
            wait 1 seconds 
            switchBackdropToNext()
            changeCostumeTo("Elefant4")
            wait 1 seconds 
            changeCostumeTo("Elefant5")
            wait 1 seconds 
            changeGraphicEffectBy("color", 25)
            changeCostumeTo("Elefant6")
        end 
    end 

end 

actor Elefant3 is ScratchSprite begin 
    image Elefant1 "ccc9b47e53addb2f0209886d04321873.svg"
    image Elefant2 "cc4abdc80079a8cfb3d56333823d11f0.svg"
    image Elefant3 "928ad58f623e44e8dca302c077d46c2f.svg"
    image Elefant4 "8601bb462d5462d06b0dbfff42f929cf.svg"
    image Elefant5 "6cc644abb992090fcfc64c1d47c0520d.svg"
    image Elefant6 "441b8b425ecea279401e2af2030c4346.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Elefant5")
    end 

    script on startup do begin 
        repeat 10 times begin 
            changeCostumeTo("Elefant1")
            wait 1 seconds 
            changeCostumeTo("Elefant3")
            wait 1 seconds 
            changeCostumeTo("Elefant2")
            wait 1 seconds 
            switchBackdropToNext()
            changeCostumeTo("Elefant4")
            wait 1 seconds 
            changeCostumeTo("Elefant5")
            wait 1 seconds 
            changeGraphicEffectBy("color", 25)
            changeCostumeTo("Elefant6")
        end 
    end 

end 

actor Elefant4 is ScratchSprite begin 
    image Elefant1 "ccc9b47e53addb2f0209886d04321873.svg"
    image Elefant2 "cc4abdc80079a8cfb3d56333823d11f0.svg"
    image Elefant3 "928ad58f623e44e8dca302c077d46c2f.svg"
    image Elefant4 "8601bb462d5462d06b0dbfff42f929cf.svg"
    image Elefant5 "6cc644abb992090fcfc64c1d47c0520d.svg"
    image Elefant6 "441b8b425ecea279401e2af2030c4346.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Elefant5")
    end 

    script on startup do begin 
        repeat 10 times begin 
            changeCostumeTo("Elefant1")
            wait 1 seconds 
            changeCostumeTo("Elefant3")
            wait 1 seconds 
            changeCostumeTo("Elefant2")
            wait 1 seconds 
            switchBackdropToNext()
            changeCostumeTo("Elefant4")
            wait 1 seconds 
            changeCostumeTo("Elefant5")
            wait 1 seconds 
            changeGraphicEffectBy("color", 25)
            changeCostumeTo("Elefant6")
        end 
    end 

end 

actor Elefant5 is ScratchSprite begin 
    image Elefant1 "ccc9b47e53addb2f0209886d04321873.svg"
    image Elefant2 "cc4abdc80079a8cfb3d56333823d11f0.svg"
    image Elefant3 "928ad58f623e44e8dca302c077d46c2f.svg"
    image Elefant4 "8601bb462d5462d06b0dbfff42f929cf.svg"
    image Elefant5 "6cc644abb992090fcfc64c1d47c0520d.svg"
    image Elefant6 "441b8b425ecea279401e2af2030c4346.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Elefant5")
    end 

    script on startup do begin 
        repeat 10 times begin 
            changeCostumeTo("Elefant1")
            wait 1 seconds 
            changeCostumeTo("Elefant3")
            wait 1 seconds 
            changeCostumeTo("Elefant2")
            wait 1 seconds 
            switchBackdropToNext()
            changeCostumeTo("Elefant4")
            wait 1 seconds 
            changeCostumeTo("Elefant5")
            wait 1 seconds 
            changeGraphicEffectBy("color", 25)
            changeCostumeTo("Elefant6")
        end 
    end 

end 

actor Elefant6 is ScratchSprite begin 
    image Elefant1 "ccc9b47e53addb2f0209886d04321873.svg"
    image Elefant2 "cc4abdc80079a8cfb3d56333823d11f0.svg"
    image Elefant3 "928ad58f623e44e8dca302c077d46c2f.svg"
    image Elefant4 "8601bb462d5462d06b0dbfff42f929cf.svg"
    image Elefant5 "6cc644abb992090fcfc64c1d47c0520d.svg"
    image Elefant6 "441b8b425ecea279401e2af2030c4346.svg"
    sound Plopp "83a9787d4cb6f3b7632b4ddfebf74367.wav"


    script on bootstrap do begin 
        changeActiveGraphicTo("Elefant5")
    end 

    script on startup do begin 
        repeat 10 times begin 
            changeCostumeTo("Elefant1")
            wait 1 seconds 
            changeCostumeTo("Elefant3")
            wait 1 seconds 
            changeCostumeTo("Elefant2")
            wait 1 seconds 
            switchBackdropToNext()
            changeCostumeTo("Elefant4")
            wait 1 seconds 
            changeCostumeTo("Elefant5")
            wait 1 seconds 
            changeGraphicEffectBy("color", 25)
            changeCostumeTo("Elefant6")
        end 
    end 

end 