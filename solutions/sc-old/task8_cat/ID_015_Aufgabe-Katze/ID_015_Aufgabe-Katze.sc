 program strid "ID_015_Aufgabe-Katze.sb3"
  actor strid "Stage" is ScratchStage begin 
      sound strid "Plopp" "83a9787d4cb6f3b7632b4ddfebf74367.wav"
      image strid "Bühnenbild1" "797b03bdb8cf6ccfc30c0692d533d998.png"
      image strid "Hintergrund-Manege-klein" "79b6284624632e81a5f0bbe203f9df84.svg"
      image strid "Hintergrund-Affenjagd" "38400304784072f5523520c97646fef9.svg"
 
 
  end 
 
  actor strid "Katze" is ScratchSprite begin 
      sound strid "Plopp" "83a9787d4cb6f3b7632b4ddfebf74367.wav"
      image strid "Katze" "21842fb50ad963e6ed8d8a68ef1e7d17.svg"
 
 
 
      script on startup do begin 
          repeat forever begin 
              if touchingObject(locate actor  "Ball") then begin 
                      sayTextFor("Hab ich dich!", 2)
                  end 
          end 
      end 
  end 
 
  actor strid "Ball" is ScratchSprite begin 
      sound strid "Plopp" "83a9787d4cb6f3b7632b4ddfebf74367.wav"
      image strid "Ball" "b1d78b051b1587207d6c4fb04a86c9a7.svg"
 
 
 
      script on startup do begin 
      end 
  end 