with Datos, Ada.Text_Io;
use Datos, Ada.Text_Io;

with insertar_en_la_posicion_nsima, escribir, crear_lista_vacia, insertar_al_comienzo;


procedure Prueba_Insertar_en_posicion is 
    
    Lis: Lista;
    
    procedure Pedir_Return is 
    begin
        Put_Line("pulsa return para continuar ");
        Skip_Line;
    end Pedir_Return;
    
begin
    
    Put_Line("Programa de prueba: ");
    Put_Line("*********");
    
    Crear_Lista_Vacia(Lis);
    Put_Line("Caso de prueba 1: Insertar en lista vacia en la posicion 1 ");
    Insertar_en_la_posicion_nsima(Lis, 5,1);
    Put_Line("Ahora deberia escribir la lista <5> ");
    Escribir(Lis);
    New_Line;
    New_Line;
    Pedir_Return;
    
    Crear_Lista_Vacia(Lis);
    Insertar_Al_Comienzo(Lis, 4);
    Insertar_Al_Comienzo(Lis, 9);
    Insertar_Al_Comienzo(Lis, 7);
    Insertar_Al_Comienzo(Lis, 5);
    Put_Line("Caso de prueba 2: insertar en la mitad");
    Put_Line("La lista inicial contiene ");
    Escribir(Lis);
    Insertar_en_la_posicion_nsima(Lis,3,3);
    Put_Line("Ahora deberia escribir la lista <5, 7, 3, 9, 4> ");
    Escribir(Lis);
    New_Line;
    New_Line;
    Pedir_Return;
    
    
    
    Crear_Lista_Vacia(Lis);
    Insertar_Al_Comienzo(Lis, 4);
    Insertar_Al_Comienzo(Lis, 9);
    Insertar_Al_Comienzo(Lis, 7);
    Insertar_Al_Comienzo(Lis, 5);
    Put_Line("Caso de prueba 3: insertar al final");
    Put_Line("La lista inicial contiene ");
    Escribir(Lis);
    Insertar_en_la_posicion_nsima(Lis, 3,5);
    Put_Line("Ahora deberia escribir la lista <5, 7, 9, 4, 3> ");
    Escribir(Lis);
    New_Line;
    New_Line;
    Pedir_Return;
    
    
    
    Crear_Lista_Vacia(Lis);
    Insertar_Al_Comienzo(Lis, 4);
    Insertar_Al_Comienzo(Lis, 9);
    Insertar_Al_Comienzo(Lis, 7);
    Insertar_Al_Comienzo(Lis, 5);
    Put_Line("Caso de prueba 3: insertar en el principio");
    Put_Line("La lista inicial contiene ");
    Escribir(Lis);
    Insertar_en_la_posicion_nsima(Lis, 3,1);
    Put_Line("Ahora deberia escribir la lista <3, 5, 7, 9, 4> ");
    Escribir(Lis);
    New_Line;
    New_Line;
    Pedir_Return;
    
    
    
    
end;

