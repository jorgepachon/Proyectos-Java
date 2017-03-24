package RetoPrueba;

public class Main {
	static java.util.Scanner in;

	public static void casoDePrueba() {
		int n;
		
		n = in.nextInt();
		if (n == 0)
			System.out.println("hola mundo.");
		
	}

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		int numCasos;
		numCasos = in.nextInt();
		for (int i = 0; i < numCasos; i++)
			casoDePrueba();
	}
}