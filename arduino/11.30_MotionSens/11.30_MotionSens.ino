int sensPin=2;
int LED=3;
int sen

void setup() {
  Serial.begin(9600);
  pinMode(sensPin,INPUT);
  pinMode(LED,OUTPUT);
}

void loop() {
  sens=digitalRead(sensPin);
//Serial.println(sens);

  if(sens==HIGH){
    digitalWrite(LED,HIGH);
    delay(5000);
  }
  else{
    digitalWrite(LED,LOW);
  
  }

}
