import random
test = random.sample(range(1, 101), 20)

def insert_sort(lista):
    for i in range(len(lista)):
        for j in range(i + 1, len(lista)):
            if lista[i] > lista[j]:
                lista[j], lista[i] = lista[i], lista[j]
    return lista

print(
    insert_sort(test)
)
