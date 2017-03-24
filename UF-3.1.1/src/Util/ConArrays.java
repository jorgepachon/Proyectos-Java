package Util;
import java.util.*;
public class ConArrays {

	public static void main(String[] args) {
		
		// Declaro un vector inicial
		int [] miVector={11,80,66,8,9};
		
		// Ordenación del vector
		Arrays.sort(miVector);
		
		// Busco un elemento en concreto
		System.out.println(Arrays.binarySearch(miVector, 9));
		
				
		// Imprimir un vector
		System.out.println(Arrays.toString(miVector));
	}

}
