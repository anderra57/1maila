with Ada.Integer_Text_IO, Ada.Text_IO;
use Ada.Integer_Text_IO, Ada.Text_IO;
procedure bitarretik_hamartarrera is
   zenb,kont,em:integer;
begin
   -- hasieraketak
   put("Sartu zenbaki bat bitarrez eta 1ekin hasten dena: ");
   get(zenb);
   kont:=0;
   em:=0;
   -- sortu zenbakia hamartarrez
   while(zenb>0) loop
      if(zenb rem 2 /= 0) then
         em:=em + 2**(kont);
      end if;
      zenb:=(zenb/10);
      kont:=kont+1;
   end loop;
   put_line("Zenbakia hamartarrez honakoa da:");
   put(em);
end bitarretik_hamartarrera;