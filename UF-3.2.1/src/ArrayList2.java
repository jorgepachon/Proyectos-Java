import java.util.ArrayList;
public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<String> miColeccion = new ArrayList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
		String ultimoElto = null;
		
		// �C�mo conseguir el �ltimo elemento
		ultimoElto = miColeccion.get(miColeccion.size()-1);
		System.out.println("El �ltimo elemento es: " + ultimoElto);
	}
}
