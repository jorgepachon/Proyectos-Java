import java.io.*;
import java.util.PriorityQueue;

public class Ejercicio2 {
	public static void main(String args[]) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		int count = 0;
		char letter;
		System.out.println("Please type in a line of text:");
		String str = br.readLine().toUpperCase();
		// Create PriorityQueue of Character
		PriorityQueue<Character> cola = new PriorityQueue<Character>();
		for (int i = 0; i < str.length(); i++)
			cola.add(str.charAt(i));
		/// {write your code here
		while (!cola.isEmpty()) {
			letter = cola.poll();
			if (!cola.contains(letter) && letter != ' ') {
				System.out.println(letter);
				count++;
			}
		}
		/// }
		System.out.println("There were " + count + " different letters.");
	}
}
