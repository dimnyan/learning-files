void setup() {
pinMode(13,OUTPUT);
pinMode(12,OUTPUT);
  // put your setup code here, to run once:

}

void loop() {
digitalWrite(13,HIGH);
delay(500);
digitalWrite(12,HIGH);
delay(100);
digitalWrite(13,LOW);
delay(500);
digitalWrite(12,LOW);
delay(100);
  // put your main code here, to run repeatedly:

}
