package Ejercicio2;

import java.util.Scanner;

public class MiString2 {
	private String chain;

	public MiString2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una cadena de caracteres :");
		chain = sc.nextLine();
	}

	public int contarCaracter(char caracter) {

		int numVeces = 0;

		for (int i = 0; i < chain.length(); i++) {
			if (chain.charAt(i) == caracter) {
				numVeces++;
			}
		}

		return numVeces;

	}
}