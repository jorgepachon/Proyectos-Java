package Curso;
import java.*;

import javax.swing.JOptionPane;
public class ClaseDos {

	public static void main(String[] args) {
		
		String [] paises = new String[8];
		
		/*paises[0]="España";
		paises[1]="Mexico";
		paises[2]="Colombia";
		paises[3]="Peru";
		paises[4]="Chile";
		paises[5]="Argentina";*/

		for (int i = 0; i < paises.length; i++) {
		 paises[i]=JOptionPane.showInputDialog("introduce pais " + (i+1));
		}
		for (String elemento:paises){
			
			System.out.println("Pais "+elemento);
		}
	

	}
}