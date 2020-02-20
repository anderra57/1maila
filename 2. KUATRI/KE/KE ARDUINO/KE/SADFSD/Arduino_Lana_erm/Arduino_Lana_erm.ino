// include the library code:
#include <LiquidCrystal.h>

// initialize the library with the numbers of the interface pins
LiquidCrystal lcd(7, 6, 5, 4, 3, 2);

const int inputPin = A0;  // buttons array analog input

uint16_t inputValue = 0;   // value read from buttons array

int hrs=23;
int mins=58;
int sec=55;
int cont=0;
int cont2=0;
float graduak;
const int sensorPin= A5;
byte gradua[]={
  B11100,
  B10100,
  B11100,
  B00000,
  B00000,
  B00000,
  B00000,
  B00000
  };

// Initialization
void setup(){
    lcd.begin(16,2);
    lcd.clear();
    lcd.createChar(0,gradua);
}

// main loop
void loop(){    
      inputValue = analogRead(inputPin);
  if(inputValue < 100 && inputValue >= 0) inputValue = 1;
  else if(inputValue < 250 && inputValue > 150) inputValue = 2;
  else if(inputValue < 470 && inputValue > 370) inputValue = 3;
  else if(inputValue < 670 && inputValue > 570) inputValue = 4;
  else if(inputValue < 870 && inputValue > 770) inputValue = 5;
  else if(inputValue <= 1023 && inputValue > 950) inputValue = 0;
 
if(cont >= 4 ){
    cont = 0;
      }  
if(inputValue == 5 ){
    cont ++;
      }     

if(cont == 0){
    if(sec>58){
      sec=0;
      mins ++;
    }
    else { sec ++;
    if(mins>=60){
      mins=0;
      hrs ++;
    }
    if(hrs>23){
    hrs=0;
    }}
      
        lcd.clear();
        lcd.setCursor(0,0);
        lcd.print("Menu: Ordua");
        lcd.setCursor(0,2);
    if (hrs<10){
    lcd.print("0");
    }
    lcd.print(hrs);
    lcd.print(":");
    if (mins<10){
    lcd.print("0");
    }
    lcd.print(mins);
    lcd.print(":");
    if (sec<10){
    lcd.print("0");
    }
    lcd.print(sec);
    delay(1000);
}
        
        
        
        
    
    if(cont==1){
        lcd.clear();
        lcd.setCursor(0,0);
        lcd.print("Menu: Aldatu Ordua");
    lcd.setCursor(0,2);
    if (hrs<10){
    lcd.print("0");
    }
    lcd.print(hrs);
    lcd.print(":");
    if (mins<10){
    lcd.print("0");
    }
    lcd.print(mins);
    lcd.print(":");
    if (sec<10){
    lcd.print("0");
    }
    lcd.print(sec);
    delay(1000);
    
     if(inputValue == 1 ){
      hrs ++;
      }
        if(inputValue == 2 ){
         mins ++;
      }
        if(inputValue == 3 ){
      sec ++;
      }}

 if(cont==3 ){
   if(sec>59){
      sec=0;
      mins ++;
    }
    else { sec ++;
    if(mins>59){
      mins=0;
      hrs ++;
    }
    if(hrs>23){
    hrs=0;
    }}
        lcd.clear();
        lcd.setCursor(0,0);
        lcd.print("Menu: Ordua");
    lcd.setCursor(0,2);
    if (hrs<10){
    lcd.print("0");
    }
    lcd.print(hrs);
    lcd.print(":");
    if (mins<10){
    lcd.print("0");
    }
    lcd.print(mins);
    lcd.print(":");
    if (sec<10){
    lcd.print("0");
    }
    lcd.print(sec);
    delay(1000);
    }

if (cont==2 ){
   graduak=analogRead(sensorPin);
   graduak=(5.0*graduak*100.0)/1024.0;
   lcd.setCursor(0,0);
   
   lcd.print("Menu:Tenperatura");
   lcd.setCursor(0,2);
   lcd.print(graduak);
   lcd.write(byte(0));
   lcd.print("C     ");
   if(sec>59){
      sec=0;
      mins ++;
    }
    else { sec ++;
    if(mins>59){
      mins=0;
      hrs ++;
    }
    if(hrs>23){
    hrs=0;
    }}
    delay(1000);
}






}




