import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int categoria;
		double sueldo;

		System.out.print("la categoría: "); 
		categoria = input.nextInt();

		if (categoria == 1) {

			sueldo = 15890 + (15890*0.10);
			System.out.println("El sueldo de los repositores es $" + sueldo);
		}
		else if (categoria == 2) {
			sueldo = 25630.89;
			System.out.println("El sueldo de los cajeros es: $" + sueldo);
		}
		else if (categoria == 3) {
			sueldo = 35560.20 - (35560.20 * 0.11);
			System.out.println("El sueldo de los supervisores cobran: $" + sueldo);
		}
		else {
			System.out.println("Categoría invalida.");
		}

	}
	
}