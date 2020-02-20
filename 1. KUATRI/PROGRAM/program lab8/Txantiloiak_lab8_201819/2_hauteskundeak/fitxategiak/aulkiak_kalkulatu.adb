with Motak; use Motak;
with Ada.text_io; use ada.text_io;

with aulkiak_banatu, aulkiak_idatzi;

procedure aulkiak_kalkulatu (Lpv_Bizkaia, Lpv_Araba, Lpv_Gipuzkoa : in     T_Lista_alderdien_botoak;aulkiak_guztira   :    out T_lista_aulkiak) is
   -- Aurre:  sarrerako 3 aldagaiek, probintzia bakoitzeko hauteskundeen emaitzak dituzte.
   -- Post: Emaitza, alderdi politiko bakoitzak lortu dituen aulki kopurua izango da. Probintzi bakoitzeko
   --        25 aulki esleituko dira, non 25 aulkiak alderdi politikoen artean banatuko diren.

   function dago ( alderdiaren_izena : in     T_izena;
                   aulkiak        : in     T_lista_aulkiak) return Integer is
      -- Aurre:
      -- Post: emaitza 0 izango da baldin eta alderdia ez badago aulkiak aldagaiko zerrendan, bestela, zerrendan agertzen den posizioa itzuliko da.
      Ind:integer:=0;

   begin
      --***************************************************************
   end dago;

   procedure aulkiak_metatu (aulkiak_guztira : in out T_lista_aulkiak;aulkiak : in T_lista_aulkiak) is
      -- Aurre:
      -- Post: Aulkiak aldagaiko aulki kopurua, aulkiak_guztira aldagaiara gehitu dira
      Pos : Integer;
   begin
    --*******************************************************************
   end aulkiak_metatu;


   aulkiak_Bizkaia, aulkiak_Araba, aulkiak_Gipuzkoa: T_lista_aulkiak;

begin

   --       Lehenik, aulkiak banatu beharko dira.
 --***********************************************************

end aulkiak_kalkulatu;


