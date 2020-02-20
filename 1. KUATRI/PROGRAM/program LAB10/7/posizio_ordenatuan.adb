
with Datuak;
use Datuak;



function posizio_ordenatuan (
                                 L   : Lista;
                                 N : Integer)
                                 return Natural is
   -- aurre: Lista ez du zertan ordenatuta egon behar
   -- post: N-en lehenengo agerpenaren posizioa bueltatu. N listan ez balego bueltatu 0
   Badago: Boolean;
   Orain: Lista;
   kont, Pos : Integer;
begin
   Orain := L;
   Badago := False;
   Pos := 1;
   kont := 0;
   loop exit when( (Orain = null) or else (Orain.Info > N) or else (Badago) );
      kont := kont + 1;
      if (Orain.Info = N) then
	     Badago := True;
	     Pos := kont;
      else
	     Pos := kont + 1;
      end if;
      Orain := Orain.Hurrengoa;
   end loop;

   if Badago=False then
      Pos:=0;
   end if;
return(Pos);
end posizio_ordenatuan;


