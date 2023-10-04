public class Dog {
    private String nombre;
    private String color;
    private int size;
    private int patas;
    private int orejas;

    void Morder(){
        System.out.println("*Muerde*");
    }

    void Tragar(){
        System.out.println("Morder");
    }

    void Ladrar(){
        System.out.println("Guau");
    }
    
    Dog(String color, int size, String nombre){

        this.color = color;
        this.size = size;
        this.nombre = nombre;
    }
}   