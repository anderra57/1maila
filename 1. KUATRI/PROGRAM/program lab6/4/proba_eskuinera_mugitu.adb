with Ada.Text_Io; use Ada.Text_Io;
with bektoreak; use bektoreak;
with Eskuinera_mugitu, Bektorea_idatzi;

procedure Proba_Eskuinera_mugitu is

   -- progama honek eskuinera_mugitu funtzioari dei egiten dio, eta
   -- horren funtzionamendua zuzena dela ziurtatzeko balio du


bektorea1,bek1: Osokoen_bektorea(1..10);

begin


   bektorea1 := (1, 3, 5, 7, 19, 6, 13, 15, 17, 9);
   put_line("1. kasua: (1, 3, 5, 7, 19, 6, 13, 15, 17, 9)");
   put_line(" eskuinera_mugitu((1, 3, 5, 7, 19, 6, 13, 15, 17, 9))");
   put_Line(" honako emaitza eman behar du ");
   put_line(" 9, 1, 3, 5, 7, 19, 6, 13, 15, 17");
   bek1:=eskuinera_mugitu(bektorea1);
   bektorea_idatzi(bek1);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);

   bektorea1 := (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
   put_line("2. kasua: (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)");
   put_line(" eskuinera_mugitu((1, 2, 3, 4, 5, 6, 7, 8, 9, 10))");
   put_Line(" honako emaitza eman behar du ");
   put_line("10, 1, 2, 3, 4, 5, 6, 7, 8, 9");
   bek1:=eskuinera_mugitu(bektorea1);
   bektorea_idatzi(bek1);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;

   bektorea1 := (7, 7, 28, 11, 8, 18, 5, 3, 79, 194);
   put_line("3. kasua: (7, 7, 28, 11, 8, 18, 5, 3, 79, 194)");
   put_line(" eskuinera_mugitu((7, 7, 28, 11, 8, 18, 5, 3, 79, 194))");
   put_Line(" honako emaitza eman behar du ");
   put_line("194, 7, 7, 28, 11, 8, 18, 5, 3, 79");
   bek1:=eskuinera_mugitu(bektorea1);
   bektorea_idatzi(bek1);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;

   bektorea1 := (2, 6, 8, 9, 3, 5, 7, 3, 6, 9);
   put_line("3. kasua: (2, 6, 8, 9, 3, 5, 7, 3, 6, 9)");
   put_line(" eskuinera_mugitu((2, 6, 8, 9, 3, 5, 7, 3, 6, 9))");
   put_Line(" honako emaitza eman behar du ");
   put_line("9, 2, 6, 8, 9, 3, 5, 7, 3, 6");
   bek1:=eskuinera_mugitu(bektorea1);
   bektorea_idatzi(bek1);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;

end Proba_Eskuinera_mugitu;

