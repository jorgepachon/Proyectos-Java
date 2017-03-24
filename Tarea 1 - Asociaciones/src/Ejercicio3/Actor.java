package Ejercicio3;

public class Actor {

	private String nombre;
	private int nacimiento;
	
	public Actor(String nombre, int nacimiento){
		this.nombre=nombre;
		this.nacimiento=nacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(int nacimiento) {
		this.nacimiento = nacimiento;
	}
	public String toString(){
		return "Actor [nombre: "+nombre+", nacimiento: "+nacimiento+" ]";
	}
}
