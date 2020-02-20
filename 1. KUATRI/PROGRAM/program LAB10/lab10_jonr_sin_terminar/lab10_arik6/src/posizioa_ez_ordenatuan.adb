with Datuak;
use Datuak;

with ada.text_io;
use ada.text_io;

function posizioa_ez_ordenatuan (
	L   : Lista;
	N : Integer )
	return Natural is
	-- aurre: Lista ez du zertan ordenatuta egon behar
	-- post: Num-en lehenengo agerpenaren posizioa bueltatu. Num listan ez balego bueltatu 0
	Emaitza: Natural := 0;
	i: integer := 0;
	Egungoa: Lista;
	irten: boolean := False;

begin

	Egungoa := L;

	loop exit when (Emaitza > 0 OR irten);
		if(Egungoa /= null AND then Egungoa.Info = N) then
			Emaitza := i + 1;
		end if;
		if(Egungoa /= null AND then Egungoa.Hurrengoa /= null) then
			Egungoa := Egungoa.Hurrengoa;
		else
			irten := True;
		end if;
		i := i + 1;
	end loop;

	return Emaitza;

end posizioa_ez_ordenatuan;


