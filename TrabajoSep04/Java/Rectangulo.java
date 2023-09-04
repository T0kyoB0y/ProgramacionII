public class Rectangulo {
    double longitud;
    double ancho;
    double area;
    double perimetro;

    Rectangulo (double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;        
        this.area = this.calcularArea();
        this.perimetro = this.calcularPerimetro(); 
    }

    double calcularArea() {
        return this.ancho * this.longitud;
    }

    double calcularPerimetro() {
        return this.ancho * 2 + this.longitud * 2 ;
    }

    double cambiarAncho(double newAncho){
        return this.ancho = newAncho;
    }

    double cambiarLargo(double newLargo){
        return this.longitud = newLargo;
    }
}
