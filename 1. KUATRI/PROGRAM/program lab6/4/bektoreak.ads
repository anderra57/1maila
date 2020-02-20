package bektoreak is

   Max_Elem : constant Integer := 10;  

   type Osokoen_Bektorea is array (Integer range <>) of Integer;

   type Osokoen_Zerrenda is 
      record 
         Zenbakiak : Osokoen_Bektorea (1 .. Max_Elem);  
         Kont    : Integer;  
      end record; 
   
   type Errealen_Bektorea is array (Integer range <>) of Float;
   type Boolearren_Bektorea is array (Integer range <>) of Boolean;
   type Karaktereen_Bektorea is array (Integer range <>) of Character;
   
end bektoreak;
