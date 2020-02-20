with motak;
use motak;


procedure maximoak_esleitu (
      Dhont : in out T_Taula_Dhont ) is
   -- Aurre: Dhont-ek koziente guztien balioen kalkuluak ditu.
   -- Post: Dhont-en eguneraketa, kop_aulki aldagaian DHont-en posizio eta  Max_da eremuan TRUE ipiniazn burutzen da.
   --       Dhont taulako Kop_aulki maximoak eguneratuko dira.


   procedure koziente_maximoa_kalkulatu (
         Taula      : in     T_Taula_Dhont;
         P_alderdia,
         J_kozientea :    out Positive       ) is
      -- Aurre: Taulak, i alderdi politiko bakoitzak bere botoen kozienteak izango ditu eta ahulki kopuru posibleak
      -- Post: Taulako zenbaki maximoa Taula.Taula_Dhont(P_alderdia).P_kozienteak(J_kozientea) da.
      Max : Integer;

   begin
     max:=-1;
     for I in 1..Taula.Zenbat_alderdi_politiko loop
        for J in 1 .. Kop_aulki loop
            if not Taula.Taula_Dhont(i)(j).Max_da -- ez da dagoeneko maximoa izan
                  then
               if Taula.Taula_Dhont(I)(J).Koziente > Max then
                  Max        := Taula.Taula_Dhont(I)(J).Koziente;
                  P_alderdia  := I;
                  J_kozientea := J;
               end if;
               end if;
           end loop;
         end loop;

   end  koziente_maximoa_kalkulatu;


   procedure botoa_esleitu_eta_koziente_maximoa_borratu (
         Taula : in out T_Taula_Dhont ) is
      -- Aurre: Taula aldagaiak, alderdiek lortu dituzten botoak izango ditu.
      -- Post: Kozienteren bateko Taula osoa maximoa duen alderdiari aulki bat gehitu zaio.
      --       Maximoa zuen kozienteari 0koa esleitu zaio.
      P,J : Integer;
   begin
      koziente_maximoa_kalkulatu (Taula, P, J);
      Taula.Taula_Dhont(P)(J).Max_da := True;
   end botoa_esleitu_eta_koziente_maximoa_borratu ;

begin

   for I in 1 ..Kop_aulki loop
      botoa_esleitu_eta_koziente_maximoa_borratu (Dhont);
   end loop;
end maximoak_esleitu ;
