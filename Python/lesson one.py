print("hallo")

print('========= 5 > 2 =========')
if 5>2:
    print("benar")

print('========= PRINT VARIABEL =========')
x = 5 #ini komentar
print(x)
"""
ini komentar
"""

print('========= MULTIPLE VARIABLES =========')
#multiple variables
x,y,z = 5, 6, 7
print(x)
print(y)
print(z)

print('========= COLLECTION OF DATA =========')
#unpack a collection
mobil = "mazda", "benz", "toyota"
x, y ,z = mobil
print(x)
print(y)
print(z)

print('========= GLOBAL VARIABLES =========')
x = "global variabel"

def fungsiKu():
    print("kalau ini " + x)

fungsiKu()

print('========= GLOBAL VARIABLES VER 2 =========')
#global variables kedua
x = "global variabel"

def fungsiKu():
    x = "global variabel kedua"
    print("kalau ini " + x)
fungsiKu()

print("kalau ini " + x)

print('========= GLOBAL KEYWORD =========')
#global keyword
def fungsiSatu():
    global x
    x = "global"
fungsiSatu()

print("x adalah " + x)

print('========= GLOBAL KEYWORD VER 2 =========')
#global keyword kedua
x = "diluar"
def fungsiSatu():
    global x
    x = "global"
fungsiSatu()

print("x adalah " + x)

print('========= DATA TYPE =========')
#data type
x=range(6)
x = 1j
print(x)
print(type(x))
y = float(5)
print(type(y), y)

print('========= RANDOM NUMBER =========')
#random number
from http.client import REQUESTED_RANGE_NOT_SATISFIABLE
import random
print(random.randrange(1,10))

print('========= PILIH ARRAY =========')
#pick an array
x = "bronny"
print(x[1])

