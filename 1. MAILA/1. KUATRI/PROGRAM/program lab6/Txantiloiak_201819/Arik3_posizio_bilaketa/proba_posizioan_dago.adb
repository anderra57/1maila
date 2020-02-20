with Ada.Text_Io,Ada.Integer_Text_IO; use Ada.Text_Io,Ada.Integer_Text_IO;
with bektoreak; use bektoreak;
with Posizioan_dago;

procedure Proba_Posizioan_dago is 
   -- progama honek posizioan_dago funtzioari dei egiten dio, eta 
   -- horren funtzionamendua zuzena dela ziurtatzeko balio du
   
   bektore1: Osokoen_Bektorea(1..10);   
   pos: -- bete
begin
   bektore1 := (1, 3, 5, 7, 19, 6, 13, 15, 17, 9);
   put_line("1. kasua: balioa erdian dago");
   put_line(" posizioan_dago(13, (1, 3, 5, 7, 19, 6, 13, 15, 17, 9))");
   put_line(" 7 izan behar da, eta emaitza da: ");
   --posizioan_dago() azpiprogramari deia falta da
   put(pos);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);
   
   bektore1 := (1, 3, 5, 7, 19, 6, 13, 15, 17, 9);
   put_line("2. kasua: balioa bukaeran dago");
   put_line(" posizioan_dago(9, (1, 3, 5, 7, 19, 6, 13, 15, 17, 9))");
   put_line(" 10 izan behar da, eta emaitza da: ");
   --posizioan_dago() azpiprogramari deia falta da
   put(pos);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);
   
   bektore1 := (1, 3, 5, 7, 19, 6, 13, 15, 17, 9);
   put_line("3. kasua: balioa ez dago, bektore osoa zeharkatu behar da");
   put_line(" posizioan_dago(45, (1, 3, 5, 7, 19, 6, 13, 15, 17, 9))");
   put_line(" -1 izan behar da, eta emaitza da: ");
   --posizioan_dago() azpiprogramari deia falta da
   put(pos);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);

   --proba kasu batzuk falta dira



end Proba_Posizioan_dago;

