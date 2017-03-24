package Strings;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce cadena: ");
		String cad = sc.nextLine();

		boolean str = false;
		
		for (int i = 0; i < cad.length(); i++) {
			if (cad.charAt(i) == 'b') {
				str = true;
			break;	
			} else {
				str = false;
				System.out.println(false);
			}
			break;
		}
			 while ( ! str );
			System.out.println(true+" SUPER BOB");
		}
	}

