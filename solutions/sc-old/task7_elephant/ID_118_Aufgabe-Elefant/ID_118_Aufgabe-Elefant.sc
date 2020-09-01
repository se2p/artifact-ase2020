 program strid "ID_118_Aufgabe-Elefant.sb3"
  actor strid "Stage" is ScratchStage begin 
      sound strid "Plopp" "83a9787d4cb6f3b7632b4ddfebf74367.wav"
      image strid "Bühnenbild1" "797b03bdb8cf6ccfc30c0692d533d998.png"
      image strid "Hintergrund-Manege-klein" "79b6284624632e81a5f0bbe203f9df84.svg"
 
 
  end 
 
  actor strid "Elefant1" is ScratchSprite begin 
      sound strid "Plopp" "83a9787d4cb6f3b7632b4ddfebf74367.wav"
      image strid "Elefant1" "c002a84c038ca40e9ae8cb8787e31d3c.svg"
      image strid "Elefant2" "cc4abdc80079a8cfb3d56333823d11f0.svg"
      image strid "Elefant3" "928ad58f623e44e8dca302c077d46c2f.svg"
      image strid "Elefant4" "8601bb462d5462d06b0dbfff42f929cf.svg"
      image strid "Elefant5" "9f084d14d2f2d6c8d2545e7860f3145f.svg"
      image strid "Elefant6" "441b8b425ecea279401e2af2030c4346.svg"
 
 
 
      script on startup do begin 
          repeat forever begin 
              changeCostumeTo("Elefant1")
              wait 1 seconds 
              changeCostumeTo("Elefant2")
              wait 1 seconds 
              changeCostumeTo("Elefant3")
              wait 1 seconds 
              changeCostumeTo("Elefant4")
              wait 1 seconds 
              changeCostumeTo("Elefant5")
              wait 1 seconds 
              changeCostumeTo("Elefant6")
              wait 1 seconds 
          end 
      end 
  end 
 
  actor strid "Muskelmann" is ScratchSprite begin 
      sound strid "Plopp" "83a9787d4cb6f3b7632b4ddfebf74367.wav"
      image strid "Muskelmann" "bede28cd03e261474aad50ab4228df51.svg"
 
 
 
      script on startup do begin 
          repeat forever begin 
              turnRight(180)
          end 
      end 
  end 
 
  actor strid "Muskelmann2" is ScratchSprite begin 
      sound strid "Plopp" "83a9787d4cb6f3b7632b4ddfebf74367.wav"
      image strid "Muskelmann" "bede28cd03e261474aad50ab4228df51.svg"
 
 
 
      script on startup do begin 
          repeat forever begin 
              turnRight(180)
          end 
      end 
  end 
 
  actor strid "Seehund" is ScratchSprite begin 
      sound strid "Plopp" "83a9787d4cb6f3b7632b4ddfebf74367.wav"
      image strid "Seehund" "4014af6f2710d9cf37c4fa4619560418.svg"
 
 
 
      script on startup do begin 
          repeat forever begin 
              turnRight(180)
          end 
      end 
  end 