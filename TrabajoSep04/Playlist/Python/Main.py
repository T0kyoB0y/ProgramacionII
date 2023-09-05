from Playlist import Playlist

def main():
    myPlaylist = Playlist("Mi Lista de Reproducción")

    try:
        while True:
            print("\n********** Menú **********")
            print("1. Agregar una canción")
            print("2. Eliminar una canción")
            print("3. Mostrar todas las canciones")
            print("4. Seleccionar una canción para reproducir")
            print("5. Pausar la canción")
            print("6. Detener la reproducción")
            print("7. Pasar a la siguiente canción")
            print("8. Retroceder a la canción anterior")
            print("9. Reproducir una canción aleatoria")
            print("10. Ver el estado de la playlist")
            print("11. Ver la canción que se está reproduciendo")
            print("12. Salir")

            opcion = input("Seleccione una opción: ")

            try:
                opcion = int(opcion)
            except ValueError:
                print("Opción no válida. Por favor, seleccione una opción válida.")
                continue

            if opcion == 1:
                nuevaCanción = input("Ingrese el nombre de la canción a agregar: ")
                myPlaylist.addSong(nuevaCanción)
            elif opcion == 2:
                canciónAEliminar = input("Ingrese el nombre de la canción a eliminar: ")
                myPlaylist.delSong(canciónAEliminar)
            elif opcion == 3:
                myPlaylist.showSong()
            elif opcion == 4:
                canciónAReproducir = input("Ingrese el nombre de la canción a reproducir: ")
                myPlaylist.selSong(canciónAReproducir)
            elif opcion == 5:
                myPlaylist.pauseSong()
            elif opcion == 6:
                myPlaylist.stopSong()
            elif opcion == 7:
                myPlaylist.nextSong()
            elif opcion == 8:
                myPlaylist.prevSong()
            elif opcion == 9:
                myPlaylist.playRandomSong()
            elif opcion == 10:
                myPlaylist.checkSongStat()
            elif opcion == 11:
                myPlaylist.funcName(myPlaylist.playCurrentName)
            elif opcion == 12:
                print("Saliendo del programa.")
                break
            else:
                print("Opción no válida. Por favor, seleccione una opción válida.")
    finally:
        pass

if __name__ == "__main__":
    main()
