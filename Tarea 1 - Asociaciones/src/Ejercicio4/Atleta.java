package Ejercicio4;

import java.util.ArrayList;

public class Atleta {

	private double tiempo;
	private int posicion;
	private ArrayList<Carrera> participa;

	public Atleta(double tiempo, int posicion) {
		this.tiempo=0.0;
		this.posicion=posicion;
		this.participa=new ArrayList<Carrera>();
	}
}
