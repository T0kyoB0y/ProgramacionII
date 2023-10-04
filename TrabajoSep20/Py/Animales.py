class Animal:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def sonido(self):
        pass  # Este método será implementado por las clases derivadas


class Perro(Animal):
    def __init__(self, nombre, edad, raza):
        super().__init__(nombre, edad)
        self.raza = raza

    def sonido(self):
        return "Woof!"


class Gato(Animal):
    def __init__(self, nombre, edad, color):
        super().__init__(nombre, edad)
        self.color = color

    def sonido(self):
        return "Meow!"


class Pajaro(Animal):
    def __init__(self, nombre, edad, especie):
        super().__init__(nombre, edad)
        self.especie = especie

    def sonido(self):
        return "Tweet!"
