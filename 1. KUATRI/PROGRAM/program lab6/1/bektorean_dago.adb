with bektoreak;
use bektoreak;

function bektorean_dago (N: in integer; bektore1:in Osokoen_Bektorea) return boolean is
   -- aurre: V bektoreak gutxienez elementu bat dauka (V'Last >= 1)
   -- eta elementuek ez du inongo ordenik jarraitzen
   -- post: emaitza True izango da N balioa V-n baldin badago, eta False bestela
   kont:integer:=1;
   emaitza:boolean:=False;
begin

   loop exit when kont > bektore1'last or emaitza;
      if (bektore1(kont)=N) then
         emaitza:=True;
	  end if;
      kont:=kont+1;
   end loop;
   return(emaitza);
end bektorean_dago;

