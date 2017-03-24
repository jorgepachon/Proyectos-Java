import java.util.*;

public class Intercambio {

	static int A;
	static int B;
	

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("INTRODUCE VALOR A: ");
		A = sc.nextInt();
		System.out.print("INTRODUCE VALOR B: ");
		B = sc.nextInt();
		System.out.println("VALOR INCIAL: A = " + A + "   B = " + B);
		A = A + B;
		B = A - B;
		A = A - B;		
		System.out.println("VALOR INTERCAMBIADO: A = " + A + "   B = " + B);
	}

}
