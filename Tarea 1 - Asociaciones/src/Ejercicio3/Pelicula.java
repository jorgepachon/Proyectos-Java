package Ejercicio3;

import java.util.Arrays;

public class Pelicula {

	private String titulo;
	private String director;
	private int duracion;
	private int numActores;
	private Actor actores[];
	
	public Pelicula(String titulo, String director, int duracion){
		this.titulo=titulo;
		this.director=director;
		this.duracion=duracion;
		this.numActores=0;
		this.actores= new Actor[15];
	}
	
	public String addActor(Actor actor){
		String resultado="";
		if(this.numActores<15){
			actores[numActores]=actor;
			numActores++;
			resultado="Actor añadido";
		}else{
			resultado="fin de actores";
		}
		return resultado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String toString(){
		return "Pelicula [Titulo: "+ titulo+", dierctores: "+ director+", duracion: "+ duracion+
				", actores: "+ Arrays.toString(actores)+", numero actores: "+ numActores+" ]";
	}
}
