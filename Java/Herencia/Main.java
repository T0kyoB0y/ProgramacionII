public class Main {

    public static void main(String[] args) {
                
        
    }
}

class Padre {
    int edad;
    String nombre;
    
    Padre(String nombre){
        this.nombre = nombre;
    }


}


class Hijo extends Padre {

    int edad;
    
    Hijo(String name){ 
        super(name);
        this.edad = 0;
    }

}