with bektoreak; use bektoreak;

function Ezabatu_Hirugarren_elementua (taula: in Osokoen_Zerrenda) return Osokoen_Zerrenda is
   -- aurre: elementuek ez dute zertan ordenatuta egon behar
   -- post: zerrendan hiru elementu edo gehiago bazeuden,
   -- hirugarren elementua ezabatuta egongo da, eta zerrendak
   -- ez du zertan ordena berezirik izan behar
   --       (hasierako ordenarekin alderatuta ezta)

taula1: Osokoen_Zerrenda;

begin
   taula1:=taula;

   if taula1.kont > 3 then
   taula1.zenbakiak(3) := taula.zenbakiak(taula.kont);
   taula1.kont := (taula1.kont - 1);
   end if;

   return(taula1);

end Ezabatu_Hirugarren_elementua;
