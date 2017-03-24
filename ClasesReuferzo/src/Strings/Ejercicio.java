package Strings;

import java.io.*;
import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce cadena: ");

		String cad = sc.nextLine();
		String cad2 = "";

		int longitud = cad.length();
		int mitad = Math.abs(longitud/2);

		if (longitud % 2 == 0) {
			cad2 = cad.substring(longitud / 2);
			cad2 += cad.substring(0, longitud / 2);
			
		}else {
			cad2=cad.substring((longitud/2)+1);
			cad2+=cad.substring(mitad, (longitud/2)+1);
		}

		System.out.print("Devuelve: " + cad2);

	}
}