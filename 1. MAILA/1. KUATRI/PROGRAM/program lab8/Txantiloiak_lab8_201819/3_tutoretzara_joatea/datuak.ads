package datuak is

   IK: constant Integer := 60; -- Ikasle kopuru maximoa
   subtype Ikasle_Tartea is Integer range 1..IK;
   type T_NANak is array (Ikasle_Tartea) of Positive;
   type Info_eguna is record
      Data: String(1..10);  -- "uuuu/hh/ee" formatuan
      Ikasle_kop: Natural;
      NANak: T_NANak;
   end record;

   LEK: constant Integer := 200; -- Lanegun kopuru maximoa
   subtype Lanegun_Tartea is Integer range 1..LEK;
   type T_egunak is array (Lanegun_Tartea) of Info_eguna;
   type Info_egutegia is record
      Zenbat_egun: Natural;
      Egunak: T_egunak;
   end record;

   type Info_tutoretzak is record
      NAN: Positive;
      Tutoretzak_Guztira: Natural;
   end record;

   type T_tutoretzak is array(Ikasle_Tartea) of Info_tutoretzak;

   type Ikasleen_tutoretza_zerrenda is record
      Zenbat: Natural;
      Tutoretzak: T_tutoretzak;
   end record;

end datuak;
