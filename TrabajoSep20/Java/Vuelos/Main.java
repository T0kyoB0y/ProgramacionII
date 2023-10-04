class Reserva {
    private String nombreDelPasajero;
    private String numeroDeVuelo;
    private String fecha;

    public Reserva(String nombreDelPasajero, String numeroDeVuelo, String fecha) {
        this.nombreDelPasajero = nombreDelPasajero;
        this.numeroDeVuelo = numeroDeVuelo;
        this.fecha = fecha;
    }

    public String getNombreDelPasajero() {
        return nombreDelPasajero;
    }

    public String getNumeroDeVuelo() {
        return numeroDeVuelo;
    }

    public String getFecha() {
        return fecha;
    }
}

class ReservaEconomica extends Reserva {
    private String asiento;

    public ReservaEconomica(String nombreDelPasajero, String numeroDeVuelo, String fecha, String asiento) {
        super(nombreDelPasajero, numeroDeVuelo, fecha);
        this.asiento = asiento;
    }

    public String getAsiento() {
        return asiento;
    }

    public String mostrarDetalle() {
        return "Reserva Económica:\n" +
                "Pasajero: " + getNombreDelPasajero() + "\n" +
                "Número de Vuelo: " + getNumeroDeVuelo() + "\n" +
                "Fecha: " + getFecha() + "\n" +
                "Asiento: " + asiento;
    }
}

class ReservaBusiness extends Reserva {
    private String loungeAccess;

    public ReservaBusiness(String nombreDelPasajero, String numeroDeVuelo, String fecha, String loungeAccess) {
        super(nombreDelPasajero, numeroDeVuelo, fecha);
        this.loungeAccess = loungeAccess;
    }

    public String getLoungeAccess() {
        return loungeAccess;
    }

    public String mostrarDetalle() {
        return "Reserva Business:\n" +
                "Pasajero: " + getNombreDelPasajero() + "\n" +
                "Número de Vuelo: " + getNumeroDeVuelo() + "\n" +
                "Fecha: " + getFecha() + "\n" +
                "Lounge Access: " + loungeAccess;
    }
}

class ReservaPrimeraClase extends Reserva {
    private String comidaGourmet;

    public ReservaPrimeraClase(String nombreDelPasajero, String numeroDeVuelo, String fecha, String comidaGourmet) {
        super(nombreDelPasajero, numeroDeVuelo, fecha);
        this.comidaGourmet = comidaGourmet;
    }

    public String getComidaGourmet() {
        return comidaGourmet;
    }

    public String mostrarDetalle() {
        return "Reserva Primera Clase:\n" +
                "Pasajero: " + getNombreDelPasajero() + "\n" +
                "Número de Vuelo: " + getNumeroDeVuelo() + "\n" +
                "Fecha: " + getFecha() + "\n" +
                "Comida Gourmet: " + comidaGourmet;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo xd");
    }

}
