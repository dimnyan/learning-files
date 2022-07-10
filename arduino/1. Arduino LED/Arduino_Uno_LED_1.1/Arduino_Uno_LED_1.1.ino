int D1=13;
int D2=12;
int delLED=300;

void setup() {
pinMode(13,OUTPUT);
pinMode(12,OUTPUT);
  // put your setup code here, to run once:

}

void loop() {
digitalWrite(D1,HIGH);
digitalWrite(D2,HIGH);
delay (delLED);
digitalWrite(D1,LOW);
digitalWrite(D2,LOW);
delay (delLED);
  // put your main code here, to run repeatedly:

}
