with Datuak;
use Datuak;

procedure txertatu_bukaeran (
	L   : in out Lista;
	Num : in     Integer ) is
	-- aurre:
	-- post: Num zenbakia L-ren hasieran txertatu da
	Berria: Lista;

begin

	--Berria := new Nodo;
	--Berria := L;
	--Berria.Info := Num;
	--L := Berria;
	
	Berria := L;
	
	loop exit when (Berria = null);
		Berria := Berria.Hurrengoa;
	end loop;

	Berria := Num;
	L := Berria;

end txertatu_bukaeran;
