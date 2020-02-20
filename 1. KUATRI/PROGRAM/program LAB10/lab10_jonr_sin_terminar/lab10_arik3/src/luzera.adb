with Ada.Text_Io, Ada.Integer_Text_Io, datuak;
use datuak;
use Ada.Text_Io, Ada.Integer_Text_Io;


function luzera (L: in Lista) return integer is

	lu: integer := 0;

begin
	loop exit when (L.Info = null);
		lu := lu + 1;
		L.Hurrengoa;
	end loop;

	return lu;
end luzera;
