package Ejercicio2;

import java.util.Scanner;

public class MiString2_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MiString2 mio = new MiString2();
		System.out.println("Ingrese un caracter :");
		char a = sc.next().charAt(0);
		System.out.println("El n�mero de ocurrencias de '" + a + "' es : " + mio.contarCaracter(a));

	}

}
