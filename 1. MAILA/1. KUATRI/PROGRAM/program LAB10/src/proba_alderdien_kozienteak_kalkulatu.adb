with motak;
use motak;

with Ada.Text_Io;
use Ada.Text_Io;


with alderdien_kozienteen_taula_idatzi;
with botoak_banatu, alderdien_kozienteak_kalkulatu;


procedure proba_alderdien_kozienteak_kalkulatu is


   L_P_V_Originala : T_Lista_alderdien_botoak;
   T_Dhont:T_Taula_Dhont ;

begin
   --1 kasua: alderdi bakarrez beteko dugu alderdien taula
   L_P_V_Originala.Alderdi_kop:=1;
   L_P_V_Originala.Alderdien_taula(1) := ("       alderdi1", 80141);
   botoak_banatu (L_P_V_Originala,T_Dhont);
   Put("Eta zuen programak dio une honetan Dhont-en listak duela: ");
   New_Line;
   alderdien_kozienteak_kalkulatu(T_Dhont.taula_Dhont(1));
   alderdien_kozienteen_taula_idatzi(T_Dhont.taula_Dhont(1));                                                 new_line(4);
end proba_alderdien_kozienteak_kalkulatu;
