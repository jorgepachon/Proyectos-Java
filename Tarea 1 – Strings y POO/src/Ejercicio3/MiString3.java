package Ejercicio3;

import java.util.Scanner;

public class MiString3 {
	
	private String chain;

	public MiString3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una cadena de caracteres :");
		chain = sc.nextLine();
	}

	public boolean palindrome() {
		boolean preg;
		StringBuilder aux = new StringBuilder(chain);

		if (aux.reverse().toString().equals(chain)) {
			System.out.println("La cadena ES PALINDROME");
			preg = true;

		} else {
			System.out.println("La cadena NO ES PALINDROME");
			preg = false;
		}

		return preg;

	}
}
