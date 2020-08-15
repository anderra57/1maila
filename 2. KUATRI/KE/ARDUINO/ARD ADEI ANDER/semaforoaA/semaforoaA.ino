
int pults=12;


int pultsegoera=0;
int soinua=2;
int N=1;

void setup(){
pinMode(soinua, OUTPUT);
pinMode(pults, INPUT);
}

void loop (){
  
 pultsegoera=digitalRead(pults); 

if (pultsegoera==HIGH){
for (N;N<=5;N++){
tone(soinua,N*2000,2000);
delay(2000);

}
}


}
