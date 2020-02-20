with matrizeak; use matrizeak;

procedure Maximoa_matrizean (M: in Osokoen_Matrizea; maximoa,Pos_L,Pos_Z: out integer) is
   -- aurre: M matrizeak gutxienez elementu bat dauka
   -- post: Max-ek matrizearen balio maximoa dauka
   --       eta Pos_L, Pos_Z bere posizioa (lerroa, zutabea).
   --       Maximoa hainbat haldiz agertuz gero, lehenego agerpena itzuliko da

begin

   for i in 1..M'last(1) loop
      for j in 1..M'last(2) loop
         if M(i,j)>maximoa then
	     maximoa:=M(i,j);
	     Pos_L:=i;
	     Pos_Z:=j;
	     end if;
      end loop;
   end loop;

end Maximoa_matrizean;

