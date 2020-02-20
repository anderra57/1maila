with Motak;
use Motak;


procedure botoak_banatu (
      Botoak : in     T_Lista_alderdien_botoak;
      Dhont :    out T_Taula_Dhont           ) is

   -- Aurre: Botoen %3 baino gehiago dituzten alderdien zerrenda. Zerrenda beherantzko ordenean egongo da.
   -- Post: Dhont aldagaiak, alderdi bakoitzaren boto kopurua izango du aurreneko zutabean, beheranzko ordenean.


begin
   Dhont.Zenbat_alderdi_politiko := Botoak.Alderdi_kop;


   for I in 1 .. Botoak.Alderdi_kop loop
      Dhont.Taula_Dhont(I)(1).koziente := Botoak.alderdien_taula(I).Botoak;
   end loop;


end botoak_banatu;
