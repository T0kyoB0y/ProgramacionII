public class Vestimenta extends Productos{
    String talla;
    boolean formal;
    
    Vestimenta(String tipo, int precio, String talla, boolean formal){
        super(tipo, precio);
        this.formal = formal;
        this.talla = talla;
    }

    void mostrar_detalle(){
        System.out.println("Tipo: " + this.categoria);
        System.out.println("Precio: " + this.precio);
        System.out.println("Talla: " + this.talla);
        System.out.println("Formal: " + this.formal);
    }
}
