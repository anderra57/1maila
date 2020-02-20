with Motak; use Motak;
with Ada.text_io; use ada.text_io;

with aulkiak_banatu, aulkiak_idatzi;

procedure aulkiak_kalkulatu (Lpv_Bizkaia, Lpv_Araba, Lpv_Gipuzkoa : in T_Lista_alderdien_botoak;
			                                       aulkiak_guztira: out T_lista_aulkiak) is

   -- Aurre:  sarrerako 3 aldagaiek, probintzia bakoitzeko hauteskundeen emaitzak dituzte.
   -- Post: Emaitza, alderdi politiko bakoitzak lortu dituen aulki kopurua izango da. Probintzi bakoitzeko
   --        25 aulki esleituko dira, non 25 aulkiak alderdi politikoen artean banatuko diren.

   function dago ( alderdiaren_izena : in     T_izena;
                   aulkiak        : in     T_lista_aulkiak) return Integer is
      -- Aurre:
      -- Post: emaitza 0 izango da baldin eta alderdia ez badago aulkiak aldagaiko zerrendan, bestela, zerrendan agertzen den posizioa itzuliko da.
      Ind:integer:=1;
      aulki:integer:=0;
   begin

      loop exit when aulki>0 or ind>aulkiak.Kop_alderdi;
	        if aulkiak.Taula_aulkiak(ind).Izena = alderdiaren_izena then
	           aulki:=aulkiak.Taula_aulkiak(ind).Aulki_kop;
		    end if;
	     ind:=ind+1;
	  end loop;

      return(aulki);

   end dago;

   procedure aulkiak_metatu (aulkiak_guztira : in out T_lista_aulkiak;aulkiak : in T_lista_aulkiak) is
      -- Aurre:
      -- Post: Aulkiak aldagaiko aulki kopurua, aulkiak_guztira aldagaiara gehitu dira
      Pos : Integer;
   begin
   aulkiak_guztira.Kop_alderdi:=6;
      for i in 1..aulkiak_guztira.Kop_alderdi loop
	     aulkiak_guztira.Taula_aulkiak(i).Aulki_kop:=aulkiak_guztira.Taula_aulkiak(i).Aulki_kop+aulkiak.Taula_aulkiak(i).Aulki_kop;
	  end loop;

   end aulkiak_metatu;


   aulkiak_Bizkaia, aulkiak_Araba, aulkiak_Gipuzkoa: T_lista_aulkiak;

begin

   --       Lehenik, aulkiak banatu beharko dira.
 --***********************************************************
   aulkiak_banatu(LPV_Bizkaia,aulkiak_Bizkaia);
   aulkiak_banatu(LPV_Araba,aulkiak_Araba);
   aulkiak_banatu(LPV_Gipuzkoa,aulkiak_Gipuzkoa);

   --for i in 1..aulkiak_guztira.Kop_alderdi loop
   --   aulkiak_guztira.Taula_aulkiak(i).Aulki_kop:=aulkiak_bizkaia.Taula_aulkiak(i).Aulki_kop+aulkiak_gipuzkoa.Taula_aulkiak(i).Aulki_kop+aulkiak_araba.Taula_aulkiak(i).Aulki_kop;
   --end loop;
   aulkiak_guztira.Kop_alderdi:=6;
   for i in 1..aulkiak_guztira.Kop_alderdi loop
      aulkiak_guztira.Taula_aulkiak(i).Aulki_kop:=0;
   end loop;

   aulkiak_metatu(aulkiak_Bizkaia,aulkiak_guztira);
   aulkiak_metatu(aulkiak_Araba,aulkiak_guztira);
   aulkiak_metatu(aulkiak_Gipuzkoa,aulkiak_guztira);



end aulkiak_kalkulatu;


