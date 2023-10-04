public class Circulo {
    double radio;
    double area;
    double perimetro;
    double PI = Math.PI;

    Circulo(double radio){
        this.radio = radio;
        this.area = this.calcularArea();
        this.perimetro = this.calcularPerimetro();
    }

    double calcularArea() {
        return PI * this.radio * this.radio;
    }
    double calcularPerimetro() {
        return PI * 2 * this.radio;
    }

    double cambiarRadio(double radio){
        return this.radio = radio;
    }

}

