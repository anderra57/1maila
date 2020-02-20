#include <LiquidCrystal.h>

LiquidCrystal lcd(7, 6, 5, 4, 3, 2);

// constants and variables
const int inputPin = A0;  // buttons array 
const int ledPin =  9;    
uint16_t inputValue = 0;   
int hh = 0;
int mm = 0;
int ss = 0;
boolean pults1=false;
boolean pults2=false;
boolean pults3=false;
boolean pults4=false;

byte degree[8] = { // " º " ZEINUA KOKATZEKO
  B00111,
  B00101,
  B00111,
  B00000,
  B00000,
  B00000,
  B00000,
};

float tempC;
const int pinLM35 = A1;

// Initialization
void setup() 
{
  pinMode(ledPin, OUTPUT);
  digitalWrite(ledPin, HIGH);
  lcd.createChar(0, degree);
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
  // SENTSOREA IRAKURRI (0..1024)
  tempC = analogRead(pinLM35); 
   
  // FORMULA (-> ºC)
  tempC = (5.0 * tempC * 100.0)/1024.0; 
 
  lcd.setCursor(0, 0);
  lcd.print("TENPERATURA: M:3");
  lcd.setCursor(4, 1);
  lcd.print(tempC);
  lcd.setCursor(9, 1);
  lcd.print(" ");
  lcd.write(byte(0));
  lcd.print("C");
  
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
    lcd.print(" ERLOJUA:  (M:1) ");
    
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
    lcd.print("SET MENUA: (M:2)");
    lcd.setCursor(0, 1);
    lcd.print("h:3|");
    lcd.setCursor(12, 1);
    lcd.print("|m:4");   
    
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
          if (hh==23){//23tik 0ra
            hh=0;
          }
          else {//bestela, ++
            hh++;
          }
      }

      if(inputValue < 670 && inputValue > 570){ //MINUTUAK ALDATU (4 BOTOIA)
          if (mm==59){//59tik 0ra
            mm=0;
          }
          else{//bestela, ++
            mm++;
          }
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
