package loteria_datuak is
kategoria_bakoitzean_sari_max: constant Integer := 100;
type boletoen_taula is array(1..kategoria_bakoitzean_sari_max) of Integer;

subtype zero_eta_tope_bitarteko_balioak is Integer range 0 .. kategoria_bakoitzean_sari_max ;
type boleto_sarituen_lista is record
    zenbat: zero_eta_tope_bitarteko_balioak;
    boletoak: Boletoen_taula;
end record;

type T_sari_datuak is array(3 .. 6) of boleto_sarituen_lista;
end loteria_datuak;
