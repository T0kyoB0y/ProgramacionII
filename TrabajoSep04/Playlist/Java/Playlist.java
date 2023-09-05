import java.util.ArrayList;
import java.util.Random;

public class Playlist {
    String playlistName;
    ArrayList<String> playlist = new ArrayList<>();
    String playCurrentName;
    int playCurrentIndex;
    int playStatus;

    public Playlist(String playlistName){
        this.playlistName = playlistName;
        this.playStatus = 2;
        this.playCurrentIndex = 0;
    }



    //  Un método que permitirá añadir una canción.
    public void addSong(String newSong){
        this.playlist.add(newSong);
    }

    // Un método que permitirá eliminar una canción.
    public void delSong(String songName) {
        for (int i = 0; i < this.playlist.size(); i++) {
            
            String currentSong = this.playlist.get(i);

            if (currentSong.equals(songName)) {
                this.playlist.remove(i);
                System.out.println("Canción eliminada: " + currentSong);
                return;
            
            }
        }
        System.out.println("La canción '" + songName + "' no se encontró en la lista de reproducción.");

    }
    
    // Un método que permitirá mostrar todas las canciones.
    public void showSong(){
        for (int i = 0; i < this.playlist.size(); i++) {
            
            String Song = this.playlist.get(i);
            System.out.println(i + ". " + Song);
        }
    }



    // Un método que permitirá seleccionar una canción a reproducir.
    public void selSong(String songName){
        this.showSong();
        for (int i = 0; i < this.playlist.size(); i++) {
            
            String currentSong = this.playlist.get(i);

            if (currentSong.equals(songName)) {

                this.playCurrentName = songName;

                System.out.println("Ahora reproduciendo: " + this.playCurrentName);
                return;

            }
        }

        System.out.println("La canción '" + songName + "' no se encontró en la lista de reproducción.");

    }

    // Un método que permitirá pausar una canción.
    public void pauseSong(){
        this.playStatus = 0;
    }

    // Un método que permitirá detener la reproducción.
    public void stopSong(){
        this.playStatus = 2;
    }


    // Un método que pasará a la siguiente canción.

    public void nextSong() {
        if (this.playlist.isEmpty()) {
            System.out.println("Error: La lista de reproducción está vacía.");
            }

        else if (this.playCurrentIndex < this.playlist.size() - 1) {
            this.playCurrentIndex++;
            this.playCurrentName = this.playlist.get(this.playCurrentIndex);
            System.out.println("Ahora reproduciendo: " + this.playCurrentName);
            }

            else {
            System.out.println("Error: No hay más canciones en la lista.");
        }
    }
    
    // Un método que permitirá retroceder a la canción anterior.

    public void prevSong() {
        if (this.playlist.isEmpty()) {
            System.out.println("Error: La lista de reproducción está vacía.");
                }
        else if (this.playCurrentIndex > 0) {
            this.playCurrentIndex--;
            this.playCurrentName = this.playlist.get(this.playCurrentIndex);
            System.out.println("Ahora reproduciendo: " + this.playCurrentName);
                }
        else {
            System.out.println("Error: No hay canciones anteriores en la lista.");
        }
    }


    // Un método que permitirá reproducir una canción aleatoria

    public void playRandomSong() {
        if (this.playlist.isEmpty()) {
            System.out.println("Error: La lista de reproducción está vacía.");
            return;
               }
        Random random = new Random();
        int randomIndex;

        // Si ya está reproduciendo una canción, excluye ese índice de la selección aleatoria
        if (this.playCurrentName != null) {
            do {
                randomIndex = random.nextInt(this.playlist.size());
            } while (randomIndex == this.playCurrentIndex);
        } else {
            randomIndex = random.nextInt(this.playlist.size());
        }

        this.playCurrentIndex = randomIndex;
        this.playCurrentName = this.playlist.get(randomIndex);
        System.out.println("Ahora reproduciendo: " + this.playCurrentName);
    }
    
    // Un método que permite ver el estado de la playlist.

    public void checkSongStat() {
        int state = this.playStatus;
        if (state == 0){
            System.out.println("Paused");
        }
        else if (state == 1){
            System.out.println("Playing");
        }
        else {
            System.out.println("Stopped");
        }
    }

    // Un método que permite ver la canción que se está reproduciendo.
    public void funcName(String arg) {
        for (int i = 0; i < this.playlist.size(); i++) {
            String Song = this.playlist.get(i);
            if (Song == this.playCurrentName){
                System.out.println("Reproduciendo: " + Song);
            }
        }

    }
}
