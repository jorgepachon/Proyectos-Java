package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public int sumaNumeros() {
		int sum = 0;
		boolean num;
		Scanner sc = new Scanner(System.in);
		do {
			num = false;
			try {
				System.out.println("primer n�mero");
				int num1 = Integer.parseInt(sc.nextLine());
				System.out.println("segundo n�mero");
				int num2 = Integer.parseInt(sc.nextLine());
				System.out.println("tercer n�mero");
				int num3 = Integer.parseInt(sc.nextLine());
				System.out.println("cuarto n�mero");
				int num4 = Integer.parseInt(sc.nextLine());
				System.out.println("quinto n�mero");
				int num5 = Integer.parseInt(sc.nextLine());
				sum = (num1 + num2 + num3 + num4 + num5);
				
			} catch (Exception e) {
				
				System.out.println("Error has puesto una letra!!!\n"+"Empieza de nuevo:");
				num = true;
			}

		} while (num);

		return sum;
	}

	public static void main(String[] args) {
		Ejercicio4 Main = new Ejercicio4();

		System.out.println("La suma de los n�meros es de : " + Main.sumaNumeros());
	}
}