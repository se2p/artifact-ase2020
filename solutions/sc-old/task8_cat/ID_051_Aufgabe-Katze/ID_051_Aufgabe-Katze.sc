 program strid "ID_051_Aufgabe-Katze.sb3"
  actor strid "Stage" is ScratchStage begin 
      sound strid "Plopp" "83a9787d4cb6f3b7632b4ddfebf74367.wav"
      image strid "Bühnenbild1" "797b03bdb8cf6ccfc30c0692d533d998.png"
      image strid "Hintergrund-Manege-klein" "79b6284624632e81a5f0bbe203f9df84.svg"
 
 
  end 
 
  actor strid "Clownschüler" is ScratchSprite begin 
      sound strid "Plopp" "83a9787d4cb6f3b7632b4ddfebf74367.wav"
      image strid "Clownschüler" "daeedeaff9b6e102a5613ccf12e998dd.svg"
 
      script on startup do begin 
          askAndWait("soll ich anfangen")
          if (answer() = "ja") then begin 
                sayTextFor("TREFEN SICH ZWEI JÄGER", 2)
                sayTextFor("BEIDE TOT", 2)
          end 
      end 

      script on never do begin 
          repeat forever begin 
          end 
      end 
  end 
