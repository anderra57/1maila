int ledG=11;
int ledL=10;
int ledB=9;
int pults=12;
int pultsegoera=0;
int soinua=2;
int N=1;

void setup(){
pinMode(ledG, OUTPUT);
pinMode(ledL, OUTPUT);
pinMode(ledB, OUTPUT);
pinMode(soinua, OUTPUT);
pinMode(pults, INPUT);
}

void loop (){
digitalWrite(ledG,HIGH);
  
pultsegoera=digitalRead(pults);
if (pultsegoera==HIGH){  
digitalWrite(ledG,LOW);
digitalWrite(ledL,HIGH);
delay(5000);
digitalWrite(ledL,LOW);
digitalWrite(ledB,HIGH);
delay(5000);
for(N;N<=5;N++)
{
digitalWrite(ledB,LOW);
tone(soinua,2000,500);
delay(500);
digitalWrite(ledB,HIGH);
delay(500);
}
digitalWrite(ledB,LOW);
digitalWrite(ledG,HIGH);
}
N=1;
}
