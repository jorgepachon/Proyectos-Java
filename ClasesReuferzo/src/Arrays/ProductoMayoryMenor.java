package Arrays;
import java.util.Arrays;
import java.util.Scanner;   

public class ProductoMayoryMenor {

	public static void main(String[] args) {

		int array[]  = new int [10];
		int aux=0;
		int max=0,min=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("intro numeros: ");
		
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
		
			if (i==9){
			break;	
			}
			
		}
		Arrays.sort(array);
		min= array[0];
		max= array[9];
		System.out.println("resultado: "+(max*min));
	}

}
