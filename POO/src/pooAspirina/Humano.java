package pooAspirina;

public class Humano {
private String color_cabello;
private String color_ojos;
private double estatura;
private int peso;
private String fecha_nacimiento;
private boolean mensaje, respuesta;

public Humano(){
	color_cabello="";
	color_ojos="";
	estatura=0.0;
	peso=0;
	fecha_nacimiento="";
	
}

public String Inicio_historia(){//getter historia.
	String Madre="Maria";
	color_cabello="moreno";
	color_ojos="verdes";
	estatura=1.65;
	peso=55;
	fecha_nacimiento="20-10-1972";
	return Madre+" con cabello "+color_cabello+" ojos "+color_ojos+" que pesa "+peso+" y mide "+estatura
			+"\nDomingo por la tarde, de repente a mi madre, le duele la cabeza.\n"
			+ "Entonces el hijo intenta buscar una caja de aspirinas.\n";
}
public String  hijo_parte(){
	String Hijo="Jorge";
	color_cabello="castaño";
	estatura=1.71;
	return Hijo+" hijo de Maria "+color_cabello+", "+estatura+" responde: "+
			"\nNo encuentro aspirinas, tendre que ir a la farmacia.";
}
public String farmaceutica_parte(){
	String Farmaceutica="Celia";
	color_cabello="rubio";
	color_ojos="azules";
	estatura=1.80;
	return "\n"+Farmaceutica+" está en el mostrador de la farmacia con mirada de ojos "+color_ojos+" y pelo "+color_cabello+" \n"+
			" le pregunta: buenos dias, ¿que desea? ";
}

public void mensaje_hijo(String mensaje){
	if (mensaje.equalsIgnoreCase("si")){
		this.respuesta=true;
	}else{
		this.respuesta=false;
		
	}
}
public String dame_respuesta(){
	if(respuesta==true){
		return "te dirijes a la farmacia a comprar aspirina";
	}else{
		
		return"te quedas en casa y tu madre agrava su dolor de cabeza";
		
	}
}

}
