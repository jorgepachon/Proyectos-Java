package HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class Ejercicio1 {

	public static void main(String[] args) {
		HashSet<String> conjuntoB = new HashSet<String>();
		HashSet<String> conjuntoN = new HashSet<String>();
		conjuntoB.addAll(Arrays.asList("Luis Inés Ana Beto".split(" ")));
		conjuntoN.addAll(Arrays.asList("Ana Beto Pedro".split(" ")));
	
			conjuntoB.removeAll(conjuntoN);
			
		
		System.out.print("Conjunto Intersección:"+conjuntoB);
	}
}
