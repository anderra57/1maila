with Ada.Text_Io, Datuak;
with ada.integer_text_io;
use ada.integer_text_io;

with Sortu_zerrenda_hutsa, Txertatu_bukaeran, posizio_ordenatuan, idatzi;

use Datuak;
use Ada.Text_Io;



procedure proba_bilatu_ordenatuan is


   Lis : Lista;

  procedure Eskatu_Return is
   begin
      Put_Line("Sakatu return jarraitzeko ");
      Skip_Line;
   end Eskatu_Return;

begin -- programa nagusia
   -- Proba kasuak:
   --   1. Lista hutsa. Emaitza 0
   --   2. Lista ez-hutsa. Elementu bakarreko lista
   --         2.1. Bilatzen dugun elementua badago
   --         2.2. Bilatzen dugun elementua ez dago
   --   3. Lista ez-hutsa. Hainbat elementuekin
   --         3.1. Bilatzen dugun elementua hasieran dago
   --         3.2. Bilatzen dugun elementua erdian dago
   --         3.3. Bilatzen dugun elementua bukaeran dago
   --         3.4. Bilatzen dugun elementua ez dago
      --         3.4.1 Bilatzen dugun elementua ez dago eta erdian egon beharko litzateke
      --         3.4.2 Bilatzen dugun elementua ez dago eta bukaeran egon bejarko litzateke

   Sortu_Zerrenda_hutsa(Lis);
   Put_Line("1. Proba kasua: Lista hutsa ");
   Idatzi(Lis);
   Put_Line("Zure programak 0 bat idatzi beharko luke: 4");
   Put(posizio_ordenatuan(Lis,4));
   New_Line;
   New_Line;
   Eskatu_Return;

   Sortu_Zerrenda_hutsa(Lis);
   Txertatu_bukaeran(Lis, 4);
   Put_Line("2.1 Proba kasua: lista elementu bakar batekin (badago). 4");
   Idatzi(Lis);
   Put_Line("Zure programak 1 idatzi beharko luke ");
   Put(posizio_ordenatuan(Lis,4));
   New_Line;
   New_Line;
   Eskatu_Return;


   Sortu_Zerrenda_hutsa(Lis);
   Txertatu_bukaeran(Lis, 5);
   Put_Line("2.2 Proba kasua: lista elementu bakar batekin (Ez dago). 4");
   Idatzi(Lis);
   Put_Line("Zure programak 0 idatzi beharko luke ");
   Put(posizio_ordenatuan(Lis,4));
   New_Line;
   New_Line;
   Eskatu_Return;


   Sortu_Zerrenda_hutsa(Lis);
   Txertatu_bukaeran(Lis, 6);
   Txertatu_bukaeran(Lis, 8);
   Txertatu_bukaeran(Lis, 9);
   Txertatu_bukaeran(Lis, 10);
   Idatzi(Lis);
   Put_Line("3.1 proba kasua: lista hainbat elementuekin. Badago hasieran 10");
   Put_Line("Zure programak 4 idatzi beharko luke ");
   Put(posizio_ordenatuan(Lis,10));
   New_Line;
   New_Line;
   Eskatu_Return;



   Sortu_Zerrenda_hutsa(Lis);
   Txertatu_bukaeran(Lis, 6);
   Txertatu_bukaeran(Lis, 8);
   Txertatu_bukaeran(Lis, 9);
   Txertatu_bukaeran(Lis, 10);
   Idatzi(Lis);
   Put_Line("3.1 proba kasua: lista hainbat elementuekin. Badago erdian 8");
   Put_Line("Zure programak 2 idatzi beharko luke ");
   Put(posizio_ordenatuan(Lis,8));
   New_Line;
   New_Line;
   Eskatu_Return;

   Sortu_Zerrenda_hutsa(Lis);
   Txertatu_bukaeran(Lis, 5);
   Txertatu_bukaeran(Lis, 7);
   Txertatu_bukaeran(Lis, 9);
   Txertatu_bukaeran(Lis, 10);
   Idatzi(Lis);
   Put_Line("3.1 proba kasua: lista hainbat elementuekin. Badago bukaeran 9");
   Put_Line("Zure programak 3 idatzi beharko luke ");
   Put(posizio_ordenatuan(Lis,9));
   New_Line;
   New_Line;
   Eskatu_Return;


   Sortu_Zerrenda_hutsa(Lis);
   Txertatu_bukaeran(Lis, 6);
   Txertatu_bukaeran(Lis, 7);
   Txertatu_bukaeran(Lis, 9);
   Txertatu_bukaeran(Lis, 10);
   Idatzi(Lis);
   Put_Line("3.1 proba kasua: lista hainbat elementuekin. Ez dago 8");
   Put_Line("Zure programak 0 idatzi beharko luke ");
   Put(posizio_ordenatuan(Lis,8));
   New_Line;
   Eskatu_Return;


   Sortu_Zerrenda_hutsa(Lis);
   Txertatu_bukaeran(Lis, 6);
   Txertatu_bukaeran(Lis, 7);
   Txertatu_bukaeran(Lis, 9);
   Txertatu_bukaeran(Lis, 10);
   Idatzi(Lis);
   Put_Line("3.1 proba kasua: lista hainbat elementuekin. Ez dago 11");
   Put_Line("Zure programak 0 idatzi beharko luke ");
   Put(posizio_ordenatuan(Lis,11));
   New_Line;
   Eskatu_Return;

   Put_Line("Amaitu da!!. Agur!! ");
end proba_bilatu_ordenatuan;


