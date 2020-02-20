with Ada.Text_Io; use Ada.Text_Io;
with bektoreak; use bektoreak;
with Zerrenda_Idatzi,txertatu_posizioan;

procedure proba_txertatu_posizioan is 
   -- progama honek txertatu_posizioan funtzioari dei egiten dio, eta 
   -- horren funtzionamendua zuzena dela ziurtatzeko balio du

Zerrenda1: Osokoen_Zerrenda;
pos,zen: integer;

begin
   
   -- elementurik ez eta txertatze posizioa 1
   
   pos:=1;
   zen:=2;
   Zerrenda1.Kont := 0;
   put_line("1. kasua: 0 elementuko zerrenda: ");
   put_line(" hasierako zerrenda: ");
   zerrenda_idatzi(Zerrenda1);
   new_line;
   put_line(" 2 lehenengo posizioan txertatu beharko luke eta emaitza honakoa da: ");
   txertatu_posizioan(zen,pos,Zerrenda1);
   zerrenda_idatzi(Zerrenda1);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);

   -- hainbat elementudun zerrenda, eta hasieran gehitu
   
   pos:=1;
   zen:=2;
   Zerrenda1.Zenbakiak(1) := 3; Zerrenda1.Zenbakiak(2) := 1; Zerrenda1.Zenbakiak(3) := 4;
   Zerrenda1.Zenbakiak(4) := 8; Zerrenda1.Zenbakiak(5) := 6;
   Zerrenda1.Kont := 5;
   put_line("2. kasua: hainbat elementuko zerrendari hasieran gehitu : (3 1 4 8 6)");
   put_line(" hasierako zerrenda: ");
   zerrenda_idatzi(Zerrenda1);
   put_line(" 2 hasieran txertatzean emaitza honakoa izan beharko luke 2 3 1 4 8 6 eta bukaerako zerrenda honakoa da: ");
   txertatu_posizioan(zen,pos,Zerrenda1);
   zerrenda_idatzi(Zerrenda1);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);

   -- hainbat elementudun zerrenda, eta bukaeran gehitu
  
   Zerrenda1.Zenbakiak(1) := 3; Zerrenda1.Zenbakiak(2) := 1; Zerrenda1.Zenbakiak(3) := 4;
   Zerrenda1.Zenbakiak(4) := 8; Zerrenda1.Zenbakiak(5) := 6;
   Zerrenda1.Kont := 5;
   pos:=Zerrenda1.Kont+1;
   zen:=2;
   put_line("3. kasua: hainbat elementuko zerrendari bukaeran gehitu 2: (3 1 4 8 6)");
   put_line(" hasierako zerrenda: ");
   zerrenda_idatzi(Zerrenda1);
   put_line(" 2 bukaeran txertatzean emaitza honakoa izan beharko luke 3 1 4 8 6 2 eta bukaerako zerrenda honakoa da: ");
   txertatu_posizioan(zen,pos,Zerrenda1);
   zerrenda_idatzi(Zerrenda1);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);
   
   -- hainbat elemenentudun zerrenda, eta erdian gehitu
  
   Zerrenda1.Zenbakiak(1) := 3; Zerrenda1.Zenbakiak(2) := 1; Zerrenda1.Zenbakiak(3) := 4;
   Zerrenda1.Zenbakiak(4) := 8; Zerrenda1.Zenbakiak(5) := 6;
   Zerrenda1.Kont := 5;
   pos:=3;
   zen:=2;
   put_line("4. kasua: hainbat elementuko zerrendari erdian gehitu 2: (3 1 4 8 6)");
   put_line(" hasierako zerrenda: ");
   zerrenda_idatzi(Zerrenda1);
   put_line(" 2 erdian txertatzean emaitza honako izan beharko luke 3 1 2 4 8 6 eta bukaerako zerrenda honakoa da: ");
   txertatu_posizioan(zen,pos,Zerrenda1);
   zerrenda_idatzi(Zerrenda1);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);
   
   --proba kasu batzuk falta dira
   
end proba_txertatu_posizioan;


