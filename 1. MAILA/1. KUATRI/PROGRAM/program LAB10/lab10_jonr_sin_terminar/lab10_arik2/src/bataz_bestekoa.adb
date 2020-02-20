with Datuak;
use Datuak;

function bataz_bestekoa (L: in Lista) return Float is
	-- aurre: Idatzi ezazu
	-- post: Idatzi ezazu
	totala: float := 0.00;
	i: integer := 0;
	egungoa: Lista;

begin
	
	egungoa := L;
	loop exit when (egungoa = null);
		totala := totala + float(egungoa.Info);
		egungoa := L.Hurrengoa;
		i := i + 1;
	end loop;
	
	return (totala/float(i));

end bataz_bestekoa;
