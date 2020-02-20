with Ada.Text_Io, datuak;
with sortu_zerrenda_hutsa, idatzi, txertatu_hasieran, listen_ebakidura;
use Ada.Text_Io, datuak;

procedure prueba_listen_ebakidura is 

   Lis1, Lis2 : Lista; 

   procedure return_eskatu is 
   begin
      put_line("return-i eman jarraitzeko ");
      skip_line;
   end return_eskatu;
   
begin -- programa nagusia
   -- Casos de prueba:
   --   1. Dos listas vacias. 
   --   2. Una lista vacia y la otra no. 
   --   3. Listas de un solo elemento que es comun. 
   --   4. Listas de un solo elemento que es distinto. 
   --   5. Listas de varios elementos. 
   --           5.1. Listas de varios elementos. Elementos comunes
   --           5.2. Listas de varios elementos. Elementos disjuntos
   
   put_line("Proba programa: ");
   put_line("*********");

   sortu_zerrenda_hutsa(Lis1);
   sortu_zerrenda_hutsa(Lis2);
   put_line("Proba kasua 1: Zerrenda hutsak ");
   put_line("Hasierako zerrendak: ");
   idatzi(Lis1);
   idatzi(Lis2);
   put_line("Honakoa idatzi beharko luke: zerrenda hutsa: ");
   idatzi(listen_ebakidura(Lis1, Lis2));
   new_line;
   new_line;
   return_eskatu;

   sortu_zerrenda_hutsa(Lis1);
   sortu_zerrenda_hutsa(Lis2);
   txertatu_hasieran(Lis1, 3);
   txertatu_hasieran(Lis1, 5);
   put_line("Proba kasua 2: Zerrenda bat hutsa. ");
   put_line("Hasierako zerrendak: ");
   idatzi(Lis1);
   idatzi(Lis2);
   put_line("Honakoa idatzi beharko luke: zerrenda hutsa: ");
   idatzi(listen_ebakidura(Lis1, Lis2));
   new_line;
   new_line;
   return_eskatu;

   sortu_zerrenda_hutsa(Lis1);
   sortu_zerrenda_hutsa(Lis2);
   txertatu_hasieran(Lis1, 3);
   txertatu_hasieran(Lis2, 3);
   put_line("Proba kasua 3: Elementu bakarreko zerrendak, berdina izanik. ");
   put_line("Hasierako zerrendak: ");
   idatzi(Lis1);
   idatzi(Lis2);
   put_line("Honakoa idatzi beharko luke: <3> ");
   idatzi(listen_ebakidura(Lis1, Lis2));
   new_line;
   new_line;
   return_eskatu;

   sortu_zerrenda_hutsa(Lis1);
   sortu_zerrenda_hutsa(Lis2);
   txertatu_hasieran(Lis1, 3);
   txertatu_hasieran(Lis2, 5);
   put_line("Proba kasua 4: Elementu bakarreko zerrendak, ezberdina izanik. ");
   put_line("Hasierako zerrendak: ");
   idatzi(Lis1);
   idatzi(Lis2);
   put_line("Honakoa idatzi beharko luke: zerrenda hutsa ");
   idatzi(listen_ebakidura(Lis1, Lis2));
   new_line;
   new_line;
   return_eskatu;

   sortu_zerrenda_hutsa(Lis1);
   sortu_zerrenda_hutsa(Lis2);
   txertatu_hasieran(Lis1, 3);
   txertatu_hasieran(Lis1, 5);
   txertatu_hasieran(Lis1, 7);
   txertatu_hasieran(Lis1, 9);
   txertatu_hasieran(Lis2, 5);
   txertatu_hasieran(Lis2, 9);
   put_line("Proba kasua 5.1: Hainbat elementutako zerrendak. Elementu amankomunak. ");
   put_line("Hasierako zerrendak: ");
   idatzi(Lis1);
   idatzi(Lis2);
   put_line("Honakoa idatzi beharko luke: <9, 5> ");
   idatzi(listen_ebakidura(Lis1, Lis2));
   new_line;
   new_line;
   return_eskatu;

   sortu_zerrenda_hutsa(Lis1);
   sortu_zerrenda_hutsa(Lis2);
   txertatu_hasieran(Lis1, 3);
   txertatu_hasieran(Lis1, 5);
   txertatu_hasieran(Lis1, 7);
   txertatu_hasieran(Lis1, 9);
   txertatu_hasieran(Lis2, 11);
   txertatu_hasieran(Lis2, 13);
   put_line("Proba kasua 5.2: Hainbat elementuko zerrendak. Elementu disjuntuak. ");
   put_line("Hasierako zerrendak: ");
   idatzi(Lis1);
   idatzi(Lis2);
   put_line("Honakoa idatzi beharko luke: zerrenda hutsa ");
   idatzi(listen_ebakidura(Lis1, Lis2));
   new_line;
   new_line;
   return_eskatu;

   put_line("Amaitu da!! Agur ");

end prueba_listen_ebakidura;


