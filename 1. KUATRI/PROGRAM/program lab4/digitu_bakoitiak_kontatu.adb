with Ada.Integer_Text_IO, Ada.Text_IO;
use Ada.Integer_Text_IO, Ada.Text_IO;
procedure digitu_bakoitiak_kontatu is
   zenb,bak:integer;
begin
   put("Sartu osoko zenbaki bat: ");
   get(zenb);
   bak:=0;
   while(zenb>0) loop
      if(zenb rem 2 /= 0) then
        bak:=bak+1;
      end if;
      zenb:=(zenb/10);
   end loop;
   put_line("Zuk sartutako zenbakiak ");
   put(bak);
   put(" digitu bakoiti ditu.");
end digitu_bakoitiak_kontatu;