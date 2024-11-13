package mostrandodatos;

import java.util.Scanner;

public class MostrandoDatos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nombre: ");
		String nombre = scanner.nextLine();

		System.out.print("Apellido: ");
		String apellido = scanner.nextLine();

		System.out.println("Hola, " + nombre + " " + apellido + "!");

		scanner.close();
	}
}