with Motak;
use Motak;

with Ada.Text_Io, Ada.Integer_Text_Io;
use Ada.Text_Io, Ada.Integer_Text_Io;


procedure alderdien_botoen_lista_idatzi ( L_P_V : in T_Lista_alderdien_botoak) is

   begin


      for I in 1 .. L_P_V.Alderdi_kop loop
           Put("Alderdia ");
           Put(L_P_V.alderdien_taula(I).Izena);
           Put(" ditu ");
           put(L_P_V.alderdien_taula(I).Botoak, width=>10);
           put(" boto");
           new_line;
      end loop;
      new_line(2);
end alderdien_botoen_lista_idatzi;
