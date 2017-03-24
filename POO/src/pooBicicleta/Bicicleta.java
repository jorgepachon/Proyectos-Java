package pooBicicleta;

public class Bicicleta {
	int velocidad;
	int cadenciaActual;
	int marchaActual;
	
	
	public Bicicleta (){
		this.velocidad = 0;
		this.cadenciaActual=0;
		this.marchaActual=1;
	}
	public void arrancar(){
		this.velocidad = 10;
		this.cadenciaActual=40;
		this.marchaActual=1;
	}
	
	public int velocidad(){
		return this.velocidad;
	}
	public int cadenciaActual(){
		return this.cadenciaActual;
	}
	public int marchaActual(){
		return this.marchaActual;
	}
	public void frenar(boolean total){
		if (total){
			velocidad = 0;
			cadenciaActual=0;
			marchaActual=1;
		} else {
			if(velocidad > 20){
				velocidad-=15;
				cadenciaActual=40;
				
			}else{
				velocidad = 0;
				cadenciaActual=0;
				marchaActual=1;
			}
		}
	}
	public void imprime(){
		System.out.println(":  [Velocidad: " + velocidad()
				+ " KM/H   Cadencia: " + cadenciaActual()
				+ " P.P.M.   Marcha: " + marchaActual() + " ]");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void cambiarMarcha(boolean subir){
		if (subir){
			if (marchaActual < 5){
				marchaActual++;
				velocidad+= 5;
				
			}else{
				marchaActual = 5;
				
			}
		}else {
			if (marchaActual>1){
				marchaActual--;
				velocidad-=5;
			} else{
				marchaActual = 1;
				
			}
		}	
		
	}
	
	public void cambiarCadencia (boolean subir){
		
		if (subir){
			if (cadenciaActual == 0){
				this.cadenciaActual = 40;
				this.velocidad = 30;
				
			}else if (cadenciaActual >= 40){
				cadenciaActual += 20;
				velocidad += 5;
			}else if (cadenciaActual == 120){
				
			}
		}else {
			if (cadenciaActual== 60){
				cadenciaActual = 0;
				velocidad = 0;
			} else if (cadenciaActual>60){
				cadenciaActual-=20;
				velocidad-=5;
			} else if (cadenciaActual== 0){
				
			}
		}	
		
	}
	
	
}