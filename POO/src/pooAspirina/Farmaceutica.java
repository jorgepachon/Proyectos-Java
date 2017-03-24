package pooAspirina;
import java.util.Scanner;

public class Farmaceutica extends Hijo{
	public Farmaceutica () {
		String colorCabello = "rubio";
		String colorOjos = "azules";
		int estatura = 175;
		String fechaNacimiento = "01-01-1990";
		int peso = 50;
		

	}
	public void buscaAspirinas(){
		Scanner scan = new Scanner(System.in);
		int precioAspirinas = 9;
		
		try {
			Thread.sleep (1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("La farmaceutica me responde... Sí/No");
		try {
			Thread.sleep (1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String respuesta2 = scan.next(); 
		if (respuesta2.equals("Si") || respuesta2.equals("si")||respuesta2.equals("Sí") || respuesta2.equals("SI")){
			System.out.println("Su precio es de "+ precioAspirinas +" Euros.");
			System.out.println("¿Cuantas unidades quiere?");
			int respuesta3 = scan.nextInt();
			scan.nextLine();
			int total = respuesta3 * precioAspirinas;
			try {
				Thread.sleep (1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("El total del importe es de " + total + " Euros.");
			try {
				Thread.sleep (1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pedirPago();
			
		} else if (respuesta2.equals("No") || respuesta2.equals("no") || respuesta2.equals("NO")){
			System.out.println("Me dirijo a buscar otra farmacia");
			vaFarmacia();
		}
		 
	}
}
