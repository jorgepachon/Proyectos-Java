import java.io.*;

public class LeerTeclado2 {

	public static void main(String[] args) {
		String nombre;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Escribe tu nombre: ");
		try {
			
			nombre = br.readLine();
			
		} catch (IOException e) {
			e.printStackTrace();
			nombre="error";
		}
		
		System.out.println("Hola " + nombre + ", ¿cómo estás?");
	}

}
