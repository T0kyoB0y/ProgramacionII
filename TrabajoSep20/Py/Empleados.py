class Empleado:
    def __init__(self, nombre, edad, salario):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario

    def describir_rol(self):
        pass  # Método abstracto que será implementado en las clases derivadas


class Gerente(Empleado):
    def __init__(self, nombre, edad, salario, departamento):
        super().__init__(nombre, edad, salario)
        self.departamento = departamento

    def describir_rol(self):
        return f"Soy un gerente llamado {self.nombre}, tengo {self.edad} años y trabajo en el departamento de {self.departamento}. Mi salario es ${self.salario}."

class Ingeniero(Empleado):
    def __init__(self, nombre, edad, salario, especialidad):
        super().__init__(nombre, edad, salario)
        self.especialidad = especialidad

    def describir_rol(self):
        return f"Soy un ingeniero llamado {self.nombre}, tengo {self.edad} años y mi especialidad es {self.especialidad}. Mi salario es ${self.salario}."

class Asistente(Empleado):
    def __init__(self, nombre, edad, salario, jefe):
        super().__init__(nombre, edad, salario)
        self.jefe = jefe

    def describir_rol(self):
        return f"Soy un asistente llamado {self.nombre}, tengo {self.edad} años y asisto a {self.jefe}. Mi salario es ${self.salario}."