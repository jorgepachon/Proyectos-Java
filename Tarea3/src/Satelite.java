
public class Satelite { //class se escribe con doble s

	private double meridiano;
	private double paralelo; //faltaba el punto y coma
	private double distancia_tierra;
	Satelite (double m,double p,double d){
	meridiano=m;
	paralelo=p;
	distancia_tierra=d;
	}
	Satelite (){ //la clase satelite no puede llevar acentos
	meridiano=paralelo=distancia_tierra=0;
	}
	public void setPosicion(double m,double p,double d){
	meridiano=m;
	paralelo=p;
	distancia_tierra=d; // variable que no estaba bien escrita
	}
	public void printPosicion(){
	System.out.println("El satélite se encuentra en el paralelo "+ paralelo+ "	Meridiano "+meridiano+ "a una distancia de la tierra de "+distancia_tierra+ "kilómetros");
	// las comillas no estaban bien colocadas
}
}