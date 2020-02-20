with ada.text_io, ada.integer_text_io;
use  ada.text_io, ada.integer_text_io;
with datuak;use datuak;

function orekatu (T : in     katea) return Boolean is 
-- aurre: T barnean programako lerro bat du, non parentesiak edota giltzak izan ditzakeen
--        Adib:         if (a > b) { b := a+n ) ; x+y }
-- post: emaitza TRUE izango da orekatua badago, bestela FALSE

   Tlag : katea;  
   I    : Integer;  
   J    : Integer; --Tlag-eko azken elementua adieraziko du.     
   Irten : Boolean := False;
   
begin
   Tlag.luzera := 0;
   J := 0;
   I := 1;






end orekatu;
