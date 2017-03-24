package RetoNocheVieja;

import java.util.StringTokenizer;

public class Nochevieja {
	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		// inicializacion
		String caso;
		caso = in.nextLine();
		if (caso.equals("00:00"))
			return false;
		// proceso
		StringTokenizer st = new StringTokenizer(caso, ":");

		int horas = Integer.parseInt(st.nextToken());
		int minutos = Integer.parseInt(st.nextToken());

		// resultado
		System.out.println(1440 - (horas * 60 + minutos));
		return true;
	}

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba())
			;
	}
}