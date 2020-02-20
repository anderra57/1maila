//constantes
#include <LiquidCrystal.h> //LCD
#define COLUMNA 16 // Columnas del LCD
#define FILA 2 // Filas del LCD

LiquidCrystal lcd(12, 11, 5, 4, 3, 2);
int d=300;
int p1=1;
int p2=2;
int p3=3;
int p4=4;
int p5=5;
//variables
int segundo=0;
int minuto=0;
int hora=0;
int time=0;
int estadoP1=0;
int estadoP2=0;
int estadoP3=0;
int estadoP4=0;
int estadoP5=0;

void setup(){
  Serial.begin(9600);
  lcd.begin(COLUMNA, FILA);
  pinMode(p1,INPUT);
  pinMode(p2,INPUT);
  pinMode(p3,INPUT);
  pinMode(p4,INPUT);
  pinMode(p5,INPUT);
}

void mostrar();


void loop(){
  time=millis();
  estadoP1=digitalRead(p1);
  mostrar();
}



void mostrar(){
  lcd.setCursor(1, 1);
  lcd.print("HOLA MUNDO!");
}
