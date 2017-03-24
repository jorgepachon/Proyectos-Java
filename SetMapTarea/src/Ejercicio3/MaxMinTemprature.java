package Ejercicio3;

import java.io.*;
import java.util.*;

public class MaxMinTemprature {
	public static void main(String a[]) throws Exception {
		double MaxTemp = 0.0, MinTemp = 0.0;

		// write your logic here
		Scanner sc = new Scanner(System.in);
		// Create a LinkedHashSet of String
		LinkedHashSet<Double> sortSet = new LinkedHashSet<Double>();
		while (sc.hasNext()) {
			sortSet.add(sc.nextDouble());
		}
		
		for (Double aux : sortSet) {
			if (aux > MaxTemp) {
				MaxTemp = aux;
			}
			if (aux < MinTemp) {
				MinTemp = aux;
			}
		}

		// end

		System.out.println("Maximum:");
		System.out.println(MaxTemp);
		System.out.println("Minimum:");
		System.out.println(MinTemp);
	}
}
//2,5 puntos ejercicio correcto