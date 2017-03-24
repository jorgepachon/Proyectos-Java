package Ejercicio3;

import java.util.Scanner;
import java.util.ArrayList;

public class Challenge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter ten elements: ");
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			a1.add(scanner.nextInt());
		}
		ArrayList<Integer> a2 = new ArrayList<Integer>(a1);
		/// {write you code here
		 a1.set(a1.size() - 1, -7);
		/// }
		System.out.println("ArrayList 1:" + print(a1));
		System.out.println("ArrayList 2:" + print(a2));
	}

	private static String print(ArrayList<Integer> a) {
		String ret = "";
		for (int i = 0; i < a.size(); i++) {
			ret += a.get(i) + " ";
		}
		return ret;
	}
}