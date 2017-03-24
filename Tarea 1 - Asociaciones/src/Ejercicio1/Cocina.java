package Ejercicio1;

public class Cocina {
	protected boolean esIndependiente;
	protected int numeroDeFuegos;

	public Cocina() {
		this.esIndependiente = false;
		this.numeroDeFuegos = 0;
	}

	public boolean getEsIndependiente() {
		return esIndependiente;
	}

	public void setEsIndependiente(boolean esIndependiente) {
		this.esIndependiente = esIndependiente;
	}

	public int getNumeroDeFuegos() {
		return numeroDeFuegos;
	}

	public void setNumeroDeFuegos(int numeroDeFuegos) {
		this.numeroDeFuegos = numeroDeFuegos;
	}
}
