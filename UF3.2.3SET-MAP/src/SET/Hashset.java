package SET;

import java.util.Arrays;
import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet<String> conjuntoB = new HashSet<String>();
		HashSet<String> conjuntoN = new HashSet<String>();
		conjuntoB.addAll(Arrays.asList("Luis In�s Ana Beto".split(" ")));
		conjuntoN.addAll(Arrays.asList("Ana Beto Pedro".split(" ")));
		// Por aqu� tu instrucci�n
		
		conjuntoN.retainAll(conjuntoB);
		
		
		// Conjunto resultante
		System.out.print("Conjunto Intersecci�n:"+conjuntoN);
	}

}
