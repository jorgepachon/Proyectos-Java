package FIGURAS;
import java.util.ArrayList;

public class Pantalla {
	public ArrayList<Figura> misFiguras;

	public Pantalla() {
		super();
		this.misFiguras = new ArrayList<Figura>();
	}

	public void anade_Figura(Figura miFigura) {
		this.misFiguras.add(miFigura);
	}

	public void modifica_Figura(char miCaracter) {
		for (int i = 0; i < misFiguras.size(); i++) {
			misFiguras.get(i).setCaracter(miCaracter);

		}

	}

	public void lista_Figuras() {
		for (int i = 0; i < misFiguras.size(); i++) {
			System.out.println(misFiguras.get(i).Nombre());
		}
	}

	public int area_Pantalla() {
		int areaTotal = 0;
		for (int i = 0; i < misFiguras.size(); i++) {
			areaTotal += misFiguras.get(i).Area();

		}
		return areaTotal;

	}

	public void muestra_Pantalla() {
		for (int i = 0; i < misFiguras.size(); i++) {
			System.out.println("Figura: " + misFiguras.get(i).Nombre());
			System.out.println("");
			misFiguras.get(i).Dibujar();
			System.out.println("Su área es: " + misFiguras.get(i).Area());
			System.out.println("");
			
			

		}
		
	}

}
