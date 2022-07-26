
#Program ini adalah program memasukan angka yang bermetode komparasi dan logika

#input
inputUser = float(input('Masukkan angka 0 sampai 5 atau 8 sampai 11 \n:'))

# 0 - 5
bandinganNol = inputUser > 0
bandinganLima = inputUser < 5
nolLima = bandinganLima and bandinganNol

# 8 - 11
bandinganDelapan = inputUser > 8
bandinganSebelas = inputUser < 11
delapanSebelas = bandinganDelapan and bandinganSebelas

hasilAkhir = nolLima or delapanSebelas
print(hasilAkhir)