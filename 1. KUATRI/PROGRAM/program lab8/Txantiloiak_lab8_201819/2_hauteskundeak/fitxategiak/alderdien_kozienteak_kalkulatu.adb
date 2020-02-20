with Motak;
use Motak;


procedure alderdien_kozienteak_kalkulatu ( Alderdia : in out T_koziente_alderdi_politikoa ) is
   -- Aurre: Alderdia aldagaiak, aurreneko posizioan, alderdiari dagokion kozienteak izango ditu.
   -- Post: i guztietarako 2 eta kop_aulki artean, Alderdi(i)=Alderdi(1)/i.


begin
   Alderdia(1).max_da:= false;
   for I in 2 .. Kop_aulki loop
      Alderdia(I).Koziente := Alderdia(1).Koziente / I;
      Alderdia(I).max_da:= false;

   end loop;

end alderdien_kozienteak_kalkulatu;
