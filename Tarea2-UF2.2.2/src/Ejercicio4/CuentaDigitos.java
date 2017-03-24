package Ejercicio4;

public class CuentaDigitos {

	public static void main(String[] args) {
		int numero = 4557888; //inicializa variables
		int digitos = 0;	//con esta variable usamos de contador
		
		do {
			numero /= 10; //cuando nuestro numero llega al este conjunto de sentencias
						  //divide entre diez y va quitando la ultima cifra	
			
			digitos++;	  //y luego suma una cifra nuestro contador
			
			
		} while (numero > 0);	//mientras queden cifras seguira cumpliendo la condicion.
								//cuando nuestro numero se quede sin cifras, es decir
								//sea menor que cero, finaliza la condicion del while
								
		
		System.out.println(digitos);  //finalmente imprime el numero de digitos de nuestro numero.
	}

}
 //este programa los podemos usar para contar el numero de digitos de un numero entero