with Ada.Text_IO, Ada.Integer_Text_IO, Datuak;
use Datuak;

procedure Escribir ( L : in     Lista ) is

   Actual : Lista;

begin

    Actual := L;

   Ada.Text_Io.New_Line;
   Ada.Text_Io.New_Line;
   Ada.Text_Io.Put("el contenido de la lista es: ");
   Ada.Text_Io.New_Line;
   Ada.Text_Io.Put("       <");
   Ada.Text_Io.New_Line;

    loop exit when(Actual = null);
        Ada.Integer_Text_IO.Put(Actual.info);
        Actual := Actual.Hurrengoa;
    end loop;


   Ada.Text_Io.Put("        >");
   Ada.Text_Io.New_Line;
end Escribir;

