
public class Rebajas {
	
	public static double descubrePorcentaje(double anterior, double actual){
		return (anterior-actual)*100/actual;
	}
	
	public static void main(String[] args) {
		System.out.println(descubrePorcentaje(100,60));
		System.out.println(descubrePorcentaje(100,45));
		System.out.println(descubrePorcentaje(100,90));
		System.out.println(descubrePorcentaje(100,80));

	}

}
