package Ejercicio4;
import java.util.Scanner;

public class MiString4 {
	
	private String chain;

	public MiString4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una cadena de caracteres :");
		chain = sc.nextLine();
	}

	public String colocarMayuscula(char minuscula, char mayuscula) {
		String resultado = "";
		for (int i = 0; i < chain.length(); i++) {
			if (chain.charAt(i) == minuscula) {
				resultado += mayuscula;
			} else {
				resultado += chain.charAt(i);
			}

		}

		return resultado;
	}
}
