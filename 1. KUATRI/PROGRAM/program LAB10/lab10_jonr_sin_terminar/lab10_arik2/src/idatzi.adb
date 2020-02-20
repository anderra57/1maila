with Ada.Text_IO, Ada.Integer_Text_IO, Datuak;
use Ada.Text_IO, Ada.Integer_Text_IO, Datuak;

procedure Idatzi (
	L : in     Lista ) is
	-- aurre:
	-- post:

	Egungoa : Lista;

begin

	Egungoa := L;

	loop exit when (Egungoa = null);
		put(Egungoa.Info);
		Egungoa := L.Hurrengoa;
	end loop;

end Idatzi;

