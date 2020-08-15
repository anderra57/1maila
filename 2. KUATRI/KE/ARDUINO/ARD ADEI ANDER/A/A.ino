int ledG=11;
void setup(){
pinMode(ledG, OUTPUT);
}
void loop (){
digitalWrite(ledG,HIGH);
delay(1000); 
digitalWrite(ledG,LOW);
delay(1000);
}
