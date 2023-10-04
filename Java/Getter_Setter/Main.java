public class Main {
    public static void main(String[] args){
        Basura basura1 = new Basura(0);

        // No se puede acceder al atributo cantBasura porque es privado
        // System.out.println(basura1.cantBasura);

        // Asi que accedemos al atributo usanto el getter creado 
        System.out.println(basura1.getBasura());
        
        // Cambiamos la cantidad de basura con el setter
        basura1.setBasura(100000);

        // Ahora usamos de nuevo el getter
        System.out.println(basura1.getBasura());
        
    
    }

}

class Basura {
    private int cantBasura;
    // Getter para obtener la cantidad de Basura
    public int getBasura(){
        return this.cantBasura;
    }

    // Setter para cambiar la cantidad de Basura 
    void setBasura(int nuevaBasura){
        this.cantBasura = nuevaBasura;
    }
    
    Basura(int primerBasura){
        this.cantBasura = primerBasura;
    }

}