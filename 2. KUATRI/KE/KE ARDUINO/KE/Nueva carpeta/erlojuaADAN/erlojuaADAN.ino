#include <LiquidCrystal.h>

#include <Time.h>
#include <TimeLib.h>
LiquidCrystal lcd(7, 6, 5, 4, 3, 2);

// Define constants and variables
const int inputPin = A0;  // buttons array analog input 
const int ledPin =  9;    // backlight control
uint16_t inputValue = 0;   // value read from buttons array
//uint8_t pwmValue = 0;      // value for lcd brightness
int hh = 0;
int mm = 0;
int ss = 0;
boolean pults1=false;
boolean pults2=false;
boolean pults3=false;
boolean pults4=false;


float tempC; // Variable para almacenar el valor obtenido del sensor (0 a 1023)
const int pinLM35 = A1; // Variable del pin de entrada del sensor (A0)

// Initialization
void setup() 
{
  pinMode(ledPin, OUTPUT);
  digitalWrite(ledPin, HIGH);
  lcd.begin(16, 2);              // set up the LCD's number of columns and rows
  Serial.begin(9600);
  

}

// main loop
void loop() 
{
  // check buttons status

  inputValue = analogRead(inputPin);
  if(inputValue < 100 && inputValue >= 0) inputValue = 1;
  else if(inputValue < 250 && inputValue > 150) inputValue = 2;
  else if(inputValue < 470 && inputValue > 370) inputValue = 3;
  else if(inputValue < 670 && inputValue > 570) inputValue = 4;
  else if(inputValue < 870 && inputValue > 770) inputValue = 5;
  else if(inputValue <= 1023 && inputValue > 950) inputValue = 0;

  // update display text
  
  time();
  menu0();
  

  
  
  
  if(inputValue == 0){
 // menu();  // Print a message on the LCD
    menu0();
  }
  
  if(inputValue == 1){ //erlojua
    lcd.clear();
    lcd.setCursor(0, 0);
    lcd.print(hh);
  }
  
  if(inputValue == 2){ //set erlojua
    lcd.clear();
    lcd.setCursor(0, 0);
    lcd.print("set");
    lcd.setCursor(0, 1);
    lcd.print("set");
  }
  
  if(inputValue == 3){ //tenperatura
  // Con analogRead leemos el sensor, recuerda que es un valor de 0 a 1023
  tempC = analogRead(pinLM35); 
   
  // Calculamos la temperatura con la fórmula
  tempC = (5.0 * tempC * 100.0)/1024.0; 
  lcd.clear();
  // Envia el dato al puerto serial
  lcd.print(tempC);
  // Salto de línea
  lcd.print("\n");
  
  // Esperamos un tiempo para repetir el loop
  delay(1000);
  }
  
  
  
  
}



void menu0(){
     lcd.setCursor(0, 0);
     lcd.print("1: ORD || 2: SET");
     lcd.setCursor(0, 1);
     lcd.print("3: TENPERATURA");}

/*
void menu()
{
    while (inputValue == 0){
    lcd.setCursor(0, 0);
    lcd.print("1: ORDUA || 2: SET CLK || 3: TENPERATURA");
    lcd.setCursor(0, 1);
    
    for (int positionCounter = 0; positionCounter < 36; positionCounter++) {
    // scroll one position left:
    lcd.scrollDisplayLeft(); 
    if(inputValue == 1 || inputValue == 2 || inputValue == 3){
        lcd.clear();
        break;}
    // wait a bit:
    delay(500);
    }
    if(inputValue == 1 || inputValue == 2 || inputValue == 3){
        lcd.clear();
        break;}
    }
}
*/

void time(){
if (ss=59){
  ss=0;
        if (mm=59){
          mm=0;
          ss=0;
                if (hh=23){
                  hh=0;
                  mm=0;
                  ss=0;
                  }
          hh++;
        }
  mm++;
}
ss++;
delay(1000);
}
