int ledG=11;
int pultsON=12;
int pultsOFF=8;
int pultsONegoera=0;
int pultsOFFegoera=0;
int ledegoera=0;
void setup(){
pinMode(ledG, OUTPUT);
pinMode(pultsON, INPUT);
pinMode(pultsOFF, INPUT);
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
