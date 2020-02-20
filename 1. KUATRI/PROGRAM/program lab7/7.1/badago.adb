with def_datuak; use def_datuak;

function badago (
	N        : in     Integer;           
	L        : in     osokoen_zerrenda) 
	return Boolean is 
	-- aurrebaldintza: 
	-- post: emaitza TRUE da N Ln badago, FALSE bestela 
	emaitza: boolean := False;

begin

	for i in 1..10 loop
		if (N = L.zenbakiak(i)) then
			emaitza := True;
		end if;
	end loop;

	return emaitza;

end badago;

