package pooAspirina;
import java.util.Scanner;

public class Hijo extends Madre {
	public Hijo() {
		String colorCabello = "negro";
		String colorOjos = "marrones";
		int estatura = 180;
		String fechaNacimiento = "25/05/2000";
		int peso = 80;

	}

	public boolean  buscaAspirina(boolean aspirina) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Hay aspirinas en el armario? Sí/No");
		String respuesta1 = scan.next(); 
		if (respuesta1.equals("Si") || respuesta1.equals("si")||respuesta1.equals("Sí") || respuesta1.equals("SI")){
			aspirina = true;
		} else if (respuesta1.equals("No") || respuesta1.equals("no") || respuesta1.equals("NO")){
			aspirina = false;
		} else{
			System.out.println("Respuesta no valida");
		}
		if (aspirina){  
			System.out.println("Has encontrado aspirinas en el armario");
			try {
				Thread.sleep (1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			System.out.println("Le das las aspirinas a tu madre");
			recibeAspirina();
		} else {
			System.out.println("No hay aspirinas en el armario, me dirijo a la farmacia");
			try {
				Thread.sleep (1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			vaFarmacia();
		}
		return aspirina;
		
		
	}
	public void vaFarmacia (){
		System.out.println("Entro en la farmacia");
		try {
			Thread.sleep (1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Pregunto si dispone de las aspirinas de mi madre...");

		Farmaceutica farmaceutica= new Farmaceutica ();
		farmaceutica.buscaAspirinas();
		
	}
	
	public void pedirPago (){
		System.out.println("Aqui tiene el dinero, Muchas gracias.");
		try {
			Thread.sleep (1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Me dirijo a casa para darle las aspirinas a mi madre");
		try {
			Thread.sleep (1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		recibeAspirina();
	}
}
