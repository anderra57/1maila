with Ada.Text_Io, datuak;
with sortu_zerrenda_hutsa, txertatu_hasieran, idatzi, ezabatu_agerpen_guztiak;
use Ada.Text_Io, datuak;

procedure prueba_ezabatu_agerpen_guztiak is 

   Lis : Lista; -- variable del programa principal  

   procedure return_eskatu is 
   begin
      put_line("pulsa return para continuar ");
      skip_line;
   end return_eskatu;

begin -- programa principal
   -- Casos de prueba:
   --   1. Eliminar en la lista vacia. Resultado: lista vacia
   --   2. Eliminar en lista no vacia.
   --      2.1 Un elemento que no esta en la lista. Resultado: lista inicial
   --      2.2 Eliminar un elemento que si esta en la lista
   --           2.2.1 Lista de un solo elemento. Resultado: lista vacia
   --           2.2.2 Lista de mas de un elemento. Eliminar en el medio.
   --           2.2.3 Lista de mas de un elemento. Eliminar el ultimo.
   --           2.2.4 Lista de mas de un elemento. El valor aparece en 
   --                                              sitios diferentes.
   --           2.2.5 Lista de mas de un elemento. Todos los elementos 
   --                                              iguales.

   put_line("Proba programa: ");
   put_line("*********");

   sortu_zerrenda_hutsa(Lis);
   put_line("Proba kasua 1: zerrenda hutsa ");
   ezabatu_agerpen_guztiak(Lis, 5);
   put_line("Honakoa idatzi beharko luke: zerrenda hutsa: ");
   idatzi(Lis);
   new_line;
   new_line;
   return_eskatu;

   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 4);
   txertatu_hasieran(Lis, 9);
   txertatu_hasieran(Lis, 7);
   txertatu_hasieran(Lis, 5);
   put_line("Proba kasua 2.1: balioa ez dago zerrendan.");
   put_line("Deia: ezabatu_agerpen_guztiak(Lis, 8)");
   put_line("Hasierako zerrenda ");
   idatzi(Lis);
   ezabatu_agerpen_guztiak(Lis, 8);
   put_line("Honakoa idatzi beharko luke: <5, 7, 9, 4> ");
   idatzi(Lis);
   new_line;
   new_line;
   return_eskatu;

   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 8);
   put_line("Proba kasua 2.2.1: Balioa zerrendan dago. ");
   put_line("Elementu bakarra zerrendan");
   put_line("Deia: ezabatu_agerpen_guztiak(Lis, 8)");
   put_line("Hasierako zerrenda ");
   idatzi(Lis);
   ezabatu_agerpen_guztiak(Lis, 8);
   put_line("Honakoa idatzi beharko luke: zerrenda hutsa: ");
   idatzi(Lis);
   new_line;
   new_line;
   return_eskatu;

   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 8);
   txertatu_hasieran(Lis, 10);
   txertatu_hasieran(Lis, 12);
   put_line("Proba kasua 2.2.2: Balioa zerrendan dago.");
   put_line("    Elementu bat baino gehiagoko zerrenda. Erdikoa ezabatu.");
   put_line("Deia: ezabatu_agerpen_guztiak(Lis, 10)");
   put_line("Hasierako zerrenda ");
   idatzi(Lis);
   ezabatu_agerpen_guztiak(Lis, 10);
   put_line("Honakoa idatzi beharko luke: <12, 8> ");
   idatzi(Lis);
   new_line;
   new_line;
   return_eskatu;

   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 12);
   txertatu_hasieran(Lis, 10);
   txertatu_hasieran(Lis, 8);
   put_line("Proba kasua 2.2.3: Balioa zerrendan dago.");
   put_line("   Elementu bat baino gehiagoko zerrenda. Azkena ezabatu.");
   put_line("Deia: ezabatu_agerpen_guztiak(Lis, 12)");
   put_line("Hasierako zerrenda ");
   idatzi(Lis);
   ezabatu_agerpen_guztiak(Lis, 12);
   put_line("Honakoa idatzi beharko luke: <8, 10> ");
   idatzi(Lis);
   new_line;
   new_line;
   return_eskatu;

   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 8);
   txertatu_hasieran(Lis, 10);
   txertatu_hasieran(Lis, 12);
   txertatu_hasieran(Lis, 12);
   txertatu_hasieran(Lis, 7);
   txertatu_hasieran(Lis, 9);
   txertatu_hasieran(Lis, 9);
   txertatu_hasieran(Lis, 12);
   put_line("Proba kasua 2.2.4: Balioa zerrendan dago.");
   put_line("    Elementu bat baino gehiagoko zerrenda. Balio errepikatua");
   put_line("Deia: ezabatu_agerpen_guztiak(Lis, 12)");
   put_line("Hasierako zerrenda ");
   idatzi(Lis);
   ezabatu_agerpen_guztiak(Lis, 12);
   put_line("Honakoa idatzi beharko luke: <9, 9, 7, 10, 8> ");
   idatzi(Lis);
   new_line;
   new_line;
   return_eskatu;

   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 12);
   txertatu_hasieran(Lis, 12);
   txertatu_hasieran(Lis, 12);
   put_line("Proba kasua 2.2.5: Balioa zerrendan dago.");
   put_line("   Hainbat elementudun zerrenda. ");
   put_line("  Zerrendako elementu guztiak berdinak");
   put_line("Deia: ezabatu_agerpen_guztiak(Lis, 12)");
   put_line("Hasierako zerrenda ");
   idatzi(Lis);
   ezabatu_agerpen_guztiak(Lis, 12);
   put_line("Honakoa idatzi beharko luke: zerrenda hutsa: ");
   idatzi(Lis);
   new_line;
   new_line;
   return_eskatu;

   put_line("Amaitu da! Agur ");
   
end prueba_ezabatu_agerpen_guztiak;


