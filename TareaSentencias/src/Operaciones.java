import java.util.Scanner;

public class Operaciones {

	public static void main(String[] a) {
		int X, Y;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa numero ");
		int A = sc.nextInt();
		System.out.println("Ingresa numero ");
		int B = sc.nextInt();
		System.out.println("Ingresa numero ");
		int C = sc.nextInt();
		System.out.println("Ingresa numero ");
		int D = sc.nextInt();
		System.out.println("Ingresa numero ");
		int E = sc.nextInt();
		
		if (A > B && A > C && A > D && A > E) {
			X = A;
		} else {
			if (B > A && B > C && B > D && B>E) {
				X = B;
			} else {
				if (C > A && C > B && C > D && C>E) {
					X = C;
				} else
					X = D;
			}
		}
		System.out.println("el mayor es " + X);

	}
}
