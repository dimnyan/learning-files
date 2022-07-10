#include <Arduino.h>

/* Include this library */
#include "Segment.h"
#include "Digit.h"
#include "Display.h"

const byte digit_pins[4] {6, 9, 10, 12}; // From com1 - com4
const byte segment_pins[7] {7, 11, 2, 4, 5, 8, 13}; // From a - g (abc...g)
const byte dp_pin = 3;

Display d(digit_pins, segment_pins, dp_pin);

void setup() {
  for (int i = 0; i <= A5; i++) {
    pinMode(i, OUTPUT);
  }
}

void loop() {
  d.print("1.234"); // Must be looped!
}
