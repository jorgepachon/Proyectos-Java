package Strings;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce cadena: ");
		String cad = sc.nextLine();
		int suma = 0;

		char[] Array = cad.toCharArray();
		
		for (int i = 0; i < Array.length; i++) {
			
			if (Character.isDigit(Array[i])) {//suma los caracteres en la posicion i
				int numero= Character.getNumericValue(Array[i]);//para convertoir de ascii a int
				suma=suma+numero;
			}
		}
		System.out.println(suma);
	}
}



/* programa en Java que solicite por consola una cadena e imprima
   el resultado de la suma de los dígitos que contenga esa cadena. 
*/