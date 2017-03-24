package Ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {
public String countNum() {//metodo recibe letras y numeros y cuenta numeros
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce letras y cifras :");
		String letras = sc.nextLine();
		int num, sum = 0;
		try {
			for (int i = 0; i < letras.length(); i++) {
				if (letras.charAt(i) >= 49 && letras.charAt(i) <= 57 || sum<=20 ) {
					num = Integer.parseInt(letras.substring(i, i + 1));
					sum += num;
				}

			}
		} catch (Exception e) {
			for (int i = 0; i < letras.length(); i++) {
				if (letras.charAt(i) >= 49 && letras.charAt(i) <= 57) {
					num = Integer.parseInt(letras.substring(i, i + 1));
					sum += num;
				}

			}
			return "error fuera de rango: " + sum;

			
		}
		
		
		return "La suma de los números es de :" + sum;
		
	}

	public static void main(String[] args) {
		Ejercicio3 Main = new Ejercicio3();
		System.out.println(Main.countNum());
	}

}