public class Electronico extends Productos{
    char consumo;
    String tamano;

    Electronico(String tipo, int precio, char consumo, String tamano) {
        super(tipo, precio);
        this.consumo = consumo;
        this.tamano = tamano;
    }

    void mostrar_detalle(){
        System.out.println("Tipo: " + this.categoria);
        System.out.println("Precio: " + this.precio);
        System.out.println("Consumo: " + this.consumo);
        System.out.println("Tamaño: " + this.tamano);
    }


}