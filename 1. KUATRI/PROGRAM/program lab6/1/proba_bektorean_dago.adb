with Ada.Text_Io; use Ada.Text_Io;
with bektoreak; use bektoreak;
with Bektorean_dago;

procedure Proba_Bektorean_dago is
   -- progama honek bektorean_dago funtzioari dei egiten dio, eta
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

   bektore1 := (1, 3, 5, 7, 19, 6, 13, 15, 17, 9);
   put_line("1. kasua: balioa erdian dago");
   put_line(" bektorean_dago(13, (1, 3, 5, 7, 19, 6, 13, 15, 17, 9))");
   put_line(" True izan behar da, eta emaitza da: ");
   ema:=Bektorean_dago(13, bektore1);
   boolearra_idatzi(ema);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);

   bektore1 := (1, 3, 5, 7, 19, 6, 13, 15, 17, 9);
   put_line("2. kasua: balioa bukaeran dago");
   put_line(" bektorean_dago(9, (1, 3, 5, 7, 19, 6, 13, 15, 17, 9))");
   put_line(" True izan behar da, eta emaitza da: ");
   ema:=Bektorean_dago(9, bektore1);
   boolearra_idatzi(ema);

   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);

   bektore1 := (1, 3, 5, 7, 19, 6, 13, 15, 17, 9);
   put_line("3. kasua: balioa ez dago, bektore osoa zeharkatu behar da");
   put_line(" bektorean_dago(45, (1, 3, 5, 7, 19, 6, 13, 15, 17, 9))");
   put_line(" False izan behar da, eta emaitza da: ");
   ema:=Bektorean_dago(45, bektore1);
   boolearra_idatzi(ema);

   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);


   bektore1 := (1, 3, 5, 7, 6, 6, 13, 15, 17, 9);
   put_line("4. kasua: balioa birritan dago");
   put_line(" bektorean_dago(6, (1, 3, 5, 7, 6, 6, 13, 15, 17, 9))");
   put_line(" True izan behar da, eta emaitza da: ");
   ema:=Bektorean_dago(6, bektore1);
   boolearra_idatzi(ema);

   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);




end Proba_Bektorean_dago;

