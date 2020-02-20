
package def_datuak is

   Max_Elem : constant Integer := 1000;  
   
   type osokoen_bektorea is array (1..Max_Elem) of integer;
    
   type osokoen_zerrenda is 
      record 
         zenbakiak : osokoen_bektorea;  
         zenbat    : Integer;  
      end record; 

end def_datuak;
