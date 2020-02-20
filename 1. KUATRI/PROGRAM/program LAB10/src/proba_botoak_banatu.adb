with motak;
use motak;

with Ada.Text_Io;
use Ada.Text_Io;


with alderdien_botoen_lista_idatzi, dhont_taula_idatzi, botoak_banatu, koziente_guztiak_kalkulatu, maximoak_esleitu;


procedure proba_botoak_banatu is

   L_P_V_Originala: T_lista_alderdien_botoak;
   T_Dhont:T_Taula_Dhont ;

begin
   L_P_V_Originala.Alderdi_kop:=1;
   L_P_V_Originala.Alderdien_taula(1) := ("       alderdi1", 80141);

   Put_Line("1. kasua -> alderdien taulak soilik alderdi bat. ");
   New_Line;
   Put_Line("eta alderdiaren informazioa honakoa da: ");
    alderdien_botoen_lista_idatzi(L_P_V_Originala);

   Put_Line("horrela bada, Dhont taulan alderdi baten informazioa egongo da. ");
   New_Line;
   botoak_banatu (L_P_V_Originala,T_Dhont);
   Put_Line("eta zuen programak dio D'hont taulan informazio hau dagoela. ");
   New_Line(1);
   dhont_taula_idatzi(L_P_V_Originala,T_Dhont, 1);
   New_Line(4);
   Put_Line("sakatu return jarraitzeko");
   Skip_Line;
   --2 kasua
   --- Orain, L_P_V_originala aldatuko dugu, 5 alderdi gordeaz
   L_P_V_Originala.Alderdi_kop:=5;
   L_P_V_originala.Alderdien_taula(1) := ("       alderdi1", 140141);
   L_P_V_Originala.Alderdien_taula(2) := ("       alderdi2", 128103);
   L_P_V_originala.Alderdien_taula(3) := ("       alderdi3", 100241);
   L_P_V_originala.Alderdien_taula(4) := ("       alderdi4",  60050);
   L_P_V_Originala.Alderdien_taula(5) := ("       alderdi5",  30200);

   ---Eta informazio berriarekin probatuko dugu:

   Put_Line("2. kasua -> taulak 5 alderdien informazioa du. ");
   New_Line;
   Put_Line("eta alderdi horien informazioa honakoa da: ");
   alderdien_botoen_lista_idatzi(L_P_V_Originala);

   Put_Line("horrela bada, Dhont taulak, 5 alderdien informazioa izango du. ");
   New_Line(2);
   botoak_banatu (L_P_V_Originala,T_Dhont);--Dhont taula horrela sortzen da
   Put_Line("horrela bada, Dhont taulak, 5 alderdien informazioa izango du. ");
   dhont_taula_idatzi(L_P_V_Originala,T_Dhont, 1);--L_P_V_Originala beharko dugu, bertan gordetzen baitira alderdien izenak

end proba_botoak_banatu;
