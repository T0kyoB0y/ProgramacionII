public class Alimenticio extends Productos {
    boolean perecible;
    int calorias;
    int vence;
    
    Alimenticio(String tipo, boolean perecible, int calorias, int vence, int precio) {
        super(tipo, precio);
        this.calorias = calorias;
        this.vence = vence;
        this.perecible = perecible;
    }

    void mostrar_detalle(){
        System.out.println("Tipo: " + this.categoria);
        System.out.println("Precio: " + this.precio);
        System.out.println("Perecible: " + this.perecible);
        System.out.println("Calorias: " + this.calorias + "Kcal");
        System.out.println("Fecha de vencimiento: " + this.vence);
    }
} 