package Ejercicio2;

import java.util.Scanner;

public class Maxmin {

	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int cantidad;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca números (0 para acabar): ");
		do {
			cantidad = scanner.nextInt();
			if (cantidad > max && cantidad != 0)
				max = cantidad;
			if (cantidad < min && cantidad != 0)
				min = cantidad;
		} while (cantidad != 0);
		System.out.println("El máximo es: " + max);
		System.out.println("El mínimo es: " + min);
	}
}