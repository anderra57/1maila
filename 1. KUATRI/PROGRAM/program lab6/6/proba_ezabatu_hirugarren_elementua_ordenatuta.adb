with Ada.Text_Io; use Ada.Text_Io;
with bektoreak; use bektoreak;
with Zerrenda_Idatzi, Ezabatu_Hirugarren_Elementua_Ordenatuta;

procedure Proba_Ezabatu_Hirugarren_Elementua_Ordenatuta is
   -- progama honek Ezabatu_Hirugarren_Elementua_Ordenatuta funtzioari dei egiten dio, eta
   -- horren funtzionamendua zuzena dela ziurtatzeko balio du

Zerrenda1,zer1: Osokoen_Zerrenda;

begin

   Zerrenda1.Zenbakiak(1) := 1;
   Zerrenda1.Zenbakiak(2) := 2;
   Zerrenda1.Zenbakiak(3) := 3;
   Zerrenda1.Zenbakiak(4) := 4;
   Zerrenda1.Kont := 4;
   Put_line("1. kasua: 4 elementuko zerrenda: (1 2 3 4)");
   Put_line(" hasierako zerrenda: ");
   zerrenda_idatzi(Zerrenda1);
   put_line(" emaitza 1 2 4 izan beharko zen (ORDEN HONETAN) eta amaierako zerrenda honakoa da: ");
   zer1:=ezabatu_hirugarren_elementua_ordenatuta(Zerrenda1);
   zerrenda_idatzi(zer1);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);

   --proba kasu batzuk falta dira


end Proba_Ezabatu_Hirugarren_Elementua_Ordenatuta;

