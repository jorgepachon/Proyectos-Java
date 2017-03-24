package HASHMAP;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) {
		HashMap<String, Integer> notas = new HashMap<String, Integer>();
		notas.put("Antonio", 7);
		notas.put("Pedro", 9);
		notas.put("Luis", 10);
		notas.put("Marco", 7);
		notas.put("María", 4);
		notas.put("Ana", 10);

		// Obtener la nota de Pedro con get
		System.out.println("nota de Pedro: " + notas.get("Pedro").toString());

		// Preguntar si el alumno María está en lista
		System.out.println("Esta Maria en la lista? "+notas.containsKey("María") != null?"si esta":"no esta");

		// Sacar la nota media de la clase
		//ArrayList <Integer> lista = new ArrayList <Integer> (notas.values());
		double suma=0;
		for (Integer elto : notas.values()){
			suma+=elto;
		}
		System.out.println("nota media" + suma/notas.size());
		
		// Listado de todos los alumnos -> Alumno: Nota
		//for(Entry<String, Integer> key : notas.entrySet()){
			//System.out.println(key.getKey()+ " -> "+key.getValue());
		//}
		Iterator it = notas.entrySet().iterator();
		while(it.hasNext()){
		  Map.Entry e= (Map.Entry) it.next();
		  System.out.println(e.getKey()+"->"+e.getValue());
		}			
	}
}