#!/usr/bin/python

def BSearch(lista, objetivo, inicio=0, fin=None):
    if fin is None:
        fin = len(lista) - 1
    
    if inicio > fin:
        return -1
    
    medio = (inicio + fin) // 2

    if lista[medio] == objetivo:
        return medio
    elif lista[medio] < objetivo:
        return BSearch(lista, objetivo, medio + 1, fin)
    else:
        return BSearch(lista, objetivo, inicio, medio - 1)

array = [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
obj = 12

resultado = BSearch(array, obj)

if resultado != -1:
    print(f"{obj} - Indice [{obj}]")
else:
    print(f"{obj} no está en la lista")
