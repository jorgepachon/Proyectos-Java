import java.io.*;

import java.util.LinkedList;

public class Ejercicio1 {
	public static void main(String args[]) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String newstr = "";
		char ch;
		System.out.print("Enter the Word: ");
		String str = br.readLine();
		LinkedList<Character> al = new LinkedList<Character>();
		// Create LinkedList of Character
		for (int i = 0; i < str.length(); i++)
			al.add(str.charAt(i));
		/// {write your code here
		for (int i = 0; i < al.size(); i++) {
			ch = Character.toUpperCase((al.get(i).charValue()));
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
				al.remove(i);
		}
		for (int i = 0; i < al.size(); i++) {
			newstr += al.get(i);
		}
		/// }
		System.out.println("Edited Word: " + newstr);
	}
}
