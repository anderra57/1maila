#include <LiquidCrystal.h>

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


//--------------------------------------------------------------------------------
//--------------------------------------------------------------------------------
//                                  AZPIPROGRAMAK
//--------------------------------------------------------------------------------
//--------------------------------------------------------------------------------


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

void erlojua(){
      if (hh<10){
    lcd.setCursor(4, 1);
    lcd.print("0");
    lcd.setCursor(5, 1);
    lcd.print(hh);
    }
    else{lcd.setCursor(4, 1);
    lcd.print(hh);}
    
    lcd.setCursor(6, 1);
    lcd.print(":");
    
    if (mm<10){
    lcd.setCursor(7, 1);
    lcd.print("0");
    lcd.setCursor(8, 1);
    lcd.print(mm);
    }
    else{lcd.setCursor(7, 1);
    lcd.print(mm);}
    
    lcd.setCursor(9, 1);
    lcd.print(":");
    
    if (ss<10){
    lcd.setCursor(10, 1);
    lcd.print("0");
    lcd.setCursor(11, 1);
    lcd.print(ss);
    }
    else{lcd.setCursor(10, 1);
    lcd.print(ss);}
}

 
void tenperatura() {
  lcd.clear();
  // Con analogRead leemos el sensor, recuerda que es un valor de 0 a 1023
  tempC = analogRead(pinLM35); 
   
  // Calculamos la temperatura con la fórmula
  tempC = (5.0 * tempC * 100.0)/1024.0; 
 
  // Envia el dato al puerto serial
  lcd.print(tempC);
  // Salto de línea
  lcd.print("ºC");
  lcd.print("\n");
  
  // Esperamos un tiempo para repetir el loop
  delay(1000);
}



//--------------------------------------------------------------------------------
//--------------------------------------------------------------------------------
//                                PROGRAMA NAGUSIA
//--------------------------------------------------------------------------------
//--------------------------------------------------------------------------------



// main loop
void loop() 
{
//--------------------------------------------------------------------------------
//                                PIN IRAKURKETA
//--------------------------------------------------------------------------------
  inputValue = analogRead(inputPin);
  if(inputValue < 100 && inputValue >= 0) inputValue = 1;
  else if(inputValue < 250 && inputValue > 150) inputValue = 2;
  else if(inputValue < 470 && inputValue > 370) inputValue = 3;
  else if(inputValue < 670 && inputValue > 570) inputValue = 4;
  else if(inputValue < 870 && inputValue > 770) inputValue = 5;
  else if(inputValue <= 1023 && inputValue > 950) inputValue = 0;



//--------------------------------------------------------------------------------
//                      TIME HASIERATU ETA MENUA AGERTARAZI
//--------------------------------------------------------------------------------
  time();
  menu0(); 



//--------------------------------------------------------------------------------
//          BOTOIAK SAKATZEAN: 1,2 ETA 3 MENUAK AGERTZEKO BAIMENA EMAN
//--------------------------------------------------------------------------------
    
  if(inputValue == 1){
    lcd.setCursor(0, 0);
    pults1=true;
    lcd.clear();
  }

  if(inputValue == 2){
    lcd.setCursor(0, 0);
    pults2=true;
    lcd.clear();
  }
  
  if(inputValue == 3){
    lcd.setCursor(0, 0);
    pults3=true;
    lcd.clear();
  }



//--------------------------------------------------------------------------------
//                                    ERLOJUA
//--------------------------------------------------------------------------------

  while(pults1==true){ //erlojua
    
    lcd.setCursor(0, 0);
    lcd.print("    ERLOJUA:    ");
    
    time();
    erlojua();
   
      inputValue = analogRead(inputPin);
      if(inputValue < 100 && inputValue >= 0){
          pults1=false;
          lcd.setCursor(0, 1);
       lcd.print("    IRTETZEN    ");   
       delay(1000);
      }
    
  }//close while pults1



//--------------------------------------------------------------------------------
//                                   SET CLK
//--------------------------------------------------------------------------------

   while(pults2==true){ //SET erlojua (2. BOTOIA)
    
    lcd.setCursor(0, 0);
    lcd.print("   SET MENUA:   ");

    time();
    erlojua();

      inputValue = analogRead(inputPin);
      if(inputValue < 250 && inputValue > 150){ //ATERA (2. BOTOIA)
          pults2=false;
          lcd.setCursor(0, 1);
       lcd.print("    IRTETZEN    ");   
       delay(1000);
      }
      
      if(inputValue < 470 && inputValue > 370){ //ORDUA ALDATU (3 BOTOIA)
          hh++;
      }

      if(inputValue < 670 && inputValue > 570){ //MINUTUAK ALDATU (4 BOTOIA)
          mm++;
      }         
   } //close while pults2



//--------------------------------------------------------------------------------
//                                  TENPERATURA
//--------------------------------------------------------------------------------

  while(pults3==true){ //TENPERATURA (2. BOTOIA)
  tenperatura();
  
      inputValue = analogRead(inputPin);
      if(inputValue < 470 && inputValue > 370){ //ATERA (3. BOTOIA)
          pults3=false;
          lcd.setCursor(0, 1);
       lcd.print("    IRTETZEN    ");   
       delay(1000);
      }
      
  }//close while pults3
} //close loop
