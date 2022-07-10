int redLED=13;
int dot=100;
int dash=500;

void setup() {
pinMode(13,OUTPUT);
pinMode(12,OUTPUT);
  // put your setup code here, to run once:

}

void loop() {
digitalWrite(redLED,HIGH);   //S awal
delay(dot);
digitalWrite(redLED,LOW);
delay(dot);

digitalWrite(redLED,HIGH);   //S awal
delay(dot);
digitalWrite(redLED,LOW);
delay(dot);

digitalWrite(redLED,HIGH);   //S awal
delay(dot);
digitalWrite(redLED,LOW);
delay(dot);

digitalWrite(redLED,HIGH);   //O 
delay(dash);
digitalWrite(redLED,LOW);
delay(dash);

digitalWrite(redLED,HIGH);   //O
delay(dash);
digitalWrite(redLED,LOW);
delay(dash);

digitalWrite(redLED,HIGH);   //o
delay(dash);
digitalWrite(redLED,LOW);
delay(dash);

digitalWrite(redLED,HIGH);   //S awal
delay(dot);
digitalWrite(redLED,LOW);
delay(dot);

digitalWrite(redLED,HIGH);   //S awal
delay(dot);
digitalWrite(redLED,LOW);
delay(dot);

digitalWrite(redLED,HIGH);   //S awal
delay(dot);
digitalWrite(redLED,LOW);
delay(dot);

delay(1000);
  // put your main code here, to run repeatedly:

}
