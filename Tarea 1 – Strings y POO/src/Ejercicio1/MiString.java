package Ejercicio1;

import java.util.Scanner;

public class MiString {
	private String chain;
	private int numMayusculas;
	private int numMinusculas;

	public MiString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una cadena de texto :");
		chain = sc.nextLine();
		numMayusculas = contarMayusculas();
		numMinusculas = contarMinusculas();
	}

	public int contarMayusculas() {

		for (int i = 0; i < chain.length(); i++) {
			if (chain.charAt(i) >= 65 && chain.charAt(i) <= 90) {
				numMayusculas++;
			}
		}
		return numMayusculas;
	}

	public int contarMinusculas() {

		for (int i = 0; i < chain.length(); i++) {
			if (chain.charAt(i) >= 97 && chain.charAt(i) <= 122) {
				numMinusculas++;
			}
		}
		return numMinusculas;
	}

	public int getNumMayusculas() {

		return numMayusculas;
	}

	public int getNumMinusculas() {

		return numMinusculas;
	}
}
