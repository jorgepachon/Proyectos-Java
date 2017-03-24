package pooAspirina;

import java.util.Scanner;

public class Aspirina {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean aspirina = false;
		Madre madre = new Madre();
		Hijo hijo = new Hijo();
		System.out.println(
				"Mi madre tiene un fuerte dolor de cabeza y me indica si puedo ir a por una aspirina para remediar el dolor");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			
			e1.printStackTrace();
		}
		System.out.println("Busco la aspirina.. ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			
			e1.printStackTrace();
		}
		hijo.buscaAspirina(aspirina);
		if (aspirina) {

		}

	}
}