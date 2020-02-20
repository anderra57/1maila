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
  
 pultsegoera=digitalRead(pults); 
if (pultsegoera!=pultsaurrekoegoera){ 
if (pultsegoera==HIGH){
  pultskont++;
}}

pultsaurrekoegoera=pultsegoera;
if(pultskont %2 == 0){
    digitalWrite(ledG,LOW);}
else{digitalWrite(ledG,HIGH);}

}
