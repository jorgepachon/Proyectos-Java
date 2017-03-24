package Arrays;
import java.util.Scanner;
public class CincoPares {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		 int [] array = new int[5];
		 	 
		 
		 for (int i = 0; i < 5; i++) {
			 array[i]=sc.nextInt();
			 
		 }
		 boolean par = false;
		 
		 for (int i = 0; i < 5; i++) {
			 
			if (array[i]%2==0){
				System.out.println(array[i]);
				par=true;
		}else{
			
		
			System.out.println("no hay pares");
	}
}
}
}