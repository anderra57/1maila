#include <LiquidCrystal.h>

#include <Time.h>
#include <TimeLib.h>
LiquidCrystal lcd(7, 6, 5, 4, 3, 2);

float tempC; // Variable para almacenar el valor obtenido del sensor (0 a 1023)
int pinLM35 = A1; // Variable del pin de entrada del sensor (A0)
 
void setup() {
  // Configuramos el puerto serial a 9600 bps
  Serial.begin(9600);
 
}
 
void loop() {
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
