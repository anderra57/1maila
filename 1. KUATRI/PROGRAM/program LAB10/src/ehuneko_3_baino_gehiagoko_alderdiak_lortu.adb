with motak;
use motak;

procedure ehuneko_3_baino_gehiagoko_alderdiak_lortu (
      L_P         : in     T_Lista_alderdien_botoak;
      L_P_3_edo_gehigo :    out T_Lista_alderdien_botoak  ) is
   --Aurre: L_P aldagaiak, alderdi guztiek lortu dituzten botoen informazioa edukiko du, orden beherakorrean egonaz.
   --       Taula beteta egongo da, Max_kop_alderdi_politiko arte.
   --Post: L_P_3_edo_gehigo aldagaiak, L_P-ko informazio berbera izango du baina soilik guztira %3 boto baino gehiago
   --      lortu duten alderdienak.

   function botoak_guztira (
         L_P : in     T_Lista_alderdien_botoak )
     return Integer is
      -- Aurre:
      -- Post: emaitza, alderdi guztiak kontutan izanik lortu diren boto kopurua totala izango da.
      guztira : Integer;

   begin
      guztira := 0;
      for I in 1 .. L_P.Alderdi_kop loop
         guztira := guztira + L_P.Alderdien_taula(I).botoak;
      end loop;

      return guztira;
   end botoak_guztira;


   Porcentaje : Float;
   guztira      : Integer;

begin
   guztira := botoak_guztira (L_P);
   L_P_3_edo_gehigo.Alderdi_kop := 0;

   for I in 1 .. L_P.Alderdi_kop loop
      Porcentaje :=  (Float(L_P.Alderdien_taula(I).botoak) / Float(guztira))*100.0;
      if Porcentaje > 3.0 then
         L_P_3_edo_gehigo.Alderdi_kop := L_P_3_edo_gehigo.Alderdi_kop + 1;
         L_P_3_edo_gehigo.Alderdien_taula(L_P_3_edo_gehigo.Alderdi_kop) := L_P.Alderdien_taula(I);
      end if;

   end loop;

end ehuneko_3_baino_gehiagoko_alderdiak_lortu;

