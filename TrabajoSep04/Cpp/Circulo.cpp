#include <iostream>
#include <math.h>


class Circulo {
public:
    double radio;
    double area;
    double perimetro;
    double pi = M_PI;

    Circulo (double newRadio) {
        radio = newRadio;
        area = calcularArea();
        perimetro = calcularPerimetro();
    };

    double calcularArea(){
        return pi * radio * radio;
    }

    double calcularPerimetro() {
        return pi * 2 * radio;
    }
    void nuevoRadio(double newRadio){
        radio = newRadio;
    }
};