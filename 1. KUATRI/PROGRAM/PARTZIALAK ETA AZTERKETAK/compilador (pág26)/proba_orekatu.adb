with Ada.Text_Io, Ada.Integer_Text_Io;
use Ada.Text_Io, Ada.Integer_Text_Io;
with datuak; use datuak;
with orekatu;


procedure proba_orekatu is

t1: katea;

   procedure jarraitu is
   begin
      New_Line(3);
      Put_Line("sakatu return");
      Skip_Line;
      New_Line(3);
   end jarraitu;




begin
-- 1. kasua
   t1.luzera:=0;
   Put_line("Proba 1: ez dago elementurik");
   put_line("Emaitza TRUE izango da");
   put(" eta: ");
   if not orekatu(t1) then
      Put("FALSE da");
   else
      Put("TRUE da");
   end if;
   jarraitu;


-- 2. kasua
put_line("Proba 2: Irekiera parentesi guztiak itxita zeuden, eta itxierako bat heltzen da:");
   put_line(" Sarrera if(a=(1+2))+3){a:=a-2};b:=b+4; Parentesiak bakarrik:  (())){}");

   t1.karaktereak(1..30) := "if(a=(1+2))+3){a:=a-2};b:=b+4;";
   t1.luzera:=30;
   put("Emaitza FALSE izango da ");
   put(" eta: ");
   if not orekatu(t1) then
      put("FALSE da");
   else
      put("TRUE da");
   end if;
   jarraitu;


-- 3. kasua
   put_line("Proba  3: konfigurazioa (}:");
   put_line(" Sarrera if(}=1+2))+3){a:=a-2};b:=b+4; Parentesiak bakarrik:  (}))){}");
   new_line;

   t1.karaktereak(1..29) := "if(}=1+2))+3){a:=a-2};b:=b+4;";
   t1.luzera:=29;
   put_line(" Emaitza FALSE izango da");
   put(" eta: ");
   if not orekatu(t1) then
      put("FALSE da");
   else
      put("TRUE da");
   end if;
   jarraitu;


-- 4. kasua
   put_line("Proba 4: konfigurazioa {):");
   put_line(" Sarrera if(a=1+2){+3){a:=a-2};b:=b+4; Parentesiak bakarrik:  (){){}");
   new_line;

   t1.karaktereak(1..29) := "if(a=1+2){+3){a:=a-2};b:=b+4;";
   t1.luzera:=29;
   put_line(" eta Emaitza FALSE izango da");
   put(" eta: ");
   if not orekatu(t1) then
      put("FALSE da");
   else
      put("TRUE da");
   end if;
   jarraitu;


-- 5. kasua
   put_line("Proba 5: parentesiak ) hasten dira:");
   put_line(" Sarrera if)a=1+2))+3){a:=a-2};b:=b+4; Parentesiak bakarrik:  )))){}");

   t1.karaktereak(1..29) := "si)a=1+2))+3){a:=a-2};b:=b+4;";
   t1.luzera:=29;
   put_line(" Emaitza FALSE izango da");
   put(" eta: ");
   if not orekatu(t1) then
      put("FALSE da");
   else
      put("TRUE da");
   end if;
   jarraitu;

-- 6. kasua
   put_line("Proba 6: Parentesiak orekatuta daude:");
   put_line(" Sarrera if(a=b){a:=(a+(3));};a:=(3-2)/(b+3); Parentesiak bakarrik: (){(())}()()");

   t1.karaktereak(1..35) := "if(a=b){a:=(a+(3));};a:=(3-2)/(b+3)";
   t1.luzera:=35;
   put_line(" eta Emaitza TRUE izango da ");
   put(" eta: ");
   if not orekatu(t1) then
      put("FALSE da");
   else
      put("TRUE da");
   end if;
   jarraitu;

-- 7. kasua
   put_line("Proba 7: Parentesiak orekatuta daude:");
   put_line(" Sarrera if{{a+b-{f-g}};};a:=(3-2)/(b+3); Parentesiak bakarrik: {{{}}}()()");

   t1.karaktereak(1..31) := "if{{a+b-{f-g}};};a:=(3-2)/(b+3)";
   t1.luzera:=31;
   put_line(" eta Emaitza TRUE izango da ");
   put(" eta: ");
   if not orekatu(t1) then
      put("FALSE da");
   else
      put("TRUE da");
   end if;
   jarraitu;


-- 8. kasua
   put_line("Proba 8: } hasten dira:");
   put_line(" Sarrera if}a=1+2))+3){a:=a-2};b:=b+4; Parentesiak bakarrik:  }))){}");

   t1.karaktereak(1..29) := "if}a=1+2))+3){a:=a-2};b:=b+4;";
   t1.luzera:=29;
   put_line(" Emaitza FALSE izango da");
   put(" eta: ");
   if not orekatu(t1) then
      put("FALSE da");
   else
      put("TRUE da");
   end if;



end proba_orekatu;

