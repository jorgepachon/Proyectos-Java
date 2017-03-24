package pruebasunit;



public class Codigo2 {
	private int n;
	public Codigo2(int a) {
		n=a;
	}
	public int factorial() {
		int fact = 1;
		if (n > 2 && n < 32)
			for (int i = 2; i <= n; i++) {
				fact *= i;
			}
		else if (n == 0 || n == 1)
			fact = 1;
		else
			fact = -1;
		return fact;
	}
	public static void main(String[] args) {
	
		Codigo2 miCodigo=new Codigo2(5);
		System.out.println(miCodigo.factorial());
		
	}
	
}
