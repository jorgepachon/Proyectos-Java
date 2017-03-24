package Potitos;

import java.util.Arrays;
import java.util.TreeSet;

public class Main {
	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		int numPotitos = in.nextInt();
		TreeSet<String> conjuntoIngredientes = new TreeSet<String>();
		TreeSet<String> conjuntoIngredientes2 = new TreeSet<String>();
		if (numPotitos == 0) {
			return false;
		} else {
			for (int i = 1; i <= numPotitos; i++) {
				String acepta = in.next();

				if (acepta.contains("SI")) {
					conjuntoIngredientes.addAll(Arrays.asList(in.nextLine().split(" ")));
				}
				if (conjuntoIngredientes.contains("FIN")) {
					conjuntoIngredientes.remove("FIN");
				} else {
					conjuntoIngredientes2.addAll(Arrays.asList(in.nextLine().split(" ")));
				}
				if (conjuntoIngredientes2.contains("FIN")) {
					conjuntoIngredientes2.remove("FIN");
				}

				conjuntoIngredientes2.removeAll(conjuntoIngredientes);
				conjuntoIngredientes2.remove("");

			}

			int count = 0;
			if (conjuntoIngredientes2.size() == 0) {
				System.out.println();
			}
			for (String elto : conjuntoIngredientes2) {

				System.out.print(elto);
				count++;
				if (count == conjuntoIngredientes2.size()) {
					System.out.println();
				} else {
					System.out.print(" ");
				}

			}

		}

		return true;
	}

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba())
			;
	}

}
