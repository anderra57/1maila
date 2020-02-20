with Motak;
use Motak;

with ehuneko_3_baino_gehiagoko_alderdiak_lortu, botoak_banatu, koziente_guztiak_kalkulatu, maximoak_esleitu;

procedure aulkiak_banatu (
      L_P     : in     T_Lista_alderdien_botoak;
      aulkiak :    out T_lista_aulkiak         ) is

-- post: emaitza, alderdi bakoitzaren aulki kopurua izango da (eskainuak). Horretarako, D'Hont aplikatuaz, 25 aulki banatu dira lortutako botoen arabera.


   function zenbat_aulki (
         kozienteak : in     T_koziente_alderdi_politikoa )
     return Integer is
      Total : Integer;

   begin
      Total := 0;
      for J in 1 .. Kop_aulki loop
         if kozienteak(J).Max_da
               then
            Total := Total + 1;
         end if;
      end loop;

      return Total;
   end zenbat_aulki;


   L_P_3_baino_gehio  : T_Lista_alderdien_botoak;
   D_Hont        : T_taula_dhont;
   aulki_kopurua : Integer;

begin
   ehuneko_3_baino_gehiagoko_alderdiak_lortu(L_P, L_P_3_baino_gehio);
   botoak_banatu(L_P_3_baino_gehio, D_Hont);
   koziente_guztiak_kalkulatu(D_Hont);
   maximoak_esleitu(D_Hont);
   aulkiak.Kop_alderdi := 0;

   for I in 1 .. D_Hont.Zenbat_alderdi_politiko loop
      aulki_kopurua := zenbat_aulki(D_Hont.taula_dhont(I));
      if aulki_kopurua > 0
            then
         aulkiak.Kop_alderdi := aulkiak.Kop_alderdi + 1;
         aulkiak.taula_aulkiak(aulkiak.Kop_alderdi).izena  := L_P_3_baino_gehio.Alderdien_taula(I).izena;
         aulkiak.taula_aulkiak(aulkiak.Kop_alderdi).Aulki_kop := aulki_kopurua;
      end if;
   end loop;

end aulkiak_banatu;

