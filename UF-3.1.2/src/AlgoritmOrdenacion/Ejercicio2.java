package AlgoritmOrdenacion;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int[] sueldos = { 1200, 750, 820, 550, 490 };
		int aux;
		// Implementa el algoritmo que acabas de ver en la parte te�rica
		
		for (int f = 0; f < sueldos.length-1; f++) {
			if(sueldos[f]>sueldos[f+1]){
				aux=sueldos[f];
				sueldos[f]= sueldos[f+1];
				sueldos[f+1]=aux;
			}
		}
		System.out.println("El mayor sueldo de todos es: " + sueldos[sueldos.length - 1]);
	}
}