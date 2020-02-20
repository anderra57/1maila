with Ada.Text_Io; use Ada.Text_Io;
with bektoreak; use bektoreak;
with Bektore_Ordenatuan_dago;

procedure Proba_Bektore_Ordenatuan_dago is
   -- progama honek bektore_ordenatuan_dago funtzioari dei egiten dio, eta 
   -- horren funtzionamendua zuzena dela ziurtatzeko balio du
   
   procedure Boolearra_idatzi(balioa: in Boolean) is
   begin
      if(balioa) then
         put("True");
      else
         put("False");
      end if;
   end Boolearra_idatzi;

bektore1: Osokoen_Bektorea(1..10);
ema: boolean;
begin

   bektore1 :=(1,3,5,7,9,11,13,15,17,19);
   put_line("Caso 1: el valor esta en medio");
   put_line("1. kasua: balioa erdian dago");
   put_line(" bektore_ordenatuan_dago(13, (1,3,5,7,9,11,13,15,17,19))");
   put_line(" True izan behar da, eta emaitza da: ");
   ---bektore_ordenatuan_dago() funtzioari deia falta da;
   boolearra_idatzi(ema);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);

   bektore1 :=(1,3,5,7,9,11,13,15,17,19);
   put_line("2. kasua: balioa bukaeran dago");
   put_line(" bektore_ordenatuan_dago(19, (1,3,5,7,9,11,13,15,17,19))");
   put_line(" True izan behar da, eta emaitza da: ");
   ---bektore_ordenatuan_dago() funtzioari deia falta da;
   boolearra_idatzi(ema);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);

   bektore1 :=(1,3,5,7,9,11,13,15,17,19);
   put_line("3. kasua: balioa ez dago, bektore osoa zeharkatu behar da");
   put_line(" bektore_ordenatuan_dago(45, (1,3,5,7,9,11,13,15,17,19))");
   put_line(" False izan behar da, eta emaitza da: ");
   ---bektore_ordenatuan_dago() funtzioari deia falta da;
   boolearra_idatzi(ema);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);

   --proba kasu batzuk falta dira



end Proba_Bektore_Ordenatuan_dago;

