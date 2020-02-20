//constantes
#include <LiquidCrystal.h> //LCD
#define COLUMNA 16 // Columnas del LCD
#define FILA 2 // Filas del LCD

LiquidCrystal lcd(7, 6, 5, 4, 3, 2);
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
void incrementar();
void set();

void loop(){
  time=millis();
  estadoP1=digitalRead(p1);
  estadoP2=digitalRead(p2);
  estadoP3=digitalRead(p3);
  if(estadoP2==HIGH)
  {
    set();
    delay(d);
  }
  else
  {
    incrementar();
    if(estadoP1==HIGH)
    {mostrar();
    }
    //if(estadoP3==HIGH)
    {
    }
  }
}

void incrementar() {
  delay(1000);
  if(segundo!=60)
  {
    segundo=segundo+1;
  }
  else
  {
    segundo=0;
    if(minuto!=60)
    {
      minuto=minuto+1;
    }
    else
    {
      minuto=0;
      if(hora!=23)
      {
        hora=hora+1;
      }
      else
      {
        hora=0;
      } 
    }
  }
  
}


void set() {
  
  while (estadoP1==LOW){
    delay(d);
    estadoP1=digitalRead(p1);
    estadoP2=digitalRead(p2);
    estadoP3=digitalRead(p3);
    estadoP4=digitalRead(p4);
    estadoP5=digitalRead(p5);
    if (estadoP2==HIGH)
    {
      hora=hora+1;
    }
    if (estadoP3==HIGH)
    {
      hora=hora+5;
    }
    if (estadoP4==HIGH)
    {
      minuto=minuto+1;
    }
    if (estadoP5==HIGH)
    {
      minuto=minuto+10;
    }
    if(minuto>59)
    {
      minuto=minuto-60;
    }
    if(hora>23)
    {
      hora=hora-24;
    }
  }
}

void mostrar(){
  lcd.setCursor(0,0);
  lcd.print(String(hora));
}
