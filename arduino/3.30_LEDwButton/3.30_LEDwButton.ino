int BUTTON = 2;
int LED = 13;
int BUTTONstate = 1;

void setup()
{
  pinMode(2,INPUT);
  pinMode(13,OUTPUT);
}

void loop()
{
  if (2 == HIGH)
  {
    digitalWrite(13, HIGH);
  } 
  else{
    digitalWrite(13, LOW);
  }
}
