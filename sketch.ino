#include <JoystickShield.h>

const byte a = 2;  
const byte b = 3;  
const byte c = 4;
const byte d = 5;
const byte e = 6;
const byte f = 7;
const byte k = 8;

const byte joystickXPin = A0;
const byte joystickYPin = A1;
int joystickX;
int joystickY;

boolean isActiveA = false; 
boolean isActiveB = false;
boolean isActiveC = false;
boolean isActiveD = false;
boolean isActiveE = false;
boolean isActiveF = false;
boolean isActiveK = false;

JoystickShield joystickShield;

void setup()
{
  Serial.begin(9600);
  delay(100);
  joystickShield.calibrateJoystick();
}

void loop()
{
  joystickShield.processEvents();
  if(digitalRead(a) == LOW) 
  {
    Serial.println("A");
    delay(250);
  }
  if(digitalRead(b) == LOW)
  {
    Serial.println("B");
    delay(250);
  }
  if(digitalRead(c) == LOW)
  {
    Serial.println("C");
    delay(250);
  }
  if (digitalRead(d) == LOW)
  {
    Serial.println("D");
    delay(250);
  }
  if (digitalRead(e) == LOW)
  {
    Serial.println("E");
    delay(250);
  }
  if(digitalRead(f) == LOW)
  {
    Serial.println("F");
    delay(250);
  }
  if (digitalRead(k) == LOW)
  {
    Serial.println("K");
    delay(250);
  }

  joystickX = analogRead(joystickXPin); 
  Serial.print("x "); Serial.println(joystickX);
 
  joystickY = analogRead(joystickYPin);    
  Serial.print("y "); Serial.println(joystickY);

}
