with Datuak;
use Datuak;

procedure txertatu_bukaeran (
      L   : in out Lista;
      Num : in     Integer ) is
   -- aurre:
   -- post: Num zenbakia L-ren hasieran txertatu da


   Z: Lista;
begin


   Z := L;
   Z.Hurrengoa := new Nodo;
   Z.Hurrengoa.Info := num;
   Z.Hurrengoa.Hurrengoa := null;

end txertatu_bukaeran;



