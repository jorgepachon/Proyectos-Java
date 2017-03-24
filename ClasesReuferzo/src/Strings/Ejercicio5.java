package Strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce cadena: ");
		String cad = sc.nextLine();
		
		
		StringTokenizer st = new StringTokenizer(cad);
		if(st.hasMoreTokens()){
			System.out.println(st.countTokens());
		}
		
		char[] Array = cad.toCharArray();
		int espacio = 0;
		
		for (int i = 0; i < Array.length; i++) {
			
			if (cad.charAt(i)==' '){
				
				espacio++;
			}
		}
System.out.println(cad.length());
System.out.println(cad.length()-espacio);
	}

}
