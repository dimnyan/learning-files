 #include<Servo.h>
Servo Myservo;
int pos;
int GLED = 2;
int RLED = 3;
int buzz = 8;
int IRPin = A0;
int IRval ;

void setup() {
  Serial.begin(9600);
  pinMode(GLED,OUTPUT);
  pinMode(RLED,OUTPUT);
  pinMode(buzz,OUTPUT);
  Myservo.attach(A1);
  
}

void loop() {
  IRval=analogRead(IRPin);
  Serial.print("sensor :");
  Serial.println(IRval);
  delay(200);

  if(IRval<100){
    digitalWrite(RLED,HIGH);
    digitalWrite(GLED,LOW);
    digitalWrite(buzz,LOW);
    Myservo.write(175);
    delay(200);
  }

  else{
    digitalWrite(GLED,HIGH);
    digitalWrite(RLED,LOW);
    digitalWrite(buzz,HIGH);
    Myservo.write(0);
    delay(200);
  }
    delay(500);
    
}
