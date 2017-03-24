package Ejercicio3;
import java.util.Scanner;
public class Perfecto {

	public static void main(String[] args) {
		int i, suma = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca numero natural:  ");
        n = sc.nextInt();
       
        for (i = 1; i < n; i++) {  
            if (n % i == 0) {
                suma = suma + i;     
            }
        }
        
        if (suma == n) {  
            System.out.println("El numero "+ n +" es perfecto!");
        } else {
            System.out.println("El numero "+ n +" NO es perfecto!");

        }
    }
}