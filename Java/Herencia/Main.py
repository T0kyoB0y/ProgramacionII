class Padre:
    def __init__(self, name, age=0):
        self.name = name
        self.age = age


class Hijo(Padre):
    pass
    def getNombre(self):
        return self.name

newHijo = Hijo("Patata")

print(newHijo.getNombre())
    
