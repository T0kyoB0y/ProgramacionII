N = 10

i = 0
j = 0
cont = 0

while i < N:
    while j <= i:
        cont += 1
        j += 1
    j = 0
    i += 1

print(cont)