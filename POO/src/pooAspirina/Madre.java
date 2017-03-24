package pooAspirina;

public class Madre {
	public Madre(){
		String colorCabello = "marron";
		String colorOjos =  "verdes";
		int estatura = 170;
		String fechaNacimiento = "12/03/1980";
		int peso = 60;
	}
	public void enferma(){
		System.out.println("Has dejado enfermar a tu madre");
	}
	public void recibeAspirina(){
		try {
			Thread.sleep (1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("¡Gracias hijo! Voy a descansar para recuperarme cuanto antes");
	}
}