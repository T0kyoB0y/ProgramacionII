class Productos:
    def __init__(self, tipo, precio):
        self.tipo = tipo
        self.precio = precio


class Alimenticio(Productos):

    def __init__(self, tipo, precio, perecible, calorias, vence):
        super().__init__(tipo, precio)
        self.calorias = calorias
        self.perecible = perecible
        self.vence = vence
        
    def mostrar_detalle(self):
        print(f"Tipo: {self.tipo}\n \
                Precio: {self.precio}\n \
                Perecible: {self.perecible}\n \
                Calorias: {self.calorias}\n \
                Vence: {self.vence}")

class Electronico(Productos):
    def __init__(self, tipo, precio, consumo, tamano):
        super().__init__(tipo, precio)
        self.consumo = consumo
        self.tamano = tamano
        self.vence = vence

    def mostrar_detalle(self):
        print(f"Tipo: {self.tipo}\n \
                Precio: {self.precio}\n \
                Consumo: {self.consumo}\n \
                Tamaño: {self.tamano}")

class Vestimenta(Productos):
    def __init__(self, tipo, precio, talla, formal):
        super().__init__(tipo, precio)
        self.talla = talla
        self.formal = formal

    def mostrar_detalle(self):
        print(f"Tipo: {self.tipo}\n \
                Precio: {self.precio}\n \
                Talla: {self.talla}\n \
                Formal: {self.formal}")
