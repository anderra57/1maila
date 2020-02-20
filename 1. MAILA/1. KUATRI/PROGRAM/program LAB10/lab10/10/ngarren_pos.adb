with Ada.Text_Io, Datos;
use Datos;
procedure insertar_en_la_posicion_nsima (L: in out Lista ; Num , Pos : in Integer) is

k:integer;
aux1: Lista;      
aux2: Lista;
Begin
k:=1;
aux1:=L;
    loop exit when k=pos;
        aux2:=aux1;
        aux1:=aux1.Sig;
        k:=k+1;
    end loop;
    if (aux2=null) then
        aux1:=new Nodo;
        aux1.Info:=Num;
        aux1.Sig:=L;
        L:=aux1;
    else
        aux1:=new Nodo;
        aux1.info:=Num;
        aux1.Sig:=aux2.Sig;
        aux2.Sig:=aux1;    
    end if;
                       
end insertar_en_la_posicion_nsima;