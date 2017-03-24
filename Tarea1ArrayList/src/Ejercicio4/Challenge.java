package Ejercicio4;

import java.util.Scanner;
import java.util.ArrayList;

class Challenge {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		int size = 6;
		System.out.println("Enter 5 Strings to store in arraylist:");
		while (--size > 0) {
			// To add an element to the ArrayList
			al.add(scanner.next());
		}
		int max = Integer.MIN_VALUE;
		/// {write your code here
		for (int i = 0; i < al.size(); ++i) {
            String x = al.get(i);
            int length = x.length();
            
            if (length > max) {
                max = length;
            }
        }
		/// }
		System.out.println("Length of longest string in arraylist: " + max);
	}
}