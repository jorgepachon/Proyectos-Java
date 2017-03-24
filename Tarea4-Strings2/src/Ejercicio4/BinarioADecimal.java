package Ejercicio4;

import java.util.*;

public class BinarioADecimal {

	public static void main(String[] args) {
		int dec = 0, aux, cont = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduzca un número en binario (ceros y unos)");
		int bin = scanner.nextInt();
		dec = 0;
		for (aux = bin; aux > 0; cont++) {
			dec += (aux % 10) * Math.pow(2, cont);
			aux /= 10;
		}
		System.out.println(bin + "(2 = " + dec + "(10");
	}
}