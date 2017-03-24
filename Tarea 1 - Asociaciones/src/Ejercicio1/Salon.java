package Ejercicio1;

public class Salon {
	private int numeroDeTelevisores;
	    private String tipoSalon;

	    public Salon() {
	        this.numeroDeTelevisores = 0;
	        this.tipoSalon = "desconocido";
	    }

	    public int getNumeroDeTelevisores() {
	        return numeroDeTelevisores;
	    }

	    public void setNumeroDeTelevisores(int numeroDeTelevisores) {
	        this.numeroDeTelevisores = numeroDeTelevisores;
	    }

	    public String getTipoSalon() {
	        return tipoSalon;
	    }

	    public void setTipoSalon(String tipoSalon) {
	        this.tipoSalon = tipoSalon;
	    }
	}
