with Ada.Text_IO, Ada.Integer_Text_IO, Datuak;
use Datuak;

procedure Idatzi (
	L : in     Lista ) is
	-- aurre:
	-- post:

	Egungoa : Lista;

begin

	for i in 1..L'length loop
		put(L(i));
	end loop;

end Idatzi;
