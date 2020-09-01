 program strid "ID_062_Aufgabe-Pferd.sb3"
  actor strid "Stage" is ScratchStage begin 
      sound strid "Plopp" "83a9787d4cb6f3b7632b4ddfebf74367.wav"
      image strid "Bühnenbild1" "797b03bdb8cf6ccfc30c0692d533d998.png"
      image strid "Hintergrund-Manege-klein" "79b6284624632e81a5f0bbe203f9df84.svg"
 
 
  end 
 
  actor strid "Pferd" is ScratchSprite begin 
      sound strid "Plopp" "83a9787d4cb6f3b7632b4ddfebf74367.wav"
      image strid "Pferd" "e3c31624b041dec74c1e8918ba6e7b14.svg"
 
 
 
      script on startup do begin 
          if touchingMousePointer() then begin 
                  turnRight(90)
              end 
          else begin 
                  define color_effect_value as 122222.0
              end 
      end 
  end 