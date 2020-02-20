with Motak;
use Motak;

with Ada.Text_Io, Ada.Integer_Text_Io;
use Ada.Text_Io, Ada.Integer_Text_Io;



procedure aulkiak_idatzi (
      Aulkiak : in     T_Lista_Aulkiak ) is
   -- Post: Aulkiren bat lortu duten alderdien informazioa pantailaratuko da.

begin

   for i in 1 .. Aulkiak.Kop_alderdi loop
      Put("Alderdiak: ");
      Put(Aulkiak.Taula_aulkiak(I).izena);

      Put(" dauzka ");
      Put(Aulkiak.Taula_aulkiak(I).Aulki_kop, Width => 0);
      Put(" Aulki.");
      New_Line;
   end loop;

end aulkiak_idatzi ;
