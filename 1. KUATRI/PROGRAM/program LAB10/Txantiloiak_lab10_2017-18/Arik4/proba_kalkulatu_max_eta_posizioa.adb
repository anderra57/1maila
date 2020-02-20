with Ada.Text_Io, Ada.Integer_Text_Io, datuak;
with sortu_zerrenda_hutsa, txertatu_hasieran, idatzi, kalkulatu_max_eta_posizioa;
use Ada.Text_Io, Ada.Integer_Text_Io, datuak;


procedure proba_kalkulatu_max_eta_posizioa is 

   Lis : Lista; 
   Maximo, Posizioa: Integer;
   
   procedure return_eskatu is 
   begin
      put_line("return-i emean jarraitzeko ");
      skip_line;
   end return_eskatu;

begin -- programa nagusia
   -- proba kasuak:
   --   1. Zerrenda hutsa. Resultado: cero
   --   2. Zerrenda ez hutsa. Elementu bakarreko zerrenda
   --   3. Zerrenda ez hutsa. Hainbat elementu
   --         3.1. Maximoa hasieran
   --         3.2. Maximoa erdian
   --         3.3. Maximoa bukaeran
   
   put_line("Proba programa: ");
   put_line("*********");

   sortu_zerrenda_hutsa(Lis);
   put_line("Proba kasua  1: Zerrenda hutsa ");
   put_line("Orain honakoa idatzi beharko luke cero: ");
   kalkulatu_max_eta_posizioa(Lis, Maximo, Posizioa);
   put("Maximo: "); put(Maximo); put(" Posizioa: "); put(Posizioa);
   new_line;
   new_line;
   return_eskatu;

   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 4);
   put_line("Proba kasua  2: lista de un solo elemento.");
   put_line("Hasierako zerrenda: ");
   idatzi(Lis);
   put_line("Orain honakoa idatzi beharko luke 4, 1: ");
   kalkulatu_max_eta_posizioa(Lis, Maximo, Posizioa);
   put("Maximo: "); put(Maximo); put(" Posizioa: "); put(Posizioa);
   new_line;
   new_line;
   return_eskatu;

   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 6);
   txertatu_hasieran(Lis, 8);
   txertatu_hasieran(Lis, 9);
   txertatu_hasieran(Lis, 10);
   put_line("Proba kasua  3.1: lista de Hainbat elementu. Maximoa hasieran");
   put_line("Hasierako zerrenda: ");
   idatzi(Lis);
   put_line("Orain honakoa idatzi beharko luke 10, 1: ");
   kalkulatu_max_eta_posizioa(Lis, Maximo, Posizioa);
   put("Maximo: "); put(Maximo); put(" Posizioa: "); put(Posizioa);
   new_line;
   new_line;
   return_eskatu;

   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 8);
   txertatu_hasieran(Lis, 9);
   txertatu_hasieran(Lis, 10);
   txertatu_hasieran(Lis, 6);
   put_line("Proba kasua  3.2: Hainbat elementu. Maximoa erdian");
   put_line("Hasierako zerrenda: ");
   idatzi(Lis);
   put_line("Orain honakoa idatzi beharko luke 10, 2: ");
   kalkulatu_max_eta_posizioa(Lis, Maximo, Posizioa);
   put("Maximo: "); put(Maximo); put(" Posizioa: "); put(Posizioa);
   new_line;
   new_line;
   return_eskatu;

   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 10);
   txertatu_hasieran(Lis, 6);
   txertatu_hasieran(Lis, 8);
   txertatu_hasieran(Lis, 9);
   put_line("Proba kasua  3.3: Hainbat elementu. Maximoa bukaeran");
   put_line("Hasierako zerrenda: ");
   idatzi(Lis);
   put_line("Orain honakao idatzi beharko luke 10, 4: ");
   kalkulatu_max_eta_posizioa(Lis, Maximo, Posizioa);
   put("Maximo: "); put(Maximo); put(" Posizioa: "); put(Posizioa);
   new_line;
   new_line;
   return_eskatu;

   put_line("Bukatu da proba. Agur ");
   
end proba_kalkulatu_max_eta_posizioa;


