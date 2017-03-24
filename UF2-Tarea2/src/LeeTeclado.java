import java.io.IOException;

public class LeeTeclado {
		
	

	public static void main(String[] args) {
try{
	System.out.println("Estimado señor introduzca la letra:  ");
	int c = (char) System.in.read();
	int d = (char) System.in.read();
	int e = (char) System.in.read();
	int f = (char) System.in.read();

	System.out.println("Estimado señor introduzca la letra:  "+ c+".");
	System.out.println("el otro carazter: "+d+".");
	System.out.println("otro mas "+ e+".");
	System.out.println("ultimo "+ f+".");

} catch (IOException e){
	e.printStackTrace();
}
		

	}

}
