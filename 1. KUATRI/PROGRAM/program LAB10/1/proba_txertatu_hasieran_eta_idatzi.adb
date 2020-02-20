with Ada.Text_Io, datuak, sortu_zerrenda_hutsa, txertatu_hasieran, idatzi;
use Ada.Text_Io, datuak;

procedure proba_txertatu_hasieran_eta_idatzi is 

   Lis : Lista; -- variable del programa principal   

   procedure return_eskatu is 
   begin
      put_line("Return sakatu jarraitzeko ");
      skip_line;
   end return_eskatu;

begin -- programa nagusia
   -- Proba kasuak:
   --   1. Zerrenda hutsa. 
   --   2. Zerrenda ez hutsa. Elementu bakarreko zerrenda
   --   3. Zerrenda ez hutsa. Hainbat elementu
   
   put_line("Probetarako programa: ");
   put_line("*********");

   sortu_zerrenda_hutsa(Lis);
   put_line("Proba kasua  1: Zerrenda hutsa ");
   put_line("Orain zerrenda hutsa idatzi beharko luke: ");
   idatzi(Lis);
   new_line;
   new_line;
   return_eskatu;

   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 4);
   put_line("Proba kasua  2: elementu bakarreko zerrenda.");
   put_line("Zerrendak <4> dauka");
   idatzi(Lis);
   new_line;
   new_line;
   return_eskatu;

   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 6);
   txertatu_hasieran(Lis, 8);
   txertatu_hasieran(Lis, 9);
   txertatu_hasieran(Lis, 10);
   put_line("Proba kasua  3: Hainbat elementudun zerrenda.");
   put_line("Zerrendak <10, 9, 8, 6> dauka");
   idatzi(Lis);
   new_line;
   new_line;
   return_eskatu;

   put_line("Proba bukatu da. Agur ");
   
end proba_txertatu_hasieran_eta_idatzi;


