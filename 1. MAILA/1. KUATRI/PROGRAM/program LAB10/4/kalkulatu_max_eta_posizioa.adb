with Datuak;
use Datuak;

procedure kalkulatu_max_eta_posizioa (L: in Lista;  Max, Pos_Max : out Integer ) is
   -- pre:
   -- post: Max contendra el mayor valor de L y Pos_max su posicion
   --       Si L es vacia entonces Pos_Max vale cero

    Oraingoa: Lista;
    kont: Integer;

begin

    Oraingoa := L;
    Pos_Max := 0;
    Max := 0;
    kont := 0;

    loop exit when(Oraingoa = null);

        kont := kont + 1;

        if (Oraingoa.Info > Max) then
            Max := Oraingoa.Info;
            Pos_Max := kont;
        end if;

        Oraingoa := Oraingoa.Hurrengoa;

    end loop;


end kalkulatu_max_eta_posizioa;
