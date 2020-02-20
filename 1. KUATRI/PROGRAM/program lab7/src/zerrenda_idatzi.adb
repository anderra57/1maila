with Ada.Text_Io, Ada.Integer_Text_Io;
use Ada.Text_Io, Ada.Integer_Text_Io;
with def_datuak; use def_datuak;

procedure zerrenda_idatzi (L : in Osokoen_Zerrenda ) is
   --Aurre:
   --Post:  L-ren balioak pantailatik idatzi dira
   --          1-etik L.Kont-era
begin

   put("ZERRENDA_IDATZI barruan, zerrendak ZENBAT elementu dituen: ");
   put(L.zenbat);
   new_line;
   for i in 1..L.zenbat loop
      put(L.zenbakiak(i));
      new_line;
   end loop;

end zerrenda_idatzi;

