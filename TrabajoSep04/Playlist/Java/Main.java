import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Cambio el nombre de la variable a 'input'
        Playlist myPlaylist = new Playlist("Mi Lista de Reproducción");

        try {
        
        while (true) {
            System.out.println("\n********** Menú **********");
            System.out.println("1. Agregar una canción");
            System.out.println("2. Eliminar una canción");
            System.out.println("3. Mostrar todas las canciones");
            System.out.println("4. Seleccionar una canción para reproducir");
            System.out.println("5. Pausar la canción");
            System.out.println("6. Detener la reproducción");
            System.out.println("7. Pasar a la siguiente canción");
            System.out.println("8. Retroceder a la canción anterior");
            System.out.println("9. Reproducir una canción aleatoria");
            System.out.println("10. Ver el estado de la playlist");
            System.out.println("11. Ver la canción que se está reproduciendo");
            System.out.println("12. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la canción a agregar: ");
                    String nuevaCanción = input.nextLine();
                    myPlaylist.addSong(nuevaCanción);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de la canción a eliminar: ");
                    String canciónAEliminar = input.nextLine();
                    myPlaylist.delSong(canciónAEliminar);
                    break;
                case 3:
                    myPlaylist.showSong();
                    break;
                case 4:
                    System.out.print("Ingrese el nombre de la canción a reproducir: ");
                    String canciónAReproducir = input.nextLine();
                    myPlaylist.selSong(canciónAReproducir);
                    break;
                case 5:
                    myPlaylist.pauseSong();
                    break;
                case 6:
                    myPlaylist.stopSong();
                    break;
                case 7:
                    myPlaylist.nextSong();
                    break;
                case 8:
                    myPlaylist.prevSong();
                    break;
                case 9:
                    myPlaylist.playRandomSong();
                    break;
                case 10:
                    myPlaylist.checkSongStat();
                    break;
                case 11:
                    myPlaylist.funcName(myPlaylist.playCurrentName);
                    break;
                case 12:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    }
                }
            }
        finally {
                input.close();
                }
    }
}
