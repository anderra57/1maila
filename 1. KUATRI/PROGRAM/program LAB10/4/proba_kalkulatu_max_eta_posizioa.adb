with Ada.Text_Io, Ada.Integer_Text_Io, Datuak;

with sortu_zerrenda_hutsa, txertatu_hasieran, Idatzi, kalkulatu_max_eta_posizioa;

use Datuak;
use Ada.Text_Io, Ada.Integer_Text_Io;


procedure proba_kalkulatu_max_eta_posizioa is


   Lis : Lista; -- variable del programa principal
   Maximoa, Posizioa: Integer;


   procedure Pedir_Return is
   begin
      Put_Line("pulsa return para continuar ");
      Skip_Line;
   end Pedir_Return;

begin -- programa principal
   -- Casos de prueba:
   --   1. Lista vacia. Resultado: cero
   --   2. Lista no vacia. Lista de un elemento
   --   3. Lista no vacia. Varios elementos
   --         3.1. El Maximoa al comienzo
   --         3.2. El Maximoa en medio
   --         3.3. El Maximoa al final

   Put_Line("Proba programa:");
   Put_Line("*********");

   sortu_zerrenda_hutsa(Lis);
   Put_Line("Proba kasua 1: Lista hutsa ");
   Put_Line("Zero idatzi beharko zuen: ");
   kalkulatu_max_eta_posizioa(Lis, Maximoa, Posizioa);
   Put("Maximoa: "); Put(Maximoa); Put(" Posizioa: "); Put(Posizioa);
   New_Line;
   New_Line;
   Pedir_Return;

   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 4);
   Put_Line("Proba kasua 2: Elementu bakarreko lista.");
   Put_Line("Hasierako lista hurrengoa da: ");
   idatzi(Lis);
   Put_Line("Idatzi beharko zuen 4, 1: ");
   kalkulatu_max_eta_posizioa(Lis, Maximoa, Posizioa);
   Put("Maximoa: "); Put(Maximoa); Put(" Posizioa: "); Put(Posizioa);
   New_Line;
   New_Line;
   Pedir_Return;


   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 6);
   txertatu_hasieran(Lis, 8);
   txertatu_hasieran(Lis, 9);
   txertatu_hasieran(Lis, 10);
   Put_Line("Proba kasua 3.1: Hainbat elementutako lista. Maximoa al comienzo");
   Put_Line("Hasierako lista hurrengoa da: ");
   idatzi(Lis);
   Put_Line("Idatzi beharko zuen 10, 1: ");
   kalkulatu_max_eta_posizioa(Lis, Maximoa, Posizioa);
   Put("Maximoa: "); Put(Maximoa); Put(" Posizioa: "); Put(Posizioa);
   New_Line;
   New_Line;
   Pedir_Return;


   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 8);
   txertatu_hasieran(Lis, 9);
   txertatu_hasieran(Lis, 10);
   txertatu_hasieran(Lis, 6);
   Put_Line("Proba kasua 3.2: Hainbat elementutako lista. Maximoa en medio");
   Put_Line("Hasierako lista hurrengoa da: ");
   idatzi(Lis);
   Put_Line("Idatzi beharko zuen 10, 2: ");
   kalkulatu_max_eta_posizioa(Lis, Maximoa, Posizioa);
   Put("Maximoa: "); Put(Maximoa); Put(" Posizioa: "); Put(Posizioa);
   New_Line;
   New_Line;
   Pedir_Return;


   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 10);
   txertatu_hasieran(Lis, 6);
   txertatu_hasieran(Lis, 8);
   txertatu_hasieran(Lis, 9);
   Put_Line("Proba kasua 3.3: Hainbat elementutako lista. Maximoa amaieran");
   Put_Line("Hasierako lista hurrengoa da: ");
   idatzi(Lis);
   Put_Line("Idatzi beharko zuen 10, 4: ");
   kalkulatu_max_eta_posizioa(Lis, Maximoa, Posizioa);
   Put("Maximoa: "); Put(Maximoa); Put(" Posizioa: "); Put(Posizioa);
   New_Line;
   New_Line;
   Pedir_Return;


   Put_Line("Proba amaitu da. Agur ");
end proba_kalkulatu_max_eta_posizioa;


