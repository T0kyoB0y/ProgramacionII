class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String sonido() {
        return "Sonido de animal genérico";
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public String sonido() {
        return "Woof!";
    }

    public String getRaza() {
        return raza;
    }
}

class Gato extends Animal {
    private String color;

    public Gato(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    @Override
    public String sonido() {
        return "Meow!";
    }

    public String getColor() {
        return color;
    }
}

class Pajaro extends Animal {
    private String especie;

    public Pajaro(String nombre, int edad, String especie) {
        super(nombre, edad);
        this.especie = especie;
    }

    @Override
    public String sonido() {
        return "Tweet!";
    }

    public String getEspecie() {
        return especie;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo xd");
    }
}
