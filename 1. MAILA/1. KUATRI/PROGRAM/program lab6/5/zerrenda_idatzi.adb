with Ada.Text_Io, Ada.Integer_Text_Io; use Ada.Text_Io, Ada.Integer_Text_Io;
with bektoreak; use bektoreak;

procedure zerrenda_idatzi (L : in Osokoen_Zerrenda ) is
   --Aurre:
   --Post:  L-ren balioak pantailatik idatzi dira
   --          1-etik L.Kont-era
begin
   for i in 1..L.kont loop
      put(L.zenbakiak(i));
      new_line;
   end loop;

end zerrenda_idatzi;

