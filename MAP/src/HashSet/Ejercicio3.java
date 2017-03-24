package HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Ejercicio3 {

	public static void main(String[] args) {
		LinkedHashSet<String> numeros = new LinkedHashSet<String>();
		numeros.addAll(Arrays.asList("Uno","aed", "Dos", "Tres", "Cuatro"));
		// Conjunto resultante
		for (String elto : numeros) {
			System.out.println(elto);
		}
	}
}
