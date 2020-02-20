with Ada.Text_Io, datuak;
with sortu_zerrenda_hutsa, idatzi, txertatu_hasieran;
use Ada.Text_Io, datuak;
with n_pos;

procedure proba_kasuak is 

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
	txertatu_hasieran(Lis, 4);
	n_pos(Lis, 4);
	put_line("Orain honakoa idatzi beharko luke <4>: ");
	idatzi(Lis);
	new_line;
	new_line;
	return_eskatu;
end proba_kasuak;
