package Array;

public class LuckyNumbers {

	public static void main(String[] args) {
		int[] smallPrimes = { 2, 3, 5, 7, 11, 12 }; // manera de declarar un array
		//smallPrimes[0] = 10; // para dar uno a uno valores a posiciones array
		//for (int i = 0; i < smallPrimes.length; i++) { // forma de leer un array
		//	System.out.println(smallPrimes[i]);
		//}
		int [] luckynumbers = new int [2];
		int [] otro;
		otro = luckynumbers;
		luckynumbers[0]=25;
		luckynumbers=smallPrimes;
		for (int i = 0; i < luckynumbers.length; i++) {
			System.out.println(smallPrimes[i]);
		}
		System.out.println(otro[0]);
	}
}