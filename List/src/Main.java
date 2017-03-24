import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		PriorityQueue<String> miColeccion = new PriorityQueue<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
		System.out.println("Primer elemento:");
		System.out.println(miColeccion.poll());
		System.out.println("Resto de elementos:");
		for (String elto : miColeccion) {
			System.out.println(elto);
		}
	}
}
