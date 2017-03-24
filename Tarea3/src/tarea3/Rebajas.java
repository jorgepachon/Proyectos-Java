package tarea3;
import java.util.*;
public class Rebajas {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("ingrese el numero");
		double numero=obj.nextInt();
		System.out.println("Ingrese el porcentaje que quiere");
		double porcentaje=obj.nextDouble();
		System.out.println("el porcentaje a obtener es "+ porcentaje+"%");
		double resultado=(porcentaje/100)*numero;
		System.out.println("el porcentaje es "+resultado); 
		
		
	}

}
