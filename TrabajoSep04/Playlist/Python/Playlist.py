import random

class Playlist:
    def __init__(self, playlistName):
        
        self.playlistName = playlistName
        self.playlist = []
        self.playCurrentName = None
        self.playCurrentIndex = 0
        self.playStatus = 2

    def addSong(self, newSong):
        self.playlist.append(newSong)

    def delSong(self, songName):
        if songName in self.playlist:
            self.playlist.remove(songName)
            print("Canción eliminada:", songName)
        else:
            print("La canción '", songName, "' no se encontró en la lista de reproducción.")


    def showSong(self):
        for i, song in enumerate(self.playlist):
            print(i, ". ", song)

    def selSong(self, songName):
        self.showSong()
        if songName in self.playlist:
            self.playCurrentName = songName
            print("Ahora reproduciendo:", self.playCurrentName)
        else:
            print("La canción '", songName, "' no se encontró en la lista de reproducción.")

    def pauseSong(self):
        self.playStatus = 0

    def stopSong(self):
        self.playStatus = 2

    def nextSong(self):
        if not self.playlist:
            print("Error: La lista de reproducción está vacía.")
        elif self.playCurrentIndex < len(self.playlist) - 1:
            self.playCurrentIndex += 1
            self.playCurrentName = self.playlist[self.playCurrentIndex]
            print("Ahora reproduciendo:", self.playCurrentName)
        else:
            print("Error: No hay más canciones en la lista.")

    def prevSong(self):
        if not self.playlist:
            print("Error: La lista de reproducción está vacía.")
        elif self.playCurrentIndex > 0:
            self.playCurrentIndex -= 1
            self.playCurrentName = self.playlist[self.playCurrentIndex]
            print("Ahora reproduciendo:", self.playCurrentName)
        else:
            print("Error: No hay canciones anteriores en la lista.")

    def playRandomSong(self):
        if not self.playlist:
            print("Error: La lista de reproducción está vacía.")
            return

        randomIndex = random.randint(0, len(self.playlist) - 1)

        if self.playCurrentName is not None:
            while randomIndex == self.playCurrentIndex:
                randomIndex = random.randint(0, len(self.playlist) - 1)

        self.playCurrentIndex = randomIndex
        self.playCurrentName = self.playlist[randomIndex]
        print("Ahora reproduciendo:", self.playCurrentName)

    def checkSongStat(self):
        state = self.playStatus
        if state == 0:
            print("Paused")
        elif state == 1:
            print("Playing")
        else:
            print("Stopped")

    def funcName(self, arg):
        for song in self.playlist:
            if song == self.playCurrentName:
                print("Reproduciendo:", song)
