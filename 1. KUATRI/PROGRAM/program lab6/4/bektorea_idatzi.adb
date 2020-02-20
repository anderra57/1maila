with Ada.Text_Io, Ada.Integer_Text_Io; use Ada.Text_Io, Ada.Integer_Text_Io;
with bektoreak; use bektoreak;

procedure Bektorea_idatzi (B : in Osokoen_Bektorea) is
   --Aurre:
   --Post: B-ren balio guztiak pantailatik idazten ditu
   --
begin
      for i in 1..B'last loop
         put(B(i));
	     put(", ");
      end loop;

end Bektorea_idatzi;

