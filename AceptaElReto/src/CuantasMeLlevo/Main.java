package CuantasMeLlevo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leo = new Scanner(System.in);
		String cadena, num1, num2, mayor, menor;
		int pos, llevo, cont, longitud, acarreo, dif;

		cadena = leo.nextLine();

		pos = cadena.indexOf(" ", 0);
		num1 = cadena.substring(0, pos);
		num2 = cadena.substring(pos + 1);

		while (Character.getNumericValue(num1.charAt(0)) != 0 
				|| Character.getNumericValue(num2.charAt(0)) != 0) {
			cont = 0;
			llevo = 0;
			if (num1.length() < num2.length()) {
				mayor = num2;
				menor = num1;
			} else {
				mayor = num1;
				menor = num2;

			}
			longitud = mayor.length();
			dif = mayor.length() - menor.length();
			for (int i = longitud - 1; i >= 0; i--) {
				acarreo = 0;
				acarreo += llevo;
				acarreo += Character.getNumericValue(mayor.charAt(i));
				if (i - dif >= 0)
					acarreo += Character.getNumericValue(menor.charAt(i - dif));
				else
					llevo = 0;

				if (acarreo > 9) {
					llevo = acarreo / 10;
					++cont;
				} else
					llevo = 0;
				if (llevo == 0 && (i - dif < 0)) {
					break;
				}
			}
			System.out.println(cont);
			cadena = leo.nextLine();

			pos = cadena.indexOf(" ", 0);
			num1 = cadena.substring(0, pos);
			num2 = cadena.substring(pos + 1);

		}

	}

}