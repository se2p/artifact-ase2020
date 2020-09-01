 program strid "ID_059_Aufgabe-Pferd.sb3"
  actor strid "Stage" is ScratchStage begin 
      sound strid "Plopp" "83a9787d4cb6f3b7632b4ddfebf74367.wav"
      image strid "Bühnenbild1" "797b03bdb8cf6ccfc30c0692d533d998.png"
      image strid "Hintergrund-Manege-klein" "79b6284624632e81a5f0bbe203f9df84.svg"
 
 
  end 
 
  actor strid "Pferd" is ScratchSprite begin 
      sound strid "Plopp" "83a9787d4cb6f3b7632b4ddfebf74367.wav"
      image strid "Pferd" "d8ee8b80cd0de1fce8c2d532da8881f3.svg"
 
 
 
      script on startup do begin 
          if touchingMousePointer() then begin 
                  turnRight(360)
              end 
          else begin 
                  define color_effect_value as 62.0
              end 
      end 
  end 