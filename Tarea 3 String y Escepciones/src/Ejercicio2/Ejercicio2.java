package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public String Mayusc() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena de texto :");
		String Mistring = sc.nextLine();

		boolean Mayus = true;
		char[] cadena = Mistring.toCharArray();
		cadena[0] = Character.toUpperCase(cadena[0]);

		for (int i = 0; i < Mistring.length(); i++) {
			if (cadena[i] == '.') {
				cadena[i + 1] = Character.toUpperCase(cadena[i + 1]);
				Mayus = true;
			} else if (Mayus && Character.isWhitespace(Mistring.charAt(i))) {
				cadena[i + 1] = Character.toUpperCase(cadena[i + 1]);
			}

		}
		return new String(cadena);
	}

	public static void main(String[] args) {
		Ejercicio2 Main = new Ejercicio2();
		System.out.println(Main.Mayusc());
	}

}