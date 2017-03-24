package Ejercicio4;
import java.util.ArrayList;
public class Carrera {
	
	private int distancia;
	private int ronda;
	private long fecha;
	private ArrayList<Atleta> corren;
	
	public Carrera(int distancia, int ronda, long fecha){
		this.distancia=distancia;
		this.ronda=ronda;
		this.fecha=fecha;
		this.corren=new ArrayList<Atleta>() ;
		
	}

	
	
	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public int getRonda() {
		return ronda;
	}

	public void setRonda(int ronda) {
		this.ronda = ronda;
	}

	public long getFecha() {
		return fecha;
	}

	public void setFecha(long fecha) {
		this.fecha = fecha;
	}
	
	
	
}
