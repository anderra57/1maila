with Ada.Text_IO, Ada.Integer_Text_IO, Datuak;
use Ada.Text_IO, Ada.Integer_Text_IO, Datuak;

procedure Idatzi (
      L : in     Lista ) is
      -- aurre:
      -- post:

   Egungoa : Lista;

begin

   Egungoa := L;
   New_Line;
   New_Line;
   Put("Listaren edukia hurrenekoa da: ");
   New_Line;
   Put(" <");
   loop exit when(Egungoa = null);
      Put(Egungoa.info);
      Egungoa := Egungoa.Hurrengoa;
   end loop;
   Put(" >");
   New_Line;





end Idatzi;

