with Ada.Text_Io;
use Ada.Text_Io;
with Def_Datuak;
use Def_Datuak;
with errepikatuak_ezabatu, zerrenda_idatzi;

procedure proba_errepikatuak_ezabatu is 


   V1,  
   V2 : osokoen_zerrenda;  

begin

   Put_Line("Aurreneko proba. errepikatuak_ezabatu(1,2,3,4,5,6,7,8,9,10)");
   V1.zenbakiak := (1,2,3,4,5,6,7,8,9,10, OTHERS => 0);
   V1.zenbat := 10;
   zerrenda_idatzi(V1);
   New_Line;
   Put_Line("Errepikatuak ezabatu ondoren:");
   errepikatuak_ezabatu(V1, V2);
   zerrenda_idatzi(V2);
   New_Line(3);
   Put_Line("Sakatu return jarraitzeko");
   Skip_Line;


   put_line("Bigarren proba: errepikatuak_ezabatu(1,1,1,1,1,1,1,1,1,1)");
   V1.zenbakiak := (1,1,1,1,1,1,1,1,1,1, OTHERS => 0);
   V1.zenbat := 10;
   zerrenda_idatzi(V1);
   new_line;
   Put_Line("Errepikatuak ezabatu ondoren:");
   errepikatuak_ezabatu(V1, V2);
   zerrenda_idatzi(V2);
   new_line(3);
   Put_Line("Sakatu return jarraitzeko");
   skip_line;

   put_line("Tercera prueba: errepikatuak_ezabatu(1,3,1,3,1,3,1,3,1,1)");
   V1.zenbakiak := (1,3,1,3,1,3,1,3,1,1, OTHERS => 0);
   V1.zenbat := 10;
   zerrenda_idatzi(V1);
   new_line;
   Put_Line("Errepikatuak ezabatu ondoren:");
   errepikatuak_ezabatu(V1, V2);
   zerrenda_idatzi(V2);
   new_line(3);
   Put_Line("Sakatu return jarraitzeko");
   skip_line;
   
   put_line("Cuarta prueba: errepikatuak_ezabatu(1,1,1,2,3,3,3,2,3,2)");
   V1.zenbakiak := (1,1,1,2,3,3,3,2,3,2, OTHERS => 0);
   V1.zenbat := 10;
   zerrenda_idatzi(V1);
   new_line;
   Put_Line("Errepikatuak ezabatu ondoren:");
   errepikatuak_ezabatu(V1, V2);
   zerrenda_idatzi(V2);
   new_line(3);
   Put_Line("Sakatu return jarraitzeko");
   skip_line;
   
   Put_Line("...");


end proba_errepikatuak_ezabatu;
