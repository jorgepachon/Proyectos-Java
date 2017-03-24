package Ejercicio1;

import java.util.*;

public class Billetes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduzca la cantidad: ");
		int cantidad = scanner.nextInt();
		System.out.print("Los billetes son: ");
		if (cantidad >= 500) {
			System.out.print((cantidad / 500) + "x500€ ");
			cantidad %= 500;
		}
		if (cantidad >= 200) {
			System.out.print("+ " + (cantidad / 200) + "x200€ ");
			cantidad %= 200;
		}
		if (cantidad >= 100) {
			System.out.print("+ " + (cantidad / 100) + "x100€ ");
			cantidad %= 100;
		}
		if (cantidad >= 50) {
			System.out.print("+ " + cantidad / 50 + "x50€ ");
			cantidad %= 50;
		}
		if (cantidad >= 20) {
			System.out.print("+ " + cantidad / 20 + "x20€ ");
			cantidad %= 20;
		}
		if (cantidad >= 10) {
			System.out.print("+ " + cantidad / 10 + "x10€ ");
			cantidad %= 10;
		}
		if (cantidad >= 5) {
			System.out.print("+ " + cantidad / 5 + "x5€ ");
			cantidad %= 5;
		}
		if (cantidad > 0) {
			System.out.print("+ " + cantidad + "€(sobran)");
		}
	}
}