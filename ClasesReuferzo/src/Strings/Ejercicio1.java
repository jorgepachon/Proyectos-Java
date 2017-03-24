package Strings;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce cadena: ");
		String cad1 = sc.nextLine();
		String cad2 =sc.nextLine();
		
		int longitud=cad1.length();
		int longitud2=cad2.length();
		
		System.out.println(cad1.toUpperCase());
		System.out.println(cad2.toLowerCase());
		
		System.out.println("longitud cadena1 "+longitud+" "+cad1);
		System.out.println("longitud cadena2 "+longitud2+" "+cad2);
	}

}
