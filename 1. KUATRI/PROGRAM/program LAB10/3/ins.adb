with Datuak;
use Datuak;

procedure ins (
      L   : in out Lista;
      Zen : in     Integer ) is
   -- aurre:
   -- post: Zen zenbakia L-ren hasieran txertatu da
Berria : Lista;
begin

   Berria := new Nodo;
   Berria.Info := Zen;
   Berria.Hurrengoa := L;
   L := Berria;

end ins;

