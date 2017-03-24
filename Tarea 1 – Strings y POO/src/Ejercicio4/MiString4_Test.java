package Ejercicio4;
import java.util.Scanner;

public class MiString4_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MiString4 mio = new MiString4();
		System.out.println("Ingrese un caracter :");
		char minuscula = sc.nextLine().charAt(0);
		char mayuscula = Character.toUpperCase(minuscula);
		System.out.println("La cadena modificada es :" + mio.colocarMayuscula(minuscula, mayuscula));

	}

}
