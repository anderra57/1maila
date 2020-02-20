with motak;
use motak;

with Ada.Text_Io;
use Ada.Text_Io;


with alderdien_botoen_lista_idatzi, dhont_taula_idatzi, botoak_banatu;
with koziente_guztiak_kalkulatu, maximoak_esleitu;


procedure proba_maximoak_esleitu is


   L_P_V_Originala : T_lista_alderdien_botoak;
   T_Dhont:T_Taula_Dhont ;

begin
   L_P_V_Originala.Alderdi_kop:=1;
   L_P_V_Originala.Alderdien_taula(1) := ("       alderdi1", 80141);
   botoak_banatu (L_P_V_Originala,T_Dhont);--Dhont taula honela sortzen da
   koziente_guztiak_kalkulatu(T_Dhont);
   maximoak_esleitu(T_Dhont);
   Dhont_taula_idatzi(L_P_V_Originala,T_Dhont,8);--L_P_V_Originala beharko dugu, bertan alderdien izenak gordetzen baitira                                        

   New_Line(4);
   Put_Line("sakatu return jarraitzeko");
   Skip_Line;
   --2 kasua
   --- Orain, L_P_V_originala aldatuko dugu, 5 alderdi izan ditzan
    L_P_V_Originala.Alderdi_kop:=5;
    L_P_V_originala.Alderdien_taula(1) := ("       alderdi1", 140141);
    L_P_V_Originala.Alderdien_taula(2) := ("       alderdi2", 128103);
    L_P_V_originala.Alderdien_taula(3) := ("       alderdi3", 100241);
    L_P_V_originala.Alderdien_taula(4) := ("       alderdi4",  60050);
    L_P_V_Originala.Alderdien_taula(5) := ("       alderdi5",  30200);

   ---Informazio berriarekin probatuko dugu:

   Put_Line("2. kasua -> taulak 5 alderdien informazioa du. ");
   New_Line;
   Put_Line("eta alderdi horien informazioa honakoa da: ");
   alderdien_botoen_lista_idatzi(L_P_V_Originala);

   Put_Line("horrela bada, Dhont taulak, 5 alderdien informazioa izango du. ");
   New_Line(2);
   botoak_banatu (L_P_V_Originala,T_Dhont);--honela sortzen da Dhont taula
   koziente_guztiak_kalkulatu(T_Dhont);
   maximoak_esleitu(T_Dhont);
   dhont_taula_idatzi(L_P_V_Originala,T_Dhont,8);---L_P_V_Originala beharko dugu, bertan gordetzen baitira alderdien izenak.


end proba_maximoak_esleitu;
