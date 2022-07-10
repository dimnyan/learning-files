#include <NewPing.h>
NewPing sonar (2,3,20);

void setup() {
  Serial.begin(9600);
  delay(50);
}

void loop() {
  Serial.println(sonar.ping_cm());
  delay(300);
}
