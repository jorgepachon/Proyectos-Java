import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class ArryList4 {

	public static void main(String[] args) {
		ArrayList<String> miColeccion = new ArrayList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
		// Para imprimir la lista tras la rotación, recuerda las operaciones
		// El resultado debería ser: List, Set, SortedSet, Map y Collection
		
		//String aux = miColeccion.get(0);
		
		//miColeccion.remove(0);
		//miColeccion.add(aux);//otra forma
		
		//miColeccion.add(miColeccion.size(), aux);
		//con esto rotamos los elementos de la lista
		
		Collections.rotate(miColeccion, -1);// metodo para rotar arraylist
		for (String elto : miColeccion) {
			System.out.println(elto);
		}
	}
}