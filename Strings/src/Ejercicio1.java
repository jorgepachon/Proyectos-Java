import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username: ");
		String input = sc.next();
		String respuesta = "Username accepted";
		
		// Write your code here
		// End
		
		if (!input.equalsIgnoreCase("admin")){
			respuesta="Invalid username";
		}			
			System.out.println(respuesta);
		
		
	}
}
