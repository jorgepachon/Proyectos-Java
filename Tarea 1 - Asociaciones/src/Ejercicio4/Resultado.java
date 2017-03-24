package Ejercicio4;

public class Resultado {

	private double tiempo;
	private int posicion;
	private Carrera carrera;
	private Atleta atleta;
	
	public Resultado(double tiempo, int posicion){
		this.tiempo=tiempo;
		this.posicion=posicion;
		
	}
	 
	public Resultado(double tiempo, int posicion, Carrera carrera, Atleta atleta){
		this.tiempo=tiempo;
		this.posicion=posicion;
		this.carrera=carrera;
		this.atleta=atleta;
		
	}
	
	@Override
	public String toString(){
		return "Tiempo: "+tiempo+"| Posicion: "+posicion+" Carrera: "+carrera+" Atleta: "+atleta;
	}
	
	public double getTiempo() {
		return tiempo;
	}

	
	public int getPosicion() {
		return posicion;
	}

	

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	

	public void setAtleta(Atleta atleta) {
		this.atleta = atleta;
	}

	
	
	

}
