
public class Coche {
	private int velocidad;
	Coche(){
		velocidad = 0;
	};
	
	public int getvelocidad(){
		return velocidad;
	}
	
	public void acelera(int mas){
		velocidad+=mas;
	}
	
	public void frena(int menos){
		velocidad-=menos;
	}
	public static void main(String[] args) {

	}

}
