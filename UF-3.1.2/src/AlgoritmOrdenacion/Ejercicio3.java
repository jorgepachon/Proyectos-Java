package AlgoritmOrdenacion;

import java.util.Arrays;

public class Ejercicio3 {

	public static void main(String[] args) {
		int[] sueldos = { 1200, 750, 820, 550, 490 };
		int aux;
		int pasos=0;//esto se añade despues
		// Implementa el algoritmo que acabas de ver en la parte teórica
		
		for (int k = 0; k < sueldos.length-1; k++) {
			
			for (int f = 0; f < sueldos.length - 1 -k; f++) { //-k reduce pasos
				pasos++;
				if (sueldos[f] > sueldos[f + 1]) {
					aux = sueldos[f];
					sueldos[f] = sueldos[f + 1];
					sueldos[f + 1] = aux;
				}
			}
		}
		System.out.println(Arrays.toString(sueldos));
		System.out.println("algoritmo resuelto en "+pasos+" pasos");
	}
}
