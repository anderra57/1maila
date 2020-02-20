with motak;
use motak;

with alderdien_kozienteak_kalkulatu;

procedure koziente_guztiak_kalkulatu (
      Dhont : in out T_Taula_Dhont ) is
   -- Aurre: Dhont aldagaiak, alderdi bakoitzaren boto kopurua izango du aurreneko zutabean, beheranzko ordenean.
   -- Post: i guztietarako 1 eta DHont.Zenbat_alderdi_politiko eta j guztietarako 2 .. Kop_aulki, DHont(i)(j)= DHont(i)(1)/j.

begin

   for I in 1 .. Dhont.Zenbat_alderdi_politiko loop
      alderdien_kozienteak_kalkulatu(Dhont.Taula_Dhont(I));
   end loop;

end koziente_guztiak_kalkulatu;
