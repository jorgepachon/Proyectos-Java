
public class Cine {
	static java.util.Scanner sc;

	public static void casoDePrueba() {

		boolean fin = false;
		int cuantos = 0;
		int personas = sc.nextInt();
		int[] asientos = new int[personas];

		if (personas > 0 && personas <= 10000) {
			for (int j = 0; j < asientos.length; j++) {
				asientos[j] = sc.nextInt();
			}
			if (personas > 2) {
				for (int j = personas - 1; j >= 0; j--) {
					if (fin == false) {
						if (asientos[j] % 2 != 0) {
							cuantos++;
							if (j == 0) {
								System.out.println("SI " + cuantos);
							}
						} else {
							fin = true;
							if (j == 0 && cuantos > 0) {
								System.out.println("SI " + cuantos);
							}
						}
					} else if (asientos[j] % 2 != 0) {
						System.out.println("NO");
						j = 0;
					} else if (j == 0 && cuantos > 0) {
						System.out.println("SI " + cuantos);
					} else if (j == 0 && cuantos == 0) {
						System.out.println("NO");
					}

				}
			}
		}
	}

	public static void main(String args[]) {
		sc = new java.util.Scanner(System.in);
		int numCasos;
		numCasos = sc.nextInt();

		for (int i = 0; i < numCasos; i++) {
			casoDePrueba();
		}
	}
}