package Strings;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce cadena: ");
		String aux = sc.nextLine();
		
		char [] array = aux.toCharArray();//convierte string un array
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 'a' && array[i] != 'e'&& array[i] != 'i'&& array[i] != 'o'&& array[i] != 'u'
					&& array[i] != 'A'&& array[i] != 'E'&& array[i] != 'C'&& array[i] != 'I'&& array[i] != 'O'&& array[i] != 'U')
				System.out.print(array[i]);
		}
		
	}
	
	
}
