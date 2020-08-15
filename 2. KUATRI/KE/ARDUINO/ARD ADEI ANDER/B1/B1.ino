int ledG=11;
int pults=12;
int pultsegoera=0;
void setup(){
pinMode(ledG, OUTPUT);
pinMode(pults, INPUT);
}
void loop (){
pultsegoera=digitalRead(pults);
if (pultsegoera==HIGH){  
digitalWrite(ledG,HIGH);}
else{
digitalWrite(ledG,LOW);
delay(1000);}
}
