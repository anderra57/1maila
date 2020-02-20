with Ada.Text_Io, Ada.Integer_Text_Io; use Ada.Text_Io, Ada.Integer_Text_Io;
with matrizeak; use matrizeak;
with maximoa_matrizean;

procedure proba_maximoa_matrizean is 
   -- progama honek maximoa_matrizean funtzioari dei egiten dio, eta 
   -- horren funtzionamendua zuzena dela ziurtatzeko balio du
   
M1: Osokoen_Matrizea(1..4, 1..10);

maximoa, posLerroa, posZutabea: integer;

begin
   M1 := ((1, 3, 5, 7, 9, 11, 13, 15, 17, 1),
          (3, 3, 5, 7, 9, 11, 13, 15, 17, 1),
          (5, 3, 5, 7, 9, 11, 13, 15, 17, 1),
          (7, 3, 5, 7, 9, 11, 13, 15, 17, 19));
           -- honen parekoa da->  M1(1,1) := 1; ... M1(4, 10) := 19;   
   put_line("1. kasua: maximoa matrizearen bukaeran");
   put_line(" maximoa_matrizean((1, 3, 5, 7, 9, 11, 13, 15, 17, 1)");
   put_line("                 (3, 3, 5, 7, 9, 11, 13, 15, 17, 1)");
   put_line("                 (5, 3, 5, 7, 9, 11, 13, 15, 17, 1)");
   put_line("                 (7, 3, 5, 7, 9, 11, 13, 15, 17, 19)), maximoa, posLerroa, posZutabea))");
   put_line(" maximoa=19 eta lerroa=4 eta zutabea=10 beharko luke eta emaitza honakoa da: ");
   maximoa_matrizean(M1, maximoa, posLerroa, posZutabea);
   put(Maximoa); put(posLerroa); put(posZutabea);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);

   M1 := ((1, 3, 5, 7, 9, 11, 13, 15, 17, 199),
          (3, 3, 5, 7, 9, 11, 13, 15, 17, 1),
          (5, 3, 5, 7, 9, 11, 13, 15, 17, 1),
          (7, 3, 5, 7, 9, 11, 13, 15, 17, 19));
           -- honen parekoa da ->  M1(1,1) := 1; ... M1(4, 10) := 19;   
   put_line("2. kasua: maximoa lehenengo lerroaren bukaeran");
   put_line(" maximoa_matrizean((1, 3, 5, 7, 9, 11, 13, 15, 17, 199)");
   put_line("                 (3, 3, 5, 7, 9, 11, 13, 15, 17, 1)");
   put_line("                 (5, 3, 5, 7, 9, 11, 13, 15, 17, 1)");
   put_line("                 (7, 3, 5, 7, 9, 11, 13, 15, 17, 19)), maximoa, posLerroa, posZutabea))");
   put_line("beharko luke:maximoa=199 eta lerroa=1 eta zutabea=10 eta emaitza honakoa da: ");
   maximoa_matrizean(M1, maximoa, posLerroa, posZutabea);
   put(Maximoa); put(posLerroa); put(posZutabea);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);

   M1 := ((1, 3, 5, 7, 9, 11, 13, 15, 17, 1),
          (3, 3, 5, 7, 9, 11, 13, 15, 17, 1),
          (5, 3, 5, 7, 9, 11, 13, 15, 17, 199),
          (7, 3, 5, 7, 9, 11, 13, 15, 17, 19));
           -- honen parekoa da ->  M1(1,1) := 1; ... M1(4, 10) := 19;   
   put_line("3. kasua: maximoa 3. lerroaren bukaeran");
   put_line(" maximoa_matrizean((1, 3, 5, 7, 9, 11, 13, 15, 17, 1)");
   put_line("                 (3, 3, 5, 7, 9, 11, 13, 15, 17, 1)");
   put_line("                 (5, 3, 5, 7, 9, 11, 13, 15, 17, 199)");
   put_line("                 (7, 3, 5, 7, 9, 11, 13, 15, 17, 19)), maximoa, posLerroa, posZutabea))");
   put_line("beharko luke:maximoa=199 eta lerroa=3 eta zutabea=10 eta emaitza honakoa da: ");
   maximoa_matrizean(M1, maximoa, posLerroa, posZutabea);
   put(Maximoa); put(posLerroa); put(posZutabea);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);


   M1 := ((1999, 3, 5, 7, 9, 11, 13, 15, 17, 1),
          (3, 3, 5, 7, 9, 11, 13, 15, 17, 1),
          (5, 3, 5, 7, 9, 11, 13, 15, 17, 199),
          (7, 3, 5, 7, 9, 11, 13, 15, 17, 19));
           -- honen parekoa da ->  M1(1,1) := 1; ... M1(4, 10) := 19;   
   put_line("4. kasua: maximoa matrizearen hasieran");
   put_line(" maximoa_matrizean((1999, 3, 5, 7, 9, 11, 13, 15, 17, 1)");
   put_line("                 (3, 3, 5, 7, 9, 11, 13, 15, 17, 1)");
   put_line("                 (5, 3, 5, 7, 9, 11, 13, 15, 17, 199)");
   put_line("                 (7, 3, 5, 7, 9, 11, 13, 15, 17, 19)), maximoa, posLerroa, posZutabea))");
   put_line("beharko luke:maximoa=1999 eta lerroa=1 eta zutabea=1 eta emaitza honakoa da: ");
   maximoa_matrizean(M1, maximoa, posLerroa, posZutabea);
   put(Maximoa); put(posLerroa); put(posZutabea);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);


   M1 := ((1, 3, 5, 7, 9, 11, 13, 15, 17, 1),
          (3, 3, 5, 7, 9, 11, 13, 15, 17, 1),
          (5, 3, 5, 7, 9, 11, 13, 15, 17, 199),
          (799, 3, 5, 7, 9, 11, 13, 15, 17, 19));
           -- honen parekoa da ->  M1(1,1) := 1; ... M1(4, 10) := 19;   
   put_line("5. kasua: maximoa azken lerroaren hasieran");
   put_line(" maximoa_matrizean((1, 3, 5, 7, 9, 11, 13, 15, 17, 1)");
   put_line("                 (3, 3, 5, 7, 9, 11, 13, 15, 17, 1)");
   put_line("                 (5, 3, 5, 7, 9, 11, 13, 15, 17, 199)");
   put_line("                 (799, 3, 5, 7, 9, 11, 13, 15, 17, 19)), maximoa, posLerroa, posZutabea))");
   put_line("beharko luke:maximoa=799 eta lerroa=4 eta zutabea=1 eta emaitza honakoa da: ");
   maximoa_matrizean(M1, maximoa, posLerroa, posZutabea);
   put(Maximoa); put(posLerroa); put(posZutabea);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);


   M1 := ((1, 3, 5, 7, 9, 1111, 13, 15, 17, 1),
          (3, 3, 5, 7, 9, 11, 13, 15, 17, 1),
          (5, 3, 5, 7, 9, 11, 13, 15, 17, 199),
          (7, 3, 5, 7, 9, 11, 13, 15, 17, 19));
           -- honen parekoa da ->  M1(1,1) := 1; ... M1(4, 10) := 19;   
   put_line("6. kasua: maximoa lehenengo lerroko erdikaldean");
   put_line(" maximoa_matrizean((1, 3, 5, 7, 9, 1111, 13, 15, 17, 1)");
   put_line("                 (3, 3, 5, 7, 9, 11, 13, 15, 17, 1)");
   put_line("                 (5, 3, 5, 7, 9, 11, 13, 15, 17, 199)");
   put_line("                 (7, 3, 5, 7, 9, 11, 13, 15, 17, 19)), maximoa, posLerroa, posZutabea))");
   put_line("beharko luke:maximoa=1111 eta lerroa=1 eta zutabea=6 eta emaitza honakoa da: ");
   maximoa_matrizean(M1, maximoa, posLerroa, posZutabea);
   put(Maximoa); put(posLerroa); put(posZutabea);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);

   
   M1 := ((1, 3, 5, 7, 9, 11, 13, 15, 17, 1),
          (3, 3, 5, 7, 9, 11, 13, 15, 17, 1),
          (5, 3, 5, 7, 9, 1111, 13, 15, 17, 199),
          (7, 3, 5, 7, 9, 11, 13, 15, 17, 19));
           -- honen parekoa da ->  M1(1,1) := 1; ... M1(4, 10) := 19;   
   put_line("7. kasua: maximoa erdikaldeko lerro baten erdikaldean");
   put_line(" maximoa_matrizean((1, 3, 5, 7, 9, 11, 13, 15, 17, 1)");
   put_line("                 (3, 3, 5, 7, 9, 11, 13, 15, 17, 1)");
   put_line("                 (5, 3, 5, 7, 9, 1111, 13, 15, 17, 199)");
   put_line("                 (7, 3, 5, 7, 9, 11, 13, 15, 17, 19)), maximoa, posLerroa, posZutabea))");
   put_line("beharko luke:maximoa=1111 eta lerroa=3 eta zutabea=6 eta emaitza honakoa da: ");
   maximoa_matrizean(M1, maximoa, posLerroa, posZutabea);
   put(Maximoa); put(posLerroa); put(posZutabea);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);

   M1 := ((1, 3, 5, 7, 9, 11, 13, 15, 17, 1),
          (3, 3, 5, 7, 9, 11, 13, 15, 17, 1),
          (5, 3, 5, 7, 9, 11, 13, 15, 17, 199),
          (7, 3, 5, 7, 9, 11, 1311, 15, 17, 19));
           -- honen parekoa da ->  M1(1,1) := 1; ... M1(4, 10) := 19;   
   put_line("8. kasua: maximoa azken lerroaren erdikaldean");
   put_line(" maximoa_matrizean((1, 3, 5, 7, 9, 11, 13, 15, 17, 1)");
   put_line("                 (3, 3, 5, 7, 9, 11, 13, 15, 17, 1)");
   put_line("                 (5, 3, 5, 7, 9, 11, 13, 15, 17, 199)");
   put_line("                 (7, 3, 5, 7, 9, 11, 1311, 15, 17, 19)), maximoa, posLerroa, posZutabea))");
   put_line("beharko luke:maximoa=1311 eta lerroa=4 eta zutabea=7 eta emaitza honakoa da: ");
   maximoa_matrizean(M1, maximoa, posLerroa, posZutabea);
   put(Maximoa); put(posLerroa); put(posZutabea);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);





end proba_maximoa_matrizean;

