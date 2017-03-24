package POTITOSAceptaelReto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class potitos {
//ESTE NO ES EL DE POTITOS
	public static void main(String[] args) {
		HashSet<Integer> numeros = new HashSet<Integer>();
		numeros.add(4);
		numeros.add(6);
		numeros.add(8);
		numeros.add(10);
		numeros.add(15);
		numeros.add(18);
		numeros.add(21);
		
		ArrayList <Integer> miLista = new ArrayList <Integer>();
		
		miLista.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,1,2,3}));
		
		Set<Integer> treeset = new TreeSet<Integer>(numeros);
		System.out.println(miLista);
		for (Integer elto : treeset) {
			System.out.println(elto);
		}
	}
}
