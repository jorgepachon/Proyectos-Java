package Array;

public class FormasArray {

	public static void main(String[] args) {
		int c = 15;
		int[] primes = { 1, 2, 3, 5, 7, 9, 11 };
		int[] a = { 1, primes[2], c, (int) Math.pow(2,2) };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
	


