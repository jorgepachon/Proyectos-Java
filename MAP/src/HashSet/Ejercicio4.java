package HashSet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Ejercicio4 {

	public static void main(String[] args) {
		HashMap<String, Integer> notas = new HashMap<String, Integer>();
		notas.put("Antonio", 7);
		notas.put("Pedro", 9);
		notas.put("Luis", 10);
		notas.put("Marco", 7);
		notas.put("María", 4);
		notas.put("Ana", 10);
		// Obtener la nota de Pedro con get
		System.out.println(notas.get("Pedro"));
		// Preguntar si el alumno María está en lista
		System.out.println(notas.containsKey("María"));
		//TERNARIAS
		System.out.println(notas.containsKey("María")?"Esta en la Lista":"NO está en la Lista");
		// Sacar la nota media de la clase
		double count=0;
		for (Integer elto:notas.values()) {
			count+=elto;
		}
		System.out.println("La nota media es: "+count/notas.size());
		// Listado de todos los alumnos -> Alumno: Nota
		//Mas Eficiente
		for (Entry<String,Integer> st:notas.entrySet()) {
			System.out.println(st.getKey()+": "+ st.getValue());
		}
		//Menos eficiente
		Iterator pase = notas.entrySet().iterator();
		while (pase.hasNext()) {
			HashMap.Entry not = (HashMap.Entry)pase.next();
			System.out.println(not.getKey() + " " + not.getValue());
		}
		
	}

}
