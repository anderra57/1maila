with bektoreak; use bektoreak;

function Eskuinera_mugitu (Z: in Osokoen_Bektorea) return Osokoen_Bektorea is
   -- aurre: Array-a informazio esanguratsuz betea dago
   -- post: Elementu guztiak eskuinera mugitzen dira eta azken
   --       elementua lehen elementua izatera pasatzen da

ZZ: Osokoen_Bektorea(1..10);
lag, i:integer;
begin
   ZZ:=Z;
   i:=1;
   lag:=Z(10);
   for i in reverse 1..9 loop
      ZZ(i+1):= ZZ(i);
   end loop;
   ZZ(1):=lag;
return (ZZ);
end Eskuinera_mugitu;