with Datuak;
use Datuak;
procedure txertatu_ngarren_pos (L: in out Lista ; Num , Pos : in Integer) is

kont: integer;
lag1: Lista;
lag2: Lista;
Begin
kont:=1;
lag1:=L;
    loop exit when kont=pos;
        lag2:=lag1;
        lag1:=lag1.Hurrengoa;
        kont:=kont+1;
   end loop;

    if (lag2=null) then
        lag1:=new Nodo;
        lag1.Info:=Num;
        lag1.Hurrengoa:=L;
        L:=lag1;
    else
        lag1:=new Nodo;
        lag1.info:=Num;
        lag1.Hurrengoa:=lag2.Hurrengoa;
        lag2.Hurrengoa:=lag1;
    end if;

end txertatu_ngarren_pos;