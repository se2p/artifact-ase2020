 program strid "ID_039_Aufgabe-Elefant.sb3"
  actor strid "Stage" is ScratchStage begin 
      sound strid "Plopp" "83a9787d4cb6f3b7632b4ddfebf74367.wav"
      image strid "Bühnenbild1" "797b03bdb8cf6ccfc30c0692d533d998.png"
      image strid "Hintergrund-Manege-klein" "79b6284624632e81a5f0bbe203f9df84.svg"
 
 
  end 
 
  actor strid "Elefant1" is ScratchSprite begin 
      sound strid "Plopp" "83a9787d4cb6f3b7632b4ddfebf74367.wav"
      image strid "Elefant1" "408c1cafb64143bc3a68283bb842b231.svg"
      image strid "Elefant2" "cc4abdc80079a8cfb3d56333823d11f0.svg"
      image strid "Elefant3" "928ad58f623e44e8dca302c077d46c2f.svg"
      image strid "Elefant4" "8815e5aa95ae43274dcd49508e39a39a.svg"
      image strid "Elefant5" "6cc644abb992090fcfc64c1d47c0520d.svg"
      image strid "Elefant6" "441b8b425ecea279401e2af2030c4346.svg"
 
 
 
      script on startup do begin 
          repeat 10 times begin 
              changeCostumeTo("Elefant2")
              wait 1 seconds 
              changeCostumeTo("Elefant3")
              wait 1 seconds 
          end 
      end 
  end 