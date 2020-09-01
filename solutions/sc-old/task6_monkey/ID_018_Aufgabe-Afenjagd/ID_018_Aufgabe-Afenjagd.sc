 program strid "ID_018_Aufgabe-Afenjagd.sb3"
  actor strid "Stage" is ScratchStage begin 
      sound strid "Plopp" "83a9787d4cb6f3b7632b4ddfebf74367.wav"
      image strid "Bühnenbild1" "78d212878a6f0a2b3067aa2c8bca28e1.png"
      image strid "Hintergrund-Manege-klein" "d6aca145c741a1b12309267dcecdbd49.svg"
      image strid "Hintergrund-Affenjagd" "82571467d6b67128680f8d0dd6759285.svg"
 
 
  end 
 
  actor strid "Zirkusdirektor-rennend" is ScratchSprite begin 
      sound strid "Plopp" "83a9787d4cb6f3b7632b4ddfebf74367.wav"
      image strid "Zirkusdirektor-rennend" "3b9be2d9f7d6d03c9758fdf8c88454b4.svg"
 
 
 
      script on startup do begin 
          declare o as actor
 define o as  locate actor "Affe"
 pointTowards(o) 
      end 
  end 
 
  actor strid "Affe" is ScratchSprite begin 
      sound strid "Plopp" "83a9787d4cb6f3b7632b4ddfebf74367.wav"
      image strid "Affe" "33abaf302358c7dfe0082e337a328ee5.svg"
 
 
  end 