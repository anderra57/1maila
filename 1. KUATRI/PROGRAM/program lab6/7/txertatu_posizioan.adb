with bektoreak; use bektoreak;

function txertatu_posizioan (zenb: in integer; pos: in integer; lis: in Osokoen_Zerrenda) return Osokoen_Zerrenda is
   -- aurre: txertatzeko posizioa zerrendaren elementu
   --        kopurua +1 baino txikiagoa edo berdina izango da
   -- post: elementua posizioan txertatuta egongo da
   --       eta gainerako elementuak eskuinera mugituko dira

   lag, kont:integer;
   L:Osokoen_Zerrenda;
begin
   L:=lis;
   L.kont := L.kont + 1;
   lag := 1;
   kont := pos;
   loop exit when ( (L.kont = kont));
      L.zenbakiak((L.kont + 1 - lag)) := L.zenbakiak(L.kont - lag);
      kont := kont + 1;
      lag := lag + 1;
   end loop;
   L.zenbakiak(pos) := zenb;

   return(L);
end txertatu_posizioan;

