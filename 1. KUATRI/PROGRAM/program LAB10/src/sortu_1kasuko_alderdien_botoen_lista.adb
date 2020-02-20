with motak;
use motak;

procedure sortu_1kasuko_alderdien_botoen_lista (
     L_P_V : out     T_lista_alderdien_botoak) is
   -- Aurre: -
   -- Post: L_P_V aldagaian, alderdien kozienteak izango ditugu.

begin
   L_P_V.Alderdi_kop:=8;
   --Egitura bi modu desberdinetara beteko dugu, zuek ikusteko nola egiten den.
   -- T_lista_alderdien_botoak erregistroko elementuak banan banan beteaz (Lehenik izena eta ondoren botoak)
                                      
   L_P_V.Alderdien_taula(1).izena := "       alderdi1"; -- !15 karaktere!
   L_P_V.Alderdien_taula(1).Botoak  := 1802959;
   L_P_V.Alderdien_taula(2).izena := "       alderdi2";
   L_P_V.Alderdien_taula(2).Botoak  := 40202;
   L_P_V.Alderdien_taula(3).izena := "       alderdi3";
   L_P_V.Alderdien_taula(3).Botoak  := 38192;

   --Erregistro guztia batera:
   L_P_V.Alderdien_taula(4) := ("       alderdi4", 28141);
   L_P_V.Alderdien_taula(5) := ("       alderdi5", 20103);
   L_P_V.Alderdien_taula(6) := ("       alderdi6", 20101);
   L_P_V.Alderdien_taula(7) := ("       alderdi7", 28101);
   L_P_V.Alderdien_taula(8) := ("       alderdi8", 28100);

end sortu_1kasuko_alderdien_botoen_lista;
