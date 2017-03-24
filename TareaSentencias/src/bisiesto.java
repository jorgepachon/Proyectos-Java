import java.io.*;

public class bisiesto {

	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("####Aplicacion Calendario año BISIESTO####");
		System.out.println("Introducir el año: ");
		
		int año = Integer.parseInt(in.readLine());
		
		//formula para averiguar si el año es bisiesto
		if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) { //esta linea es un comentario de prueba para modificar .
			
			System.out.println("EL AÑO " + año + " SI ES BISIESTO");
			
		} else {
			
			System.out.println("EL AÑO " + año + " NO ES BISIESTO");
		}
	}
}
