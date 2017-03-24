import java.io.*;

public class bisiesto {

	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("####Aplicacion Calendario a�o BISIESTO####");
		System.out.println("Introducir el a�o: ");
		
		int a�o = Integer.parseInt(in.readLine());
		
		//formula para averiguar si el a�o es bisiesto
		if ((a�o % 4 == 0) && ((a�o % 100 != 0) || (a�o % 400 == 0))) { //esta linea es un comentario de prueba para modificar .
			
			System.out.println("EL A�O " + a�o + " SI ES BISIESTO");
			
		} else {
			
			System.out.println("EL A�O " + a�o + " NO ES BISIESTO");
		}
	}
}
