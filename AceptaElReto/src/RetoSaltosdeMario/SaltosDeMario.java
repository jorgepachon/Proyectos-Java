package RetoSaltosdeMario;

import java.util.*;

public class SaltosDeMario {
	static java.util.Scanner in;

	

	public static void main(String args[]) {
		 int casos,muros,altura,alturaSig;
	        int saltoArriba,saltoAbajo;
	        int i=1,j;
	        Scanner entrada = new Scanner(System.in);
	       
	        casos= entrada.nextInt();
	        while ( i <= casos) {
	            saltoArriba=0;
	            saltoAbajo=0;
	            muros=entrada.nextInt();
	            altura = entrada.nextInt();
	            j=1;
	            while( j < muros) {
	                alturaSig= entrada.nextInt();
	                if (altura<alturaSig) ++saltoArriba;
	                 else if (altura>alturaSig) ++saltoAbajo;
	                altura=alturaSig;
	                j++;
	            }
	            System.out.println(saltoArriba+" "+saltoAbajo);
	            i++;
	        }
	    }
	}