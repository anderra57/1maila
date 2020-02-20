with Ada.Text_Io, Ada.Float_Text_Io;
use Ada.Text_Io, Ada.Float_Text_Io;

with sortu_zerrenda_hutsa, idatzi, bataz_bestekoa, txertatu_hasieran;

with datuak;
use datuak;

use Ada.Text_Io, Ada.Float_Text_Io;


procedure proba_bataz_bestekoa is


	Lis : Lista; -- variable del programa principal


	procedure return_eskatu is
	begin
		Put_Line("Sakatu return jarraitzeko ");
		Skip_Line;
	end return_eskatu;

begin -- programa nagusia
	-- Proba kasuak:
	--   1. Lista hutsa. Emaitza: zero
	--   2. Lista ez-hutsa. Lista elementu bakar batekin
	--   3. Lista ez_hutsa. Lista hainbat elementuekin

	Put_Line("Proba programa: ");
	Put_Line("*********");

	Sortu_zerrenda_hutsa(Lis);
	Put_Line("1. Proba kasua: Zerrenda hutsa ");
	Put_Line("Orain zero idatzi beharko luke: ");
	Put(Bataz_bestekoa(Lis), exp => 0);
	New_Line;
	New_Line;
	return_eskatu;

	Sortu_Zerrenda_hutsa(Lis);
	txertatu_hasieran(Lis, 4);
	Put_Line("2. Proba kasua: lista elementu bakar batekin.");
	Put_Line("Hasierako listak hurrengo elementuak ditu ");
	idatzi(Lis);
	Put_Line("Orain 4.00 idatzi beharko luke: ");
	Put(Bataz_bestekoa(Lis), exp => 0);
	New_Line;
	New_Line;
	return_eskatu;


	Sortu_Zerrenda_hutsa(Lis);
	txertatu_hasieran(Lis, 6);
	txertatu_hasieran(Lis, 8);
	txertatu_hasieran(Lis, 9);
	txertatu_hasieran(Lis, 10);
	Put_Line("3. proba kasua: lista hainbat elementuekin.");
	Put_Line("Listak hurrengo elementuak ditu ");
	Idatzi(Lis);
	Put_Line("Orain 8.25 idatzi beharko luke: ");
	Put(Bataz_bestekoa(Lis), exp => 0);
	New_Line;
	New_Line;
	return_eskatu;

	Put_Line("Amaitu da!!. Agur!! ");
end proba_bataz_bestekoa ;


