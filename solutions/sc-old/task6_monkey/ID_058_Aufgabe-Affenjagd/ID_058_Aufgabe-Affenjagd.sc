 program strid "ID_058_Aufgabe-Affenjagd.sb3"
  actor strid "Stage" is ScratchStage begin 
      sound strid "Plopp" "83a9787d4cb6f3b7632b4ddfebf74367.wav"
      image strid "Bühnenbild1" "797b03bdb8cf6ccfc30c0692d533d998.png"
      image strid "Hintergrund-Manege-klein" "79b6284624632e81a5f0bbe203f9df84.svg"
      image strid "Hintergrund-Affenjagd" "38400304784072f5523520c97646fef9.svg"
 
 
  end 
 
  actor strid "Affe" is ScratchSprite begin 
      sound strid "Plopp" "83a9787d4cb6f3b7632b4ddfebf74367.wav"
      image strid "Affe" "7847b73225b11941e978666b709a2c06.svg"
 
 
 
      script on startup do begin 
          define x as getMouseX()
 define y as getMouseY()
 
      end 
  end 
 
  actor strid "Zirkusdirektor-rennend" is ScratchSprite begin 
      sound strid "Plopp" "83a9787d4cb6f3b7632b4ddfebf74367.wav"
      image strid "Zirkusdirektor-rennend" "a5e99045008feccd3adaca82ccbf27ef.svg"
 
 
 
      script on startup do begin 
          repeat forever begin 
              declare o as actor
 define o as  locate actor "Affe"
 pointTowards(o) 
          end 
      end 
  end 
 
  actor strid "Figur1" is ScratchSprite begin 
      sound strid "Plopp" "83a9787d4cb6f3b7632b4ddfebf74367.wav"
      image strid "Kostüm1" "d36f6603ec293d2c2198d3ea05109fe0.png"
      image strid "Kostüm2" "d6391ca84009459aacfcf2ba1543756b.png"
 
 
  end 
 
  actor strid "Figur2" is ScratchSprite begin 
      sound strid "Plopp" "83a9787d4cb6f3b7632b4ddfebf74367.wav"
      image strid "Kostüm1" "d36f6603ec293d2c2198d3ea05109fe0.png"
 
 
  end 