import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the URL :");
		String s=sc.nextLine();
		Ejercicio2 obj=new Ejercicio2();
		s=obj.decodeURL(s);//reasignacion
		
		System.out.print("Decoded URL is :"+s);
	}

	private String decodeURL(String s) {
				
		return s.replace("%20", "").replace("%3A", "?").replace("%3D", ".");
	}

}
// los string son constantes no se pueden modificar, se pueden reasignar