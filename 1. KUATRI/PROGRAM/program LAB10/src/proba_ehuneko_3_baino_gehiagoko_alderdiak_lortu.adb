with motak;
use motak;

with Ada.Text_Io;
use Ada.Text_Io;


with ehuneko_3_baino_gehiagoko_alderdiak_lortu, alderdien_botoen_lista_idatzi;
with sortu_1kasuko_alderdien_botoen_lista;


procedure proba_ehuneko_3_baino_gehiagoko_alderdiak_lortu is

   procedure eskatu_return is
   begin
      Put_Line("sakatu return jarraitzeko");
      Skip_Line;
   end eskatu_return;



   L_P_V_originala,L_P_handiago_3 : T_lista_alderdien_botoak;

begin
   Put_Line("1. Kasua -> soilik alderdi batek lortu du %3 baino gehigo. ");
   Put_Line("zuen programak soilik alderdi1 idatzi beharko luke. ");
   New_Line(2);
   Put("botoen zenbaketen lista: ");
   new_line;
   sortu_1kasuko_alderdien_botoen_lista(L_P_V_Originala);
   alderdien_botoen_lista_idatzi(L_P_V_Originala);
   Put("zuen programaren iritziz, %3 baino gehigo lortu duen alderdia: ");
   new_line;
   ehuneko_3_baino_gehiagoko_alderdiak_lortu(L_P_V_originala, L_P_handiago_3);
   alderdien_botoen_lista_idatzi(L_P_handiago_3);
   eskatu_return;
   new_line(10);



   --- L_P_V_originala aldatuko dugu. Oraingoan, %3 boto baino gehiago lortu dituzten alderdiak 3 izango dira.
   L_P_V_originala.Alderdien_taula(2) := ("       alderdi2", 80141);
   L_P_V_Originala.Alderdien_taula(3) := ("       alderdi3", 68103);

   --- Probatzen dugu:

   Put_Line("2. kasua -> 3 alderdik lortu dute %3 baino gehigo. ");
   Put_Line("zuen programak, alderdi1, alderdi2 eta alderdi3 idatzi beharko lituzke.");
   New_Line(2);
   Put("botoen zenbaketen lista originala: ");
   new_line;
   alderdien_botoen_lista_idatzi(L_P_V_Originala);
   Put("zuen programaren iritziz, %3 baino gehigo lortu duten alderdiak: ");
   new_line;
   ehuneko_3_baino_gehiagoko_alderdiak_lortu(L_P_V_originala, L_P_handiago_3);
   alderdien_botoen_lista_idatzi(L_P_handiago_3);
   eskatu_return;
   new_line(10);



   ---  L_P_V_originala aldatuko dugu. Oraingoan, %3 boto baino gehiago lortu dituzten alderdiak guztiak izango dira
   L_P_V_originala.Alderdien_taula(2) := ("       alderdi2", 100141);
   L_P_V_Originala.Alderdien_taula(3) := ("       alderdi3", 100103);
   L_P_V_originala.Alderdien_taula(4) := ("       alderdi4", 98141);
   L_P_V_originala.Alderdien_taula(5) := ("       alderdi5", 89103);
   L_P_V_originala.Alderdien_taula(6) := ("       alderdi6", 80141);
   L_P_V_originala.Alderdien_taula(7) := ("       alderdi7", 79100);
   L_P_V_originala.Alderdien_taula(8) := ("       alderdi8", 78103);

   --- Probatzen dugu:

   Put_Line("3. kasua -> Alderdi guztiek lortu dute %3 baino gehigo. ");
   Put_Line("zuen programak, alderdi1, alderdi2, alderdi3, alderdi4, alderdi5, alderdi6, alderdi7 eta alderdi8 idatzi beharko lituzke.");
   New_Line(2);
   Put("botoen zenbaketen lista originala: ");
   new_line;
   alderdien_botoen_lista_idatzi(L_P_V_Originala);
   Put("zuen programaren iritziz, %3 baino gehigo lortu duten alderdiak: ");
   new_line;
   ehuneko_3_baino_gehiagoko_alderdiak_lortu(L_P_V_originala, L_P_handiago_3);
   alderdien_botoen_lista_idatzi(L_P_handiago_3);
   eskatu_return;

end proba_ehuneko_3_baino_gehiagoko_alderdiak_lortu;
