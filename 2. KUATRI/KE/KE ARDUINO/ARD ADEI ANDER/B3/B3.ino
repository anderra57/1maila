int ledG=11;
int pults=12;

int pultskont=0;
int pultsegoera=0;
int pultsaurrekoegoera=0;

void setup(){
pinMode(ledG, OUTPUT);
pinMode(pults, INPUT);
}

void loop (){
  
 pultsONegoera=digitalRead(pultsON); 
if (pultsONegoera==HIGH){ 
 ledegoera=digitalRead(ledG); 
if (ledegoera==LOW){
  digitalWrite(ledG,HIGH);
}}

 pultsOFFegoera=digitalRead(pultsOFF); 
if (pultsOFFegoera==HIGH){
 ledegoera=digitalRead(ledG);  
if (ledegoera==HIGH){
  digitalWrite(ledG,LOW);
}}


}
