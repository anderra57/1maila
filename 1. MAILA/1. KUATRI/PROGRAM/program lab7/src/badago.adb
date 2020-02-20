with Ada.Text_Io, Ada.Integer_Text_Io;
use Ada.Text_Io, Ada.Integer_Text_Io;
with def_datuak; use def_datuak;

function badago (
      N        : in     Integer;
      L        : in     osokoen_zerrenda)
  return Boolean is
   -- aurrebaldintza:
   -- post: emaitza TRUE da N Ln badago, FALSE bestela
   kont:integer:=1;
   emaitza:boolean:=False;
begin

   put("BADAGO barruan, zerrendak ZENBAT elementu dituen: ");
   put(L.zenbat);
   new_line;
   loop exit when kont > L.zenbat or emaitza;
      if (L.zenbakiak(kont)=N) then
	     emaitza:=True;
      end if;
         kont:=kont+1;
   end loop;
   return(emaitza);

end badago;

