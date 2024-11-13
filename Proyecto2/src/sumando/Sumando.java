package sumando;

import java.util.Scanner;

public class Sumando {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Sumando 1: ");
		int s1 = scanner.nextInt();

		System.out.print("Sumando 2: ");
		int s2 = scanner.nextInt();

		System.out.println("Suma: " + (s1 + s2));

		scanner.close();
	}
}