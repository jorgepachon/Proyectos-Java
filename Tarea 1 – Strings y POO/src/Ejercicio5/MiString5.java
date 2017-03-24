package Ejercicio5;
import java.util.Scanner;

public class MiString5 {
	private String chain;

	public MiString5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una cadena de caracteres :");
		chain = sc.nextLine();
	}

	public String eliminarEspacios() {

		return chain.replace(" ", "");
}
}
