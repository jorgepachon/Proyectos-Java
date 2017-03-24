
public class Pajaro {
			
	private int edad;
	private String color;

	public Pajaro(int edad, String color){
		this.edad = edad;
		this.color = color;
	}

	public void mostrarEdad(){
		System.out.println("el pajaro tiene "+ edad +" años");
	}
	
	public void mostrarColor(){
		System.out.println("mi pajaro es de color "+ color);
	}
	
	public static void main(String[] args) {
		Pajaro miPajaro;
		miPajaro = new Pajaro(5, "amarillo");
		miPajaro.mostrarEdad();
		miPajaro.mostrarColor();
			}

}

