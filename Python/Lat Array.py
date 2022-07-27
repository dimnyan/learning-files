kamar = ["Kamar Mandi", "Kamar Tidur", "Gudang"]
x = 0
'''
for y in kamar:
    print(y)
'''


while x <= len(kamar)-1:
    print (kamar[x], "adalah bagian dari ruangan")
    x += 1

print('===========Multiple Arrays 2===========')

dataDiri = []

nama = 'dimas'
tinggi = '178'
dataDiri.append({nama, tinggi})

print(dataDiri)


print('===========Multiple Arrays Eg===========')    
employees = []
for i in range(5):
    name = 'dimas'
    age = 22
    salary = '12K'
    employees.append({"name": name, "age": age, "salary": salary})

for emp in employees:
    print('{name} is {age} years old and makes ${salary}'.format(**emp))


print('===========Multiple Arrays 3===========')
#this is a third try

seluruhdata = []
num = 0

kamarkamar = ['Kamar Mandi', 'Kamar Tidur']
luaskamar = ['12', '24']
seluruhdata.append ({"kamar": kamarkamar, "luas": luaskamar})

for data in seluruhdata:
    print('{kamar[0]} luasnya adalah {luas[0]}'.format(**data))
    print('{kamar[1]} luasnya adalah {luas[1]}'.format(**data))
    

print('===========Multiple Arrays 4===========')
#pengulangan print dengan panjang array
array = ['Dimas', '2']
tipeData = ['string', 'integer']

print('Panjang Array: ', len(array))

for x in array:
    for i in tipeData:
        print(x, 'tipe datanya adalah', i)
        