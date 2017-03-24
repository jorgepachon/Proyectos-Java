package Ejercicio1;

public class Estrellas {

	public static void main(String[] args) {
		int A = 1;
		
		while (A<=5){
			int B = 1;
			while (B<=5){
				System.out.print("*");
			B++;
			}
			System.out.println();
			A++;
		}
	}
}