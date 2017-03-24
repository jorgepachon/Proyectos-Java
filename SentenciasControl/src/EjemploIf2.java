import java.util.Scanner;

public class EjemploIf2 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("nota Matematicas: ");
		int matematicas = in.nextInt();
		
		System.out.println("nota lengua: ");
		int lengua = in.nextInt();
		
		if ((matematicas >= 5) && (lengua >= 5)) 
		{
			System.out.println("Enhorabuena!!");
		}	 			
		else if((lengua>=5)&(matematicas <5))
		{
				System.out.println("Aprobastes solo lengua");
		} 
		else if((lengua<5)&(matematicas >=5))
		{
						
		System.out.println("Aprobastes solo mates");
		}else{
			System.out.println("Has suspendido lengua y mates");
		}
		in.close();
				
				

	}
}
