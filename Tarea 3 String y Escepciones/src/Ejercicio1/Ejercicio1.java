package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	
	public String countNum() {//metodo recibe letras y numeros y cuenta numeros
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce letras y cifras :");
		String s = sc.nextLine();
		int num, sum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 49 && s.charAt(i) <= 57) {
				num = Integer.parseInt(s.substring(i, i + 1));
				sum += num;
			}

		}

		return "La suma de los números es de :" + sum;

	}

	public static void main(String[] args) {
		Ejercicio1 Main = new Ejercicio1();
		System.out.println(Main.countNum());
	}

}