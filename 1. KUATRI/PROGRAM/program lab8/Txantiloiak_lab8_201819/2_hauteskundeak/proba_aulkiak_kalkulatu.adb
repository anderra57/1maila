with motak;
use motak;

with Ada.Text_Io;
use Ada.Text_Io;


with alderdien_botoen_lista_idatzi, aulkiak_idatzi, aulkiak_kalkulatu;


procedure proba_aulkiak_kalkulatu is


   L_P_V_Bizkaia,
   L_P_V_Araba,
   L_P_V_Gipuzkoa : T_Lista_alderdien_botoak;
   aulkiak        : T_Lista_Aulkiak;

begin
   --- Bizkaian 6 alderdi egoteko
   L_P_V_Bizkaia.Alderdi_kop:= 6;
   L_P_V_Bizkaia.Alderdien_taula(1) := ("         PNV/EA", 264774);
   L_P_V_Bizkaia.Alderdien_taula(2) := ("       PSE-PSOE", 151347);
   L_P_V_Bizkaia.Alderdien_taula(3) := ("             PP", 113867);
   L_P_V_Bizkaia.Alderdien_taula(4) := ("           EHAK",  65431);
   L_P_V_Bizkaia.Alderdien_taula(5) := ("          EB-IU",  36258);
   L_P_V_Bizkaia.Alderdien_taula(6) := ("         ARALAR",  10187);
   --- Araban 6 alderdi egoteko
   L_P_V_Araba.Alderdi_kop:= 6;
   L_P_V_Araba.Alderdien_taula(1) := ("         PNV/EA", 51601);
   L_P_V_Araba.Alderdien_taula(2) := ("             PP", 43765);
   L_P_V_Araba.Alderdien_taula(3) := ("       PSE-PSOE", 43765);
   L_P_V_Araba.Alderdien_taula(4) := ("           EHAK",  14180);
   L_P_V_Araba.Alderdien_taula(5) := ("          EB-IU",  8395);
   L_P_V_Araba.Alderdien_taula(6) := ("         ARALAR",  2541);

   --- Gipuzkoan 6 alderdi egoteko
   L_P_V_Gipuzkoa.Alderdi_kop:= 6;
   L_P_V_Gipuzkoa.Alderdien_taula(1) := ("         PNV/EA", 147498);
   L_P_V_Gipuzkoa.Alderdien_taula(2) := ("           EHAK", 78088);
   L_P_V_Gipuzkoa.Alderdien_taula(3) := ("             PP", 70577);
   L_P_V_Gipuzkoa.Alderdien_taula(4) := ("       PSE-PSOE",  51163);
   L_P_V_Gipuzkoa.Alderdien_taula(5) := ("          EB-IU",  20278);
   L_P_V_Gipuzkoa.Alderdien_taula(6) := ("         ARALAR",  15273);

   Put_Line("Hasierako botoak: ");
   alderdien_botoen_lista_idatzi(L_P_V_Bizkaia);
   alderdien_botoen_lista_idatzi(L_P_V_Araba);
   alderdien_botoen_lista_idatzi(L_P_V_Gipuzkoa);

   aulkiak_kalkulatu(L_P_V_Bizkaia, L_P_V_Araba, L_P_V_Gipuzkoa, Aulkiak);
   new_line(2);
   Put_Line("Zuen programaren arabera azken emaitza   ");
   aulkiak_idatzi(Aulkiak);
   new_line(4);

        L_P_V_Bizkaia.Alderdi_kop:= 6;
        L_P_V_Bizkaia.Alderdien_taula(1) := ("         PNV/EA", 264774);
        L_P_V_Bizkaia.Alderdien_taula(2) := ("       PSE-PSOE", 0);
        L_P_V_Bizkaia.Alderdien_taula(3) := ("             PP", 0);
        L_P_V_Bizkaia.Alderdien_taula(4) := ("           EHAK",  0);
        L_P_V_Bizkaia.Alderdien_taula(5) := ("          EB-IU",  0);
        L_P_V_Bizkaia.Alderdien_taula(6) := ("         ARALAR",  0);

        L_P_V_Araba.Alderdi_kop:= 6;
        L_P_V_Araba.Alderdien_taula(1) := ("         PNV/EA", 16000);
        L_P_V_Araba.Alderdien_taula(2) := ("             PP", 0);
        L_P_V_Araba.Alderdien_taula(3) := ("       PSE-PSOE",  0);
        L_P_V_Araba.Alderdien_taula(4) := ("           EHAK",  0);
        L_P_V_Araba.Alderdien_taula(5) := ("          EB-IU",  0);
        L_P_V_Araba.Alderdien_taula(6) := ("         ARALAR",  0);


        L_P_V_Gipuzkoa.Alderdi_kop:= 6;
        L_P_V_Gipuzkoa.Alderdien_taula(1) := ("         PNV/EA", 147498);
        L_P_V_Gipuzkoa.Alderdien_taula(2) := ("           EHAK",  0);
        L_P_V_Gipuzkoa.Alderdien_taula(3) := ("             PP",  0);
        L_P_V_Gipuzkoa.Alderdien_taula(4) := ("       PSE-PSOE",  0);
        L_P_V_Gipuzkoa.Alderdien_taula(5) := ("          EB-IU",  0);
        L_P_V_Gipuzkoa.Alderdien_taula(6) := ("         ARALAR",  0);

        Put_Line("Hasierako botoak: ");
        alderdien_botoen_lista_idatzi(L_P_V_Bizkaia);
        alderdien_botoen_lista_idatzi(L_P_V_Araba);
        alderdien_botoen_lista_idatzi(L_P_V_Gipuzkoa);

        aulkiak_kalkulatu(L_P_V_Bizkaia, L_P_V_Araba, L_P_V_Gipuzkoa, Aulkiak);
        new_line(2);
        Put_Line("Zuen programaren arabera azken emaitza   ");
        aulkiak_idatzi(Aulkiak);
        new_line(4);
    L_P_V_Bizkaia.Alderdi_kop:= 6;
    L_P_V_Bizkaia.Alderdien_taula(1) := ("         PNV/EA", 264774);
    L_P_V_Bizkaia.Alderdien_taula(2) := ("       PSE-PSOE", 0);
    L_P_V_Bizkaia.Alderdien_taula(3) := ("             PP", 0);
    L_P_V_Bizkaia.Alderdien_taula(4) := ("           EHAK",  0);
    L_P_V_Bizkaia.Alderdien_taula(5) := ("          EB-IU",  0);
    L_P_V_Bizkaia.Alderdien_taula(6) := ("         ARALAR",  0);

    L_P_V_Araba.Alderdi_kop:= 6;
    L_P_V_Araba.Alderdien_taula(1) := ("         PNV/EA", 0);
    L_P_V_Araba.Alderdien_taula(2) := ("             PP", 0);
    L_P_V_Araba.Alderdien_taula(3) := ("       PSE-PSOE",  2000);
    L_P_V_Araba.Alderdien_taula(4) := ("           EHAK",  0);
    L_P_V_Araba.Alderdien_taula(5) := ("          EB-IU",  0);
    L_P_V_Araba.Alderdien_taula(6) := ("         ARALAR",  0);


    L_P_V_Gipuzkoa.Alderdi_kop:= 6;
    L_P_V_Gipuzkoa.Alderdien_taula(1) := ("         PNV/EA", 0);
    L_P_V_Gipuzkoa.Alderdien_taula(2) := ("           EHAK",  0);
    L_P_V_Gipuzkoa.Alderdien_taula(3) := ("             PP",  0);
    L_P_V_Gipuzkoa.Alderdien_taula(4) := ("       PSE-PSOE",  0);
    L_P_V_Gipuzkoa.Alderdien_taula(5) := ("          EB-IU",  0);
    L_P_V_Gipuzkoa.Alderdien_taula(6) := ("         ARALAR",  50000);

    Put_Line("Hasierako botoak: ");
    alderdien_botoen_lista_idatzi(L_P_V_Bizkaia);
    alderdien_botoen_lista_idatzi(L_P_V_Araba);
    alderdien_botoen_lista_idatzi(L_P_V_Gipuzkoa);

    aulkiak_kalkulatu(L_P_V_Bizkaia, L_P_V_Araba, L_P_V_Gipuzkoa, Aulkiak);
    new_line(2);
    Put_Line("Zuen programaren arabera azken emaitza   ");
    aulkiak_idatzi(Aulkiak);

end proba_aulkiak_kalkulatu ;
