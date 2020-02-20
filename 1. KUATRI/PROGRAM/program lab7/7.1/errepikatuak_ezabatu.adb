with def_datuak; use def_datuak;

with badago;

procedure errepikatuak_ezabatu (
	L_in    : in     osokoen_zerrenda;
	L_out    :    out osokoen_zerrenda  ) is
	-- aurre:
	-- post: L_out barnean L_in barneko zenbakiak izango ditu errepikapenik gabe
   ind:integer:=1;
   zenb: integer;
begin
  -- lista 10 zenbakikoa izango da, eta errepikatu gabeko zenbakiak kokatu eta eskumara zeroz beteko da
    L_out.zenbakiak := (0,0,0,0,0,0,0,0,0,0, OTHERS => 0);

   for i in 1..10 loop
         zenb := L_in.zenbakiak(i);
		 if not badago(zenb, L_out) then
			L_out.zenbakiak(ind) := L_in.zenbakiak(i);
			ind := ind + 1;
		end if;
	end loop;

end errepikatuak_ezabatu;

