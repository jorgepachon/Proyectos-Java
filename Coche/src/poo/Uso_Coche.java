package poo;

import javax.swing.JOptionPane;

public class Uso_Coche {

	public static void main(String[] args) {
				
		Coche Micoche=new Coche();
		Micoche.establece_color(JOptionPane.showInputDialog("Introduce color "));
		
		System.out.println(Micoche.dime_datos());
		System.out.println(Micoche.dime_color());
		
		Micoche.asientos(JOptionPane.showInputDialog("tiene asientos de cuero? "));
		System.out.println(Micoche.dime_asientos());
		
		Micoche.config_climatizador(JOptionPane.showInputDialog("tiene climatizador? "));
		System.out.println(Micoche.dime_climatizador());
		
		System.out.println(Micoche.dime_peso_coche());
		
		System.out.println("el precio final es "+Micoche.precio_coche());
	}

}
