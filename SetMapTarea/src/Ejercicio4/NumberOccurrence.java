package Ejercicio4;
import java.util.*;



public class NumberOccurrence {
	public static void main(String a[]) throws Exception {
		int[] arr = new int[8];
		int countOccurrence = 0;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 8; i++) {
			System.out.println("Enter Number [" + i + "]:");
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter a number which exist in the array:");
		int number = scan.nextInt();
		// Create a HashMap where firs number is the number and
		// the second is the number of occurrence of this number
		HashMap<Integer, Integer> miTabla = new HashMap<Integer, Integer>();
		/// {write your code here
		/// }
		for (int i = 0; i < arr.length; i++) {
			miTabla.put(i, arr[i]);
		}
		
		for (int xd : miTabla.values()) {
			if (xd == number) {
				countOccurrence ++;
			}
		}
		
		System.out.println("Occurrence of " + number + " :");
		System.out.println(countOccurrence);
	}
}
//2,5 puntos ejercicio correcto