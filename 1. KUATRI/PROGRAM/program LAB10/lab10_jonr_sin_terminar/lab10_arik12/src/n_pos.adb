--with datuak, hasieran_txertatu, idatzi, sortu_zerrenda_hutsa, Ada.Text_IO, Ada.Integer_Text_IO;
--use datuak, hasieran_txertatu, idatzi, sortu_zerrenda_hutsa, Ada.Text_IO, Ada.Integer_Text_IO;


with Ada.Text_Io, datuak;
with sortu_zerrenda_hutsa, idatzi, txertatu_hasieran;
use Ada.Text_Io, datuak;


procedure n_pos ( U: in Lista; N: in Integer) is
	oraingoa, Lector, L_lag: Lista;
	aux, Kont: integer;
begin
	kont := 0;
	L_lag := null;
	oraingoa := U;
	Lector := U;
	if(U = null) then
		put("Zerrenda hutsa");
	end if;

	loop exit when (lector = null);
		aux := aux + 1;
	end loop;

   if aux <=N then
		loop exit when (oraingoa = null);
			if(kont = N) then
				L_lag := U;
				while (L_lag /= null) loop
					L_lag := L_lag.Hurrengoa;
				end loop;
			else
				kont := kont + 1;
				oraingoa := oraingoa.hurrengoa;
			end if;
		end loop;
	else
		put("Sartu zerrenda elementu kopurua baino txikiagoa den zenbakia");
	end if;
end n_pos;
