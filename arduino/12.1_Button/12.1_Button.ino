int but=2;
int butVal;

void setup() {
  Serial.begin(9600);
  pinMode(but,INPUT);
  digitalWrite(but,HIGH);
  
  // put your setup code here, to run once:

}

void loop() {
  butVal=digitalRead(but);
  Serial.println(butVal);
  // put your main code here, to run repeatedly:

}
