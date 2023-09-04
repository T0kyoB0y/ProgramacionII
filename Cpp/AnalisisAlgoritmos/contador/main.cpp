#include <iostream>
#include <map>
#include <string>
#include <iterator>
#include <list>
#include <ctime>

using namespace std;

int contador(){
    int N = 100;
    int cont = 0;
    for (int i = 0; i < N; i++){
        for (int j = 0; j <= i; j++){
            cont++;
            cout << "I:" << i << "   J:" << j << endl;
        }
    }
    return cont;
}

int sumatoria(){
    int N = 100;
    int cont = 0;
    int res = ( N * ( N + 1 ) ) / 2;
    return res;
}

int main(){
    cout << sumatoria();
}