with Ada.Text_Io, Ada.Integer_Text_Io, datuak;
use Ada.Text_Io, Ada.Integer_Text_Io, datuak;
with sortu_zerrenda_hutsa, txertatu_hasieran, idatzi, luzera;

procedure proba_luzera is 

   Lis : Lista; -- programa nagusiaren aldagaia  

   procedure return_eskatu is 
   begin
      put_line("return sakatu jarraitzeko ");
      skip_line;
   end return_eskatu;

begin -- programa principal
   -- Casos de prueba:
   --   1. Zerrenda hutsa. Resultado: cero
   --   2. Zerrenda ez hutsa. Elementu bakarreko zerrenda
   --   3. Zerrenda ez hutsa. Hainbat elementu
   
   put_line("Proba programa: ");
   put_line("*********");

   sortu_zerrenda_hutsa(Lis);
   put_line("Proba kasua  1: Zerrenda hutsa ");
   put_line("0 itzuli beharko luke: ");
   put(luzera(Lis));
   new_line;
   new_line;
   return_eskatu;

   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 4);
   put_line("Proba kasua  2: elementu bakarreko zerrenda.");
   put_line("Hasierako zerrenda: ");
   idatzi(Lis);
   put_line("1 itzuli beharko luke: ");
   put(luzera(Lis));
   new_line;
   new_line;
   return_eskatu;

   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 6);
   txertatu_hasieran(Lis, 8);
   txertatu_hasieran(Lis, 9);
   txertatu_hasieran(Lis, 10);
   put_line("Proba kasua  3: Hainbat elementutako zerrenda.");
   put_line("Hasierako zerrenda: ");
   idatzi(Lis);
   put_line("4 itzuli beharko luke: ");
   put(luzera(Lis));
   new_line;
   new_line;
   return_eskatu;

   put_line("Bukatu da proba. Agur ");
   
end proba_luzera;


