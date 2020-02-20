with loteria_datuak, asmatutakoak_kalkulatu; 

use loteria_datuak;

function diru_kopurua (bildutako_dirua: in Natural;
                     Zen_Boleto: in Integer;
                     sarituen_lista: in T_sari_datuak) return Natural is
-- aurre: 
-- post: emaitza, irabazitako dirua izango da. Premioetara doan dirua, bildutakoaren erdia izango da,
--		lau kotegorietan diru kopuru berdina banatuaz. Kategoria bakoitzean,
--              irabazleen artean banatuko da proportzio berean.

Totala_sariak, Totala_asmatzeak: Natural;
Kategoria_bakoitzeko_dirua: Float;

begin
    Total_sariak := 0;
   




    return Total_sariak;
end diru_kopurua;
