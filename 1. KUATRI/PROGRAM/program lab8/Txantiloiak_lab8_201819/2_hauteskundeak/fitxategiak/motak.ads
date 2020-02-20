package Motak is

   -- konstanteak
	Max_kop_alderdi_politiko: constant integer :=10;
  	Kop_aulki: constant integer := 25;


   -- tarteak
	subtype T_tarte_alderdi is Integer range 0..Max_kop_alderdi_politiko;
  	subtype T_izena is String(1..15);


   -- Alderdi politikoen lista berauen botoekin (T_Lista_alderdiak_botoak)
	type T_info_alderdien_botoak is record
      		Izena  : T_izena;
      		Botoak : Natural;
  	end record;

	type T_alderdien_taula is array (1..Max_kop_alderdi_politiko) of T_info_alderdien_botoak;

	type T_Lista_alderdien_botoak is record
      		Alderdi_kop:   T_tarte_alderdi;
      		Alderdien_taula: T_alderdien_taula;
  	end record;


   -- Alderdi politikoen lista berauen aulkiekin (T_lista_aulkiak)
	type T_info_alderdi_aulkiak is record
	      Izena : T_izena;
	      Aulki_kop: Natural;
  	end record;

	type T_taula_aulkiak is array (1..Max_kop_alderdi_politiko) of T_info_alderdi_aulkiak;

	type T_lista_aulkiak is record
		    Kop_alderdi  : T_tarte_alderdi;
      		Taula_aulkiak : T_taula_aulkiak;
  	end record;


   -- Aulkien banaketarako datuak
   	type T_info_kozienteak is record
       	       Koziente : Natural;
       	       Max_da   : Boolean := False; -- maximoaren autaketa prozesurako erabiliko da, maximoa den ala ez adierazteko
        end record;

   	type T_koziente_alderdi_politikoa is array (1 .. Kop_aulki) of T_info_kozienteak;

	type T_Lista_Dhont is array (1 .. Max_kop_alderdi_politiko) of T_koziente_alderdi_politikoa;

   	type T_Taula_Dhont is record
      	    Zenbat_alderdi_politiko : T_tarte_alderdi; --uneko alderdi politiko kopurua (lerro kopurua)
       		Taula_Dhont  : T_Lista_Dhont;
   	end record;

end Motak ;
