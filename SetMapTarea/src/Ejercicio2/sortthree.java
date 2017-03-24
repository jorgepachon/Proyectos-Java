package Ejercicio2;
import java.util.Scanner;
import java.util.TreeSet;

public class sortthree {
	public static void main(String[] args) {
		int a, b, c;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		TreeSet<Integer> numeros = new TreeSet<Integer>();
		numeros.add(a);
		numeros.add(b);
		numeros.add(c);
		
		for (Integer elto : numeros) {
			System.out.print(elto + " ");
		}

		

	}
}
//2,5 puntos ejercicio correcto