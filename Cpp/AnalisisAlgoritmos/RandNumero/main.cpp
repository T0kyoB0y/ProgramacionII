#include <iostream>
#include <map>
#include <string>
#include <iterator>
#include <list>
#include <ctime>

using namespace std;


int errorCounter;
bool adivinado = false;
int input;


int verifNum(int entrada, int numero){

    if (entrada == numero){
        return adivinado = true;
    }
    else if (entrada > numero) {
        cout << "El numero es menor que: " << entrada << " ¿Qué numero es?" << endl;
        errorCounter += 1;
        return 0;
    }
    else {
        cout << "El numero es mayor que: " << entrada << " ¿Qué numero es?" << endl;
        errorCounter += 1;
        return 0;
    }
}

int main(){
    srand(time(0));
    int randInt = rand() % 100 + 1;

    while (input != randInt){
        cout << "Ingrese un numero" << "\n>";
        cin >> input;

        verifNum(input, randInt);
    }
    if (errorCounter == 0){
        cout << "¡Enhorabuena, lo has acertado a la primera!" << endl;
    }
    else {
        cout << "Lo has acertado en: " << errorCounter << " intentos" << endl;
    }
}