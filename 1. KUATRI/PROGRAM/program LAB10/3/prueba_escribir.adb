with Ada.Text_Io, Datuak;

with sortu_zerrenda_hutsa, Ins, Escribir;

use Datuak;
use Ada.Text_Io;


procedure Prueba_Escribir is


   Lis : Lista; -- variable del programa principal


   procedure Pedir_Return is
   begin
      Put_Line("pulsa return para continuar ");
      Skip_Line;
   end Pedir_Return;

begin -- programa principal
   -- Casos de prueba:
   --   1. Lista vacia.
   --   2. Lista no vacia. Lista de un elemento
   --   3. Lista no vacia. Varios elementos

   Put_Line("Programa de prueba: ");
   Put_Line("*********");

   sortu_zerrenda_hutsa(Lis);
   Put_Line("Caso de prueba 1: Lista vacia ");
   Put_Line("Ahora deberia escribir la lista vacia: ");
   Escribir(Lis);
   New_Line;
   New_Line;
   Pedir_Return;

   sortu_zerrenda_hutsa(Lis);
   Ins(Lis, 4);
   Put_Line("Caso de prueba 2: lista de un solo elemento.");
   Put_Line("La lista contiene <4>");
   Escribir(Lis);
   New_Line;
   New_Line;
   Pedir_Return;


   sortu_zerrenda_hutsa(Lis);
   Ins(Lis, 6);
   Ins(Lis, 8);
   Ins(Lis, 9);
   Ins(Lis, 10);
   Put_Line("Caso de prueba 3: lista de varios elementos.");
   Put_Line("La lista contiene <10, 9, 8, 6>");
   Escribir(Lis);
   New_Line;
   New_Line;
   Pedir_Return;

   Put_Line("Se acabo la prueba. Agur ");
end Prueba_Escribir;


