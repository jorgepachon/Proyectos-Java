import java.util.ArrayList;

public class Arraylist3 {

	public static void main(String[] args) {
		ArrayList<String> miColeccion = new ArrayList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
		// Por tu c�digo aqu�
		
		String aux =miColeccion.get(2);
		miColeccion.set(2, miColeccion.get(1));
		miColeccion.set(1, aux);
		
		// Para imprimir la lista tras el cambio
		for (String elto : miColeccion) {
			System.out.println(elto);
		}
	}
}