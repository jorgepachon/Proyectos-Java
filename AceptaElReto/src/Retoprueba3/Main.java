package Retoprueba3;

public class Main {
	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		int n;
		
		if (!in.hasNext())
			return false;
		n = in.nextInt();
		if ((n % 2) == 0)
			System.out.println("PAR");
		else
			System.out.println("IMPAR");
		return true;
	}

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba())
			;
	}
}