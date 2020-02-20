with Motak;
use Motak;

with Ada.Text_Io, Ada.Integer_Text_Io;
use Ada.Text_Io, Ada.Integer_Text_Io;


procedure alderdien_kozienteen_taula_idatzi (
         T_C_P : in     T_koziente_alderdi_politikoa) is 
 
 package Boolean_E_S is new Enumeration_Io(Boolean);
   use Boolean_E_S;

   begin

     for I in 1 .. 8 loop
         Put("Koziente zenbaki ");
         Put(I);
         put(" :");  
         put(T_C_P(I).koziente, width=>10);               
         Put(" ");
         Put("eta bere MAX_da honakoa da: ");
         put(T_C_P(I).Max_da, width=>10); 
         new_line;
      end loop;
      new_line(2);
end alderdien_kozienteen_taula_idatzi;
