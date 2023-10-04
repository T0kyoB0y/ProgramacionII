class Reserva:
    def __init__(self, nombre_del_pasajero, numero_de_vuelo, fecha):
        self.nombre_del_pasajero = nombre_del_pasajero
        self.numero_de_vuelo = numero_de_vuelo
        self.fecha = fecha

class ReservaEconomica(Reserva):
    def __init__(self, nombre_del_pasajero, numero_de_vuelo, fecha, asiento):
        super().__init__(nombre_del_pasajero, numero_de_vuelo, fecha)
        self.asiento = asiento

    def mostrar_detalle(self):
        return f"Reserva Económica:\n \
                Pasajero: {self.nombre_del_pasajero}\n \
                Número de Vuelo: {self.numero_de_vuelo}\n \
                Fecha: {self.fecha}\n \
                Asiento: {self.asiento}"


class ReservaBusiness(Reserva):
    def __init__(self, nombre_del_pasajero, numero_de_vuelo, fecha, lounge_access):
        super().__init__(nombre_del_pasajero, numero_de_vuelo, fecha)
        self.lounge_access = lounge_access

    def mostrar_detalle(self):
        return f"Reserva Business:\n \
                Pasajero: {self.nombre_del_pasajero}\n \
                Número de Vuelo: {self.numero_de_vuelo}\n \
                Fecha: {self.fecha}\n \
                Lounge Access: {self.lounge_access}"


class ReservaPrimeraClase(Reserva):
    def __init__(self, nombre_del_pasajero, numero_de_vuelo, fecha, comida_gourmet):
        super().__init__(nombre_del_pasajero, numero_de_vuelo, fecha)
        self.comida_gourmet = comida_gourmet

    def mostrar_detalle(self):
        return f"Reserva Primera Clase:\n \
                Pasajero: {self.nombre_del_pasajero}\n \
                Número de Vuelo: {self.numero_de_vuelo}\n \
                Fecha: {self.fecha}\n \
                Comida Gourmet: {self.comida_gourmet}"