with Ada.Text_Io, Ada.Integer_Text_Io; use Ada.Text_Io, Ada.Integer_Text_Io;
with bektoreak; use bektoreak;

procedure zerrenda_idatzi (L : in Osokoen_Zerrenda ) is 
   --Aurre:	  
   --Post:  L-ren balioak pantailatik idatzi dira
   --          1-etik L.Kont-era

begin
   for pos in 1 .. L.Kont loop
      Put(L.Zenbakiak(pos), width => 3);
   end loop;
   new_line;
end zerrenda_idatzi;

