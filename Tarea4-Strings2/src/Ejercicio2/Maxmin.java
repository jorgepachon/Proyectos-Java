package Ejercicio2;

import java.util.Scanner;

public class Maxmin {

	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int cantidad;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca n�meros (0 para acabar): ");
		do {
			cantidad = scanner.nextInt();
			if (cantidad > max && cantidad != 0)
				max = cantidad;
			if (cantidad < min && cantidad != 0)
				min = cantidad;
		} while (cantidad != 0);
		System.out.println("El m�ximo es: " + max);
		System.out.println("El m�nimo es: " + min);
	}
}