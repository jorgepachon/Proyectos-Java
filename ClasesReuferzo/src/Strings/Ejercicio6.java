package Strings;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce cadena: ");
		String cad = sc.nextLine();
		
		cad =cad.toLowerCase();
		
		char[] Array = cad.toCharArray();
		
		
		for (char c='a'; c<='z';c++) {
			int i;
			for ( i = 0; i < cad.length(); i++) {
				if(c== Array[i])
					break;
				}
			
			if (i==cad.length())
				System.out.print(c);
			}
		}
		
	}



//(Array[i]>=97 && Array[i]>=122)metodo para leer abecedario en minuscula