with Motak;
use Motak;

with Ada.Text_Io, Ada.Integer_Text_Io;
use Ada.Text_Io, Ada.Integer_Text_Io;


procedure dhont_taula_idatzi(L_P_V: T_Lista_alderdien_botoak;
         Dhont_taula : in   T_Taula_Dhont; zenbat_zutabe: in integer) is
   --Aurre: L_P_V aldagaiak, alderdi politiko guztien informazioa du, no alderdi bakoitzarentzat, honen izena eta boto kopuruak ditu (>%3)
   --       Dhont_taulak, L_V_P-ko alderdi kopuru berdinen informazioa du, eta Dhont-eko aurreneko zutabeak, L_V_P-ek duen 
   --       informazioarekin bat egin beharko luke.
   --       zenbat_zutabe aldagaia, idatzi nahi dugun Dhont taulako zutabe kopurua izango da.
   --Post: Dhont taulako 1..zenbat_zutabe zutabeko informazioa pantailaratuko da.

package Boolean_E_S is new Enumeration_Io(Boolean);
   use Boolean_E_S;
   -- Balio boolearrak irakurri eta idazteko erabiliko da

   begin

      New_Line;
      Put(" ----------------------------------------------------------------------------");
      new_line;
      for I in 1 .. Dhont_taula.Zenbat_alderdi_politiko loop
         put("|");
         Put(L_P_V.Alderdien_taula(I).Izena(4..15));
         put("|");

          for j in 1..zenbat_zutabe loop
            Put(Dhont_taula.Taula_Dhont(I)(J).koziente,Width=> 7);
            put("|");
         end loop;
         New_Line;
         put("|");
         Put("            ");
         put("|");
         for J in 1..zenbat_zutabe loop
         if Dhont_taula.Taula_Dhont(I)(J).Max_da then
               Put("   ");
            else
               Put("  ");
            end if;
            Put(Dhont_taula.Taula_Dhont(I)(J).Max_da);
            put("|");
         end loop;
         New_Line;
         Put(" ----------------------------------------------------------------------------");
         new_line;
      end loop;
      new_line(2);
end dhont_taula_idatzi;
