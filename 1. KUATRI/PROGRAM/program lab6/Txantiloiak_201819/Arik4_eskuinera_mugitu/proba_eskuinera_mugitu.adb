with Ada.Text_Io; use Ada.Text_Io;
with bektoreak; use bektoreak;
with Eskuinera_mugitu, Bektorea_idatzi;

procedure Proba_Eskuinera_mugitu is 
   
   -- progama honek eskuinera_mugitu funtzioari dei egiten dio, eta 
   -- horren funtzionamendua zuzena dela ziurtatzeko balio du


bektorea1: Osokoen_bektorea(1..10);
 
begin
 
   
   bektorea1 := (1, 3, 5, 7, 19, 6, 13, 15, 17, 9);  
   put_line("1. kasua: (1, 3, 5, 7, 19, 6, 13, 15, 17, 9)");
   put_line(" eskuinera_mugitu((1, 3, 5, 7, 19, 6, 13, 15, 17, 9))");
   put_Line(" honako emaitza eman behar du ");
   put_line(" 9, 1, 3, 5, 7, 19, 6, 13, 15, 17");
   -- eskuinera_mugitu azpiprogramari deia falta da
   ---bektorea_idatzi azpiprogramari deia falta da (emaitza ikusi ahal izateko)
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   
   --proba kasu batzuk falta dira

end Proba_Eskuinera_mugitu;

