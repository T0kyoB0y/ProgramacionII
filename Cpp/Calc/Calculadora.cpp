#include <iostream>
using namespace std;

int suma(int param1, int param2)
{
	return param1 + param2;
};

int resta(int param1, int param2)
{
	return param1 - param2;
};

float divit(float param1, float param2)
{
	return param1 / param2;
}
int multi(int param1, int param2)
{
	return param1 * param2;
};

int clasif_choice(int param1)
{
	int num1, num2;

	cout << "Ingrese su primer numero: ";
	cin >> num1;
	cout << "Ingrese su segundo numero: ";
	cin >> num2;

	if (param1 == 1)
	{
		return suma(num1, num2);
	}
	else if (param1 == 2)
	{
		return resta(num1, num2);
	}
	else if (param1 == 3)
	{
		return divit(num1, num2);
	}
	else if (param1 == 4)
	{
		return multi(num1, num2);
	}
	else
	{
		cout << "Operación inválida. Por favor, seleccione una operación válida (1, 2, 3 o 4)." << endl;
		return 0; // Se devuelve 0 para indicar que hubo un error o una operación inválida.
	}
}

int main()
{
	int x;
	cout << "Ingrese una operación para realizar:\n 1. Suma\n 2. Resta\n 3. División\n 4. Multiplicación\n";
	cin >> x;	

	int resultado = clasif_choice(x);

	cout << "Resultado: " << resultado << endl;
}