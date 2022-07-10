String myString="oh ";
int x=1;
String times=" times ";
float pi=3.14;
String is=" is ";
float hasil;
int delay1=500;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(115200);

}

void loop() {
  // put your main code here, to run repeatedly:
  hasil=x*pi;
  Serial.print(myString);
  Serial.print(x);
  Serial.print(times);
  Serial.print(pi);
  Serial.print(is);
  Serial.println(hasil);
  delay(delay1);
  x=x+.5;

}
