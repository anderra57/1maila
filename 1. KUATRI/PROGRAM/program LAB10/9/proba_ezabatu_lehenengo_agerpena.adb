with Ada.Text_Io, Datuak;
with sortu_zerrenda_hutsa, txertatu_hasieran, idatzi, ezabatu_lehenengo_agerpena;
use Ada.Text_Io, Datuak;

procedure proba_ezabatu_lehenengo_agerpena is

   Lis : Lista; --

   procedure return_eskatu is
   begin
      put_line("Emon return jarraitzeko");
      skip_line;
   end return_eskatu;

begin -- programa nagusia
   -- Proba kasuak:
   --   1. Zerrenda hutsa. Emaitza: zerrenda hutsa
   --   2. Zerrenda ez hutsa
   --      2.1 Zerrendan ez dagoen elementua. Emaitza: hasierako zerrenda
   --      2.2 Zerrendan dagoen elementua ezabatu
   --           2.2.1 Elementu bakarra. Emaitza: zerrenda hutsa
   --           2.2.2 Elementu bat baino gehiago. Erdiko ezabatu
   --           2.2.3 Elementu bat baino gehiago. Bukaerako ezabatu

   put_line("Proba programa: ");
   put_line("*********");

   sortu_zerrenda_hutsa(Lis);
   put_line("Proba kasua 1: Zerrnda hutsa ");
   ezabatu_lehenengo_agerpena(Lis, 5);
   new_line;
   put_line("Orain honakoa idatzi beharko luke:");
   idatzi(Lis);
   new_line;
   return_eskatu;
   new_line;

   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 4);
   txertatu_hasieran(Lis, 9);
   txertatu_hasieran(Lis, 7);
   txertatu_hasieran(Lis, 5);
   put_line("Proba kasua 2.1: ez dago zerrendan.");
   put_line("Deia: ezabatu_lehenengo_agerpena(Lis, 8)");
   put_line("Hasierako zerrenda: ");
   idatzi(Lis);
   new_line;
   ezabatu_lehenengo_agerpena(Lis, 8);
   put_line("Orain honakoa idatzi beharko luke zerrenda <5, 7, 9, 4> ");
   idatzi(Lis);
   new_line;
   return_eskatu;
   new_line;

   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 8);
   put_line("Proba kasua 2.2.1: Balioa zerrendan dago. ");
   put_line("Elementu bakarreko zerrenda");
   put_line("Deia: ezabatu_lehenengo_agerpena(Lis, 8)");
   put_line("Hasierako zerrenda: ");
   idatzi(Lis);
   new_line;
   ezabatu_lehenengo_agerpena(Lis, 8);
   put_line("Orain honakoa idatzi beharko luke zerrenda hutsa dago: ");
   idatzi(Lis);
   new_line;
   return_eskatu;
   new_line;

   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 8);
   txertatu_hasieran(Lis, 10);
   txertatu_hasieran(Lis, 12);
   put_line("Proba kasua 2.2.2: Balioa zerrendan dago.");
   put_line("    Elementu bat baino gehiago. Erdian ezabatu.");
   put_line("Deia: ezabatu_lehenengo_agerpena(Lis, 10)");
   put_line("Hasierako zerrenda: ");
   idatzi(Lis);
   new_line;
   ezabatu_lehenengo_agerpena(Lis, 10);
   put_line("Orain honakoa idatzi beharko luke zerrenda <12, 8> ");
   idatzi(Lis);
   new_line;
   return_eskatu;
   new_line;

   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 12);
   txertatu_hasieran(Lis, 10);
   txertatu_hasieran(Lis, 8);
   put_line("Proba kasua 2.2.3: Balioa zerrendan dago.");
   put_line("   Elementu bat baino gehiago. Azkena ezabatu.");
   put_line("Deia: ezabatu_lehenengo_agerpena(Lis, 12)");
   put_line("Hasierako zerrenda: ");
   idatzi(Lis);
   new_line;
   ezabatu_lehenengo_agerpena(Lis, 12);
   put_line("Orain honakoa idatzi beharko luke zerrenda <8, 10> ");
   idatzi(Lis);
   new_line;
   return_eskatu;
   new_line;

   put_line("Amaitu da!! Agur");

end proba_ezabatu_lehenengo_agerpena;
