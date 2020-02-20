with bektoreak; use bektoreak;

function Ezabatu_Hirugarren_elementua_ordenatuta (zerrenda: in Osokoen_Zerrenda) return Osokoen_Zerrenda is
   -- aurre: zerrendako elementuak ordenatuta daude
   -- post: zerrenda, hiru ego gehiago elementu badaude, hirugarren elementua ezabatu da eta zerrendak ordena mantenduko du
   zerrenda1: Osokoen_Zerrenda;
   kont:integer;
   begin

      kont:=2;

      zerrenda1.kont := (zerrenda.kont - 1);
      loop exit when (kont = (zerrenda.kont - 1)) or (zerrenda.kont = 3);
	     kont := kont + 1;
	     zerrenda1.zenbakiak(kont) := zerrenda.zenbakiak(kont + 1);
      end loop;


      return(zerrenda1);

   end Ezabatu_Hirugarren_elementua_ordenatuta;
