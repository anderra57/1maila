with Ada.Text_Io, datuak;
with sortu_zerrenda_hutsa, idatzi, txertatu_bukaeran;
use Ada.Text_Io, datuak;

procedure proba_txertatu_bukaeran is 

	Lis : Lista; 

	procedure return_eskatu is 
	begin
		put_line("return sakatu jarraitzeko ");
		skip_line;
	end return_eskatu;

begin -- programa nagusia
	-- Proba kasuak:
	--   1. zerrenda hutsa. 
	--   2. Zerrenda ez hutsa 

	put_line("Proba programa: ");
	put_line("*********");

	sortu_zerrenda_hutsa(Lis);
	put_line("Proba kasua 1: Zerrenda hutsa ");
	put_line("Hasierako zerrenda: ");
	idatzi(Lis);
	txertatu_bukaeran(Lis, 4);
	put_line("Orain honakoa idatzi beharko luke <4>: ");
	idatzi(Lis);
	new_line;
	new_line;
	return_eskatu;

	sortu_zerrenda_hutsa(Lis);
	txertatu_bukaeran(Lis, 4);
	put_line("Proba kasua 2.1: Zerrenda ez hutsa ");
	put_line("Hasierako zerrenda: ");
	idatzi(Lis);
	txertatu_bukaeran(Lis, 2);
	put_line("Orain honakoa idatzi beharko luke <4, 2>: ");
	idatzi(Lis);
	new_line;
	new_line;
	return_eskatu;

	sortu_zerrenda_hutsa(Lis);
	txertatu_bukaeran(Lis, 4);
	txertatu_bukaeran(Lis, 6);
	put_line("proba kasua 2.2: Zerrenda ez hutsa ");
	put_line("Hasierako zerrenda: ");
	idatzi(Lis);
	txertatu_bukaeran(Lis, 2);
	put_line("Orain honakoa idatzi beharko luke <4, 6, 2>: ");
	idatzi(Lis);
	new_line;
	new_line;
	return_eskatu;

	put_line("Amaitu da! Agur ");

end proba_txertatu_bukaeran;


