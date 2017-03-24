package LINKEDHASHSET;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Main {
	public static void main(String[] args) {
		LinkedHashSet<String> numeros = new LinkedHashSet<String>();
		numeros.addAll(Arrays.asList("Uno", "Dos", "Tres", "Cuatro"));
		// Conjunto resultante
		for (String elto : numeros) {
			System.out.println(elto);
		}
	}
}
