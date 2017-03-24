import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio5 {
	public static void main(String a[]) throws Exception {
		String strarr[]; // array which will hold splitted strings of the
							// statement
		String st; // contains user input statement
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Statement:");
		st = br.readLine();
		System.out.println("The reverse is:");
		// Create Array of Strings
		strarr = st.split(" ");
		// Create ArrayList of String
		ArrayList<String> lista = new ArrayList<String>();
		/// {write your code here
		for (int i = 0; i < strarr.length; i++)
			lista.add(strarr[i]);
		Collections.reverse(lista);
		st = lista.get(0);
		lista.remove(0);
		for (String s : lista) {
			st = st + " " + s;
		}
		/// }
		System.out.println(st);
	}

}
