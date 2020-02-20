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

 //while(inputValue == 0){
 // menu();  // Print a message on the LCD
 //   menu0();
  // }   
    
  if(inputValue == 1){
    lcd.setCursor(0, 0);
    pults1=true;
    lcd.clear();
  }

  if(inputValue == 2){
    pults2=true;
    lcd.clear();
    lcd.print("DETECTADO2");
    delay(1000);
  }
  
  if(inputValue == 3){
    pults3=true;
    lcd.clear();
    lcd.print("DETECTADO3");
    delay(1000);
  }

   while(pults1==true){ //erlojua
    
    lcd.setCursor(0, 0);
    lcd.print("    ERLOJUA:    ");
    
    time();
    

   
      inputValue = analogRead(inputPin);
      if(inputValue < 100 && inputValue >= 0){
          pults1=false;
          lcd.setCursor(0, 1);
       lcd.print("    IRTETZEN    ");   
       delay(1000);
      }
    
  }


   while(pults2==true){ //set erlojua
    lcd.print("HAENTRADO2");
    delay(1000);
    lcd.setCursor(0, 0);
    lcd.print("set");
    lcd.setCursor(0, 1);
    lcd.print("set");
          if(inputValue == 2)
          pults2=false;
      
  }


  
}



void menu0(){
     lcd.setCursor(0, 0);
     lcd.print("1: ORD || 2: SET");
     lcd.setCursor(0, 1);
     lcd.print(" 3: TENPERATURA");
}


void time(){

  if (ss==59){
  ss=0;
        if (mm==59){
          mm=0;
          ss=0;
                if (hh==23){
                  hh=0;
                  mm=0;
                  ss=0;
                  }
                else{
                  hh++;}
        }
        else{
          mm++;}
  }
  else{
    ss++;}
delay(1000);
}
