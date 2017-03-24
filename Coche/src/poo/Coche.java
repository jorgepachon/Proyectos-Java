package poo;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;

	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}

	public String dime_datos() {// metodo getter

		return "el chasis tiene " + ruedas + "  ruedas" + " mide " + largo / 1000 + 
				" metros de ancho de " + ancho
				+ " cm y un peso de chasis " + peso_plataforma + " kg";
	}

	public void establece_color(String color_coche) {// metodo setter
		color = color_coche;
	}

	public String dime_color() {
		return "el color del coche es " + color;
	}

	public void asientos(String asientos_cuero) {
		if (asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero = true;
		} else {
			this.asientos_cuero = false;
		}
	}

	public String dime_asientos() {
		if (asientos_cuero == true) {
			return "el coche tiene asientos de cuero";
		} else {
			return "el coche tiene asientos de serie";
		}
	}
	
	public void config_climatizador(String climatizador){
		if (climatizador.equalsIgnoreCase("si")){
			this.climatizador=true;
		}else{
			this.climatizador=false;
		}
	}
	public String dime_climatizador(){
		if (climatizador==true){
			return "el coche incorpora climatizador";
		}else{
			return "el coche lleva aire acondicionado";
		}
	}
	 
	public String dime_peso_coche(){//setter + getter
		int peso_chasis=500;
		peso_total=peso_plataforma+peso_chasis;
		if (asientos_cuero=true){
			peso_total=peso_total+50;
		}
		if(climatizador=true){
			peso_total=peso_total+20;
		}
		return "el peso del coche es "+peso_total;
	}
	public int precio_coche(){//getter
		int precio_final=10000;
		if(asientos_cuero==true){
			precio_final+=2000;
		}
		if(climatizador==true){
			precio_final+=1500;
		}
		return precio_final;
	}
}
