with Ada.Text_Io, Ada.Integer_Text_Io;
use Ada.Text_Io, Ada.Integer_Text_Io;
with def_datuak; use def_datuak;

with badago;

function errepikatuak_ezabatu (
      Lista_originala     : in     osokoen_zerrenda) return osokoen_zerrenda is
   -- aurre:
   -- post: Lista_emaitza barnean Lista_Originala
     -- barne.0ko zenbakiak izango ditu errepikapenik gabe
   ind_em:integer:=1;
   x:integer;
   Lista_emaitza:osokoen_zerrenda;
begin

   for ind_or in 1..Lista_originala.zenbat loop
	  x:=Lista_originala.zenbakiak(ind_or);
	  if not Badago(x,Lista_emaitza) then
	     Lista_emaitza.zenbakiak(ind_em):=x;
	     ind_em:=ind_em+1;
	     Lista_emaitza.zenbat:=ind_em;
	  end if;
   end loop;
   return (Lista_emaitza);
end errepikatuak_ezabatu;

