with Ada.Integer_Text_Io, Ada.Text_Io;
use Ada.Integer_Text_Io, Ada.Text_Io;
with loteria_datuak;
use loteria_datuak;

with diru_kopurua;

procedure proba_diru_kopurua is

   Sariak:T_sari_datuak;
   Bilketa:integer;
   saria:integer;
begin
   
   Sariak(3).zenbat:=10;
   Sariak(3).boletoak:=(3435435,213403,230498,3424,34258,54654,45235,45646,55654,242345,others=>0);


   Sariak(4).zenbat:=8;
   Sariak(4).boletoak:=(343,213402,230497,3423,34257,54653,45237,45649,others=>0);
   
   Sariak(5).zenbat:=4;
   Sariak(5).boletoak:=(34255,54650,45230,456,others=>0);
   
   Sariak(6).zenbat:=1;
   Sariak(6).boletoak:=(999767,others=>0);

   
   Bilketa:=3450000;
   Saria:=diru_kopurua(Bilketa,999767,Sariak);
   Put("Boletoa 999767 bada eta 6 zenbaki asmatu baditu, saria honakoa da: ");
   Put("431250");
   New_Line;
   put("eta zuen programak dio: ");   
   put(saria);


end proba_diru_kopurua;
