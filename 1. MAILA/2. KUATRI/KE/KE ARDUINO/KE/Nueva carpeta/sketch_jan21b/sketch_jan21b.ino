int sensorPin0 = A0;    // select the input pin for the potentiometer
int sensorPin1 = A1;
int ledPin6 = 6;
int ledPin9 = 9;
int ledPin10 = 10;
int ledPin11 = 11;
int ledPinA2 = A2;
// select the pin for the LED
int sensorValue0 = 0;  // variable to store the value coming from the sensor
int sensorValue1 = 0;

void setup() {
  // declare the ledPin as an OUTPUT:
  pinMode(ledPin6, OUTPUT);
  pinMode(ledPin9, OUTPUT);
  pinMode(ledPin10, OUTPUT);
  pinMode(ledPin11, OUTPUT);
  pinMode(ledPinA2, OUTPUT);
}

void loop() {
  // read the value from the sensor:
  sensorValue0 = analogRead(sensorPin0);    
  // turn the ledPin on
  digitalWrite(ledPin6, HIGH);  
  // stop the program for <sensorValue> milliseconds:
  delay(sensorValue0);          
  // turn the ledPin off:        
  digitalWrite(ledPin6, LOW);   
  // stop the program for for <sensorValue> milliseconds:
  delay(sensorValue0);                  
  // read the value from the sensor:
  sensorValue0 = analogRead(sensorPin0);    
  // turn the ledPin on
  digitalWrite(ledPin9, HIGH);  
  // stop the program for <sensorValue> milliseconds:
  delay(sensorValue0);          
  // turn the ledPin off:        
  digitalWrite(ledPin9, LOW);   
  // stop the program for for <sensorValue> milliseconds:
  delay(sensorValue0);                  
  // read the value from the sensor:
  sensorValue0 = analogRead(sensorPin0);    
  // turn the ledPin on
  digitalWrite(ledPin10, HIGH);  
  // stop the program for <sensorValue> milliseconds:
  delay(sensorValue0);          
  // turn the ledPin off:        
  digitalWrite(ledPin10, LOW);   
  // stop the program for for <sensorValue> milliseconds:
  delay(sensorValue0);                  
  // read the value from the sensor:
  sensorValue0 = analogRead(sensorPin0);    
  // turn the ledPin on
  digitalWrite(ledPin11, HIGH);  
  // stop the program for <sensorValue> milliseconds:
  delay(sensorValue0);          
  // turn the ledPin off:        
  digitalWrite(ledPin11, LOW);   
  // stop the program for for <sensorValue> milliseconds:
  delay(sensorValue0);
  // read the value from the sensor:
  sensorValue1 = analogRead(sensorPin1);    
  // turn the ledPin on
  analogWrite(ledPinA2, sensorValue1);  
  // stop the program for <sensorValue> milliseconds:
  delay(sensorValue1);          
  // turn the ledPin off:        
  analogWrite(ledPinA2, sensorValue1);   
  // stop the program for for <sensorValue> milliseconds:
  delay(sensorValue1);     
}
