package Ejercicio5;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		int x = 1, num, valor, par = 0, impar = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Cuantos numeros enteros?: ");
		num = in.nextInt();
		
		while (x <= num) {
			System.out.print("Valor?: ");
			valor = in.nextInt();
			if (valor % 2 == 0) {
				par++;
			} else {
			}
			x++;
		}
		System.out.println("Total numeros pares: " + par);
		System.out.println("Total numeros pares: " + impar);

	}

}
