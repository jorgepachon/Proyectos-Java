package HashSet;

import java.util.Arrays;
import java.util.TreeSet;

public class Ejercicio2 {

	public static void main(String[] args) {
		TreeSet<Integer> numeros = new TreeSet<Integer>();
		numeros.addAll(Arrays.asList(4, 6, 8, 10, 15, 18, 21));
		// Conjunto resultante
		for (Integer elto : numeros) {
			System.out.println(elto);
		}
	}
}
