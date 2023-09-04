#include <iostream>
#include <map>
#include <string>
#include <iterator>
#include <list>

using namespace std;

// int main()
// {
//     int lista[] = {1, 6, 2, 3, 5, 7, 4, 19};
//     for (int i : lista)
//     {
//         // cout << i << "\n";
//     }
//     return 0;
// }


int lista[] = {1,1,1,1, 6, 2, 3, 5, 7, 4, 19};
int list_size = sizeof(lista) / sizeof(lista[0]);

int minimum(int lista[]) {
    int minimum = lista[0];
    cout << "\nEncuentre el numero menor de la lista:\n";

    for (int i : lista){

        if (lista[i] < minimum){
            minimum = lista[i];
        }
    }
    return minimum;
}


int duped(int lista[]){

    map<int, int> duped;
    for (auto i : lista){
        duped[i] += 1;
    }

    map<int, int>::iterator it = duped.begin();
    cout << "\nEncuentre los numeros repetidos:\n";    
    
    while (it != duped.end()){
        int value = it->second;
        int count = duped.count(value);
        cout << "Numero: " << it->first << ", Se repite: " << it->second << endl;
        ++it;
    }
    return 0;
}


// Dada una lista de números, volteé la lista.
int invert(int lista[], int list_size){
    int inverted_list[list_size];

    cout << "Lista original: ";
    for (int i = 0; i < list_size; i++)
    {
        cout << lista[i] << " ";
    }

    // Invertir la lista
    for (int i = 0; i < list_size; i++)
    {
        inverted_list[i] = lista[list_size - 1 - i];
    }

    cout << "\nLista invertida: ";
    for (int i = 0; i < list_size; i++)
    {
        cout << inverted_list[i] << " ";
    }

    return 0;
}




int main(){
    int min_output = minimum(lista);
    cout << "Minimo de la lista: " << min_output << "\n";
    int duped_output = duped(lista);
    int invert_output = invert(lista, list_size);
}