package Array;

public class SmallPrimes {

	public static void main(String[] args) {// maneras de declarar los arrays
		
		int [] smallPrimes2 = new int [6];// pirmera forma con seis casillas
		smallPrimes2[3]=10;
		
		for (int i = 0; i < smallPrimes2.length; i++) { //forma de leer un array
			System.out.println(smallPrimes2[i]);
		}
		
		
				
		int [] smallPrimes = {2, 3, 5, 7, 11, 12}; //manera de declarar un array
		smallPrimes2 [0]=10; //para dar uno a uno valores a posiciones array
		for (int i = 0; i < smallPrimes.length; i++) { //forma de leer un array
			System.out.println(smallPrimes[i]);
		}
		

	}

}
