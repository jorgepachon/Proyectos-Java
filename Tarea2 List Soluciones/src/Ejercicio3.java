import java.io.*;
import java.util.ArrayDeque;

public class Ejercicio3 {
	public static void main(String args[]) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		char ch1, ch2;
		System.out.println("Enter a string:");
		String str = br.readLine();
		// Create ArrayDeque of Character
		ArrayDeque<Character> dobleCola = new ArrayDeque<Character>();
		for (int i = 0; i < str.length(); i++)
			dobleCola.add(str.charAt(i));
		/// {write your code here
		ch1 = dobleCola.pollFirst();
		ch2 = dobleCola.pollFirst();
		dobleCola.addLast(ch1);
		dobleCola.addLast(ch2);
		for (Character c : dobleCola) {
			System.out.print(c);
		}
		/// }
	}
}
