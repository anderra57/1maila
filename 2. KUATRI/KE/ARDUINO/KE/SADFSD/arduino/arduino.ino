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
const int inputPin = A0;  // buttons array analog input 
const int ledPin =  9;    // backlight control
const int TPin= A3;

uint16_t inputValue = 0;   // value read from buttons array
//uint8_t pwmValue = 0;      // value for lcd brightness


// Initialization
void setup() 
{
  pinMode(ledPin, OUTPUT);
  digitalWrite(ledPin, HIGH);
  lcd.begin(16, 2);              // set up the LCD's number of columns and rows
  lcd.print("     MENUA   ");  // Print a message on the LCD
  lcd.setCursor(0, 1);           // set the cursor to column 0, line 1
  lcd.print("1-D  2-SET  3-T        ");
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
  if(inputValue == 1 || inputValue == 2 || inputValue == 3 || inputValue == 4 || inputValue == 5)
  {
 
  }
  else
  {
    lcd.setCursor(0, 1);
    lcd.print("1-D  2-SET  3-T        ");
  }

  lcd.setCursor(0,3);
  inputValue = analogRead(TPin)/4;
  serialWrite(inputValue);
  lcd.print(serialWrite ("ºC"));
}