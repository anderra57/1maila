package datuak is

   type Nodo;
   type Lista is access Nodo;
   type Nodo is record
         Info : Integer;
         Hurrengoa  : Lista;
   end record;

end datuak;