package Arrays;
import java.util.Scanner;
public class SumaDiezNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] array = new int[10];
		int suma=0;
		
		System.out.println("intro numero: ");
		
		for (int i = 0; i < array.length ; i++) {
			array[i]=sc.nextInt();
			
			
			suma+=array[i];// suma los numeros entre si
		}
		System.out.println(suma);
	}

}
