package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Challenge {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter a sentence:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String longestWord = "";

		HashSet<String> conjuntoB = new HashSet <String>();
		conjuntoB.addAll(Arrays.asList(s1.split(" ")));
		for (String elto : conjuntoB) {
			if (elto.length() > longestWord.length()) {
				longestWord = elto;
			}
		}
		
		
		System.out.println("The longest word in the sentence is: " + longestWord);

	}
}
//2,5 puntos ejercicio correcto.