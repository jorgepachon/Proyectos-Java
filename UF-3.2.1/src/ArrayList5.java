import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList5 {

	public static void main(String[] args) {
		ArrayList<String> miColeccion = new ArrayList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un elemento: ");
		String entrada = sc.nextLine();
		boolean esta = false;
		
		// Da valor a la variable "esta" para saber si el elemento introducido
		// est� o no dentro de la lista
		// Mensaje final
		esta = miColeccion.contains(entrada);//para buscar elemento en la lista
		System.out.println(esta ? "Est�" : "No est�");
	}
}
