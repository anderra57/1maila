with datuak; use datuak;
with posizio_ordenatuan;
procedure ezabatu_agerpen_guztiak (
      L   : in out Lista;
      Zen : in     Integer ) is
   -- Aurre:
   -- Post: L-tik Zen-en agerpen guztiak ezabatu dira
   Pos : Natural;
   lag: Lista;
   lag1: Lista;
begin

   Pos := posizio_ordenatuan(L, Zen);
   lag := L;

   if ( (L /= null) and (Pos /= 0) ) then
      loop exit when(lag = null);
	     if (lag.Info = Zen) then
	        if (lag1 /= null) then
	           lag1.Hurrengoa := lag.Hurrengoa;
	           lag := lag.Hurrengoa;
	        else
	           L := L.Hurrengoa;
	           lag := L;
	        end if;
	     else
	        lag1 := lag;
	        lag := lag.Hurrengoa;
	     end if;
      end loop;
   end if;

end ezabatu_agerpen_guztiak;

