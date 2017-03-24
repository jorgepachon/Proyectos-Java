package Ejercicio3;

public class Test {

	public static void main(String[] args) {
		Actor act =new Actor("Will", 1982);
		Pelicula pel =new Pelicula("hola", "adios", 5);
		for (int i = 0; i < 15; i++) {
			System.out.println(pel.addActor(act));
		}
		System.out.println(act.getNombre());
	}

}
