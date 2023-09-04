#include <iostream>

class Rectangulo {

public:
    double largo;
    double ancho;
    double area;
    double perimetro;

    Rectangulo (double newLargo, double newAncho) {
        largo = newLargo;
        ancho = newAncho;
        area = calcularArea();
        perimetro = calcularPerimetro();
    }

    double calcularArea(){
        return largo * ancho;
    }

    double calcularPerimetro() {
        return largo * 2 + ancho * 2;
    }

    void cambiarAncho(double newAncho){
        ancho = newAncho;
    }

    void cambiarLargo(double newLargo){
        largo= newLargo;
    }

};