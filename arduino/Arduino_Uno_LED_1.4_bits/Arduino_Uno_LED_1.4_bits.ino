int D1=13;
int D2=12;
int D3=11;
int D4=10;
int delLED=300;

void setup() {
pinMode(D1,OUTPUT);
pinMode(D2,OUTPUT);
pinMode(D3,OUTPUT);
pinMode(D4,OUTPUT);

  // put your setup code here, to run once:

}

void loop() {
digitalWrite(D1,LOW); //0000
digitalWrite(D2,LOW);
digitalWrite(D3,LOW); 
digitalWrite(D4,LOW);
delay (delLED);
digitalWrite(D1,HIGH); //0001
digitalWrite(D2,LOW);
digitalWrite(D3,LOW); 
digitalWrite(D4,LOW);
delay (delLED);
digitalWrite(D1,LOW); //0010
digitalWrite(D2,HIGH);
digitalWrite(D3,LOW); 
digitalWrite(D4,LOW);
delay (delLED);
digitalWrite(D1,HIGH); //0011
digitalWrite(D2,HIGH);
digitalWrite(D3,LOW); 
digitalWrite(D4,LOW);
delay (delLED);
digitalWrite(D1,LOW); //0100
digitalWrite(D2,LOW);
digitalWrite(D3,HIGH); 
digitalWrite(D4,LOW);
delay (delLED);
digitalWrite(D1,HIGH); //0101
digitalWrite(D2,LOW);
digitalWrite(D3,HIGH); 
digitalWrite(D4,LOW);
delay (delLED);
digitalWrite(D1,HIGH); //0111
digitalWrite(D2,HIGH);
digitalWrite(D3,HIGH); 
digitalWrite(D4,LOW);
delay (delLED);
digitalWrite(D1,LOW); //1000
digitalWrite(D2,LOW);
digitalWrite(D3,LOW); 
digitalWrite(D4,HIGH);
delay (delLED);
digitalWrite(D1,HIGH); //1001
digitalWrite(D2,LOW);
digitalWrite(D3,LOW); 
digitalWrite(D4,HIGH);
delay (delLED);
digitalWrite(D1,LOW); //1010
digitalWrite(D2,HIGH);
digitalWrite(D3,LOW); 
digitalWrite(D4,HIGH);
delay (delLED);
digitalWrite(D1,HIGH); //1011
digitalWrite(D2,HIGH);
digitalWrite(D3,LOW); 
digitalWrite(D4,HIGH);
delay (delLED);
digitalWrite(D1,LOW); //1100
digitalWrite(D2,LOW);
digitalWrite(D3,HIGH); 
digitalWrite(D4,HIGH);
delay (delLED);
digitalWrite(D1,HIGH); //1101
digitalWrite(D2,LOW);
digitalWrite(D3,HIGH); 
digitalWrite(D4,HIGH);
delay (delLED);
digitalWrite(D1,LOW); //1110
digitalWrite(D2,HIGH);
digitalWrite(D3,HIGH); 
digitalWrite(D4,HIGH);
delay (delLED);
digitalWrite(D1,HIGH); //1111
digitalWrite(D2,HIGH);
digitalWrite(D3,HIGH); 
digitalWrite(D4,HIGH);
delay (delLED);
  // put your main code here, to run repeatedly:

}
