with datuak, Ada.Text_Io;
use datuak, Ada.Text_Io;

procedure ezabatu_lehenengo_agerpena (
      L   : in out Lista;
      Zen : in     Integer ) is
   -- Aurre:
   -- Post: L-tik Zen-en lehenengo agerpena ezabatu da.
   --       Ez bada agertzen, mezu bat pantailaratuko du

   lag: Lista;
   lag1: Lista;
   agertua: boolean;
   Berria: Lista;
begin

   agertua := False;

   lag := L;

   loop exit when ((agertua = True) or (lag = null));

      if (Zen = lag.Info) then

	 if (lag1 /= null) then

	    lag1.Hurrengoa := lag.Hurrengoa;
	    agertua := True;

	 else

	    agertua := True;
	    L := L.Hurrengoa;

	 end if;

      else

	 lag1 := lag;
	 lag := lag.Hurrengoa;

      end if;

   end loop;
end ezabatu_lehenengo_agerpena;

