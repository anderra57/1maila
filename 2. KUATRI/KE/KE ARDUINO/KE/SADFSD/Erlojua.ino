/*##############################################################################
 Author:
 * Mirko Prosseda (08-2018)
 * email: mirko.prosseda@gmail.com
 
 Description:
 * LCD Shield for Arduino 16x2 test sketch v2.0
 * Print a default text on the lcd display, and update it if any button is pressed.
 
 Connections:
 * LCD    -> ARDUINO
 * RS     -> 7
 * Enable -> 6
 * D4     -> 5
 * D5     -> 4
 * D6     -> 3
 * D7     -> 2
 * R/W    -> GND
 * light  -> 9
 * Buttons array is connected to the analog input A0
##############################################################################*/


// include the library code:
#include <LiquidCrystal.h>

// initialize the library with the numbers of the interface pins
LiquidCrystal lcd(7, 6, 5, 4, 3, 2);


// Define constants and variables
const int inputPin = A0;// buttons array analog input 
const int sensorPin=A1;
const int ledPin =  9;    // backlight control
int h = 0;
int m = 0;
int s = 0;
int i = 1;
int x = 0;
uint16_t inputValue = 0;

//uint8_t pwmValue = 0;      // value for lcd brightness


// Initialization
void setup() 
{
  pinMode(ledPin, OUTPUT);
  digitalWrite(ledPin, HIGH);
  lcd.begin(16, 2);     // set up the LCD's number of columns and rows
  lcd.setCursor(0, 0);
  lcd.print("Menu:  1. CLK");  // Print a message on the LCD
  lcd.setCursor(0, 1);           // set the cursor to column 0, line 1
  lcd.print("2. SET 3. TEMP");
  
  Serial.begin(9600);
  // Configuramos el puerto serial a 9600 bps
 
  
}

// main loop
void loop() 
{
  
  //Reloj
  delay(100);
  i=i+1;
  if (i==10){
    s=s+1;
    i=1;
    if (s==60){
      s=0;
      m=m+1;
      if (m==60){
        m=0;
        h=h+1;
        if ((h==24)){
          h=0;
          m=0;
          s=0;
        }
      }
    }
  }
  
  // check buttons status
  inputValue = analogRead(inputPin);
  if(inputValue < 100 && inputValue >= 0) inputValue = 1;
  else if(inputValue < 250 && inputValue > 150) inputValue = 2;
  else if(inputValue < 470 && inputValue > 370) inputValue = 3;
  else if(inputValue < 670 && inputValue > 570) inputValue = 4;
  else if(inputValue < 870 && inputValue > 770) inputValue = 5;
  else if(inputValue <= 1023 && inputValue > 950) inputValue = 0;
  
 
  // update display text
  if(inputValue == 1){
    x=1;
  }
  if(x==1)
  {
    lcd.setCursor(0, 1);          
    lcd.print("                ");
    lcd.setCursor(6, 1);        
    lcd.print("Hora");
    lcd.setCursor(0,0);
    lcd.print("                ");
    if (h>9){
      lcd.setCursor(4,0);
      lcd.print(h);
    }
    else{
      lcd.setCursor(4,0);
      lcd.print(0);
      lcd.setCursor(5,0);
      lcd.print(h);
    }
    lcd.setCursor(6,0);
    lcd.print(":");
    if (m>9){
      lcd.setCursor(7,0);
    lcd.print(m);
    }
    else{
      lcd.setCursor(7,0);
      lcd.print(0);
      lcd.setCursor(8,0);
      lcd.print(m);
    }
    lcd.setCursor(9,0);
    lcd.print(":");
    if (s>9){
      lcd.setCursor(10,0);
    lcd.print(s);
    }
    else{
      lcd.setCursor(10,0);
      lcd.print(0);
      lcd.setCursor(11,0);
      lcd.print(s);
    }
    
  }
  
if (inputValue==2){
  x=2;  
  }
if( x==2){
  lcd.setCursor(0, 1);          
  lcd.print("                ");
  lcd.setCursor(2, 1);           // set the cursor to column 0, line 1
  lcd.print("Cambiar Hora");
  if (inputValue==4 && x==2){
    h=h+1;
    if (h==24){
    h=0;
  }
    
  }
  else if (inputValue==5 && x==2){
    m=m+1;
    if (m==60){
    m=0;
    h=h+1;
  }
  }
  lcd.setCursor(0,0);
    lcd.print("                ");
    if (h>9){
      lcd.setCursor(4,0);
      lcd.print(h);
    }
    else{
      lcd.setCursor(4,0);
      lcd.print(0);
      lcd.setCursor(5,0);
      lcd.print(h);
    }
    lcd.setCursor(6,0);
    lcd.print(":");
    if (m>9){
      lcd.setCursor(7,0);
    lcd.print(m);
    }
    else{
      lcd.setCursor(7,0);
      lcd.print(0);
      lcd.setCursor(8,0);
      lcd.print(m);
    }
    lcd.setCursor(9,0);
    lcd.print(":");
    if (s>9){
      lcd.setCursor(10,0);
    lcd.print(s);
    }
    else{
      lcd.setCursor(10,0);
      lcd.print(0);
      lcd.setCursor(11,0);
      lcd.print(s);
}
}
if (inputValue==3){
  x=3;
  }
if (x==3){
  lcd.setCursor(0, 1);          
  lcd.print("                ");
  lcd.setCursor(3, 1);          
  lcd.print("Temperatura");
  int value = analogRead(sensorPin);
  float millivolts = ((value / 1023.0)*5000);
  float celsius = millivolts / 10;
  lcd.setCursor(0,0); 
  lcd.print("                ");
  lcd.setCursor(4,0);
  lcd.print(celsius);
  lcd.setCursor(10,0);
  lcd.print("C");
  delay(500);
  
  
  
  } 
}
 
  
  



