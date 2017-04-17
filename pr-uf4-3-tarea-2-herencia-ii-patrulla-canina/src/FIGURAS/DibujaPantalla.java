package FIGURAS;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DibujaPantalla {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String tipoFig;
		int opcion = 0;
		String op = "";
		char caracter;
		Pantalla miPantalla = new Pantalla();
	
		try {
		do{
			op = JOptionPane.showInputDialog("Seleccione una opción (1/2/3/4/5/6): \n" + "1.Añadir Figura \n"
					+ "2.Modifica Figura \n" + "3.Mostrar Pantalla \n" + "4.Area Pantalla \n" + "5.Listar Figuras \n" + "6.Salir \n");
			opcion = Integer.parseInt(op);
			switch (opcion) {
			case 1:
				String op1 = "";
				String op2 = "";
				int base = 0, altura = 0, lado = 0;
				String tipo = "";
				do {
					do {
						op1 = JOptionPane.showInputDialog(null,
								"¿Qué tipo de figura desea introducir? (Rectangulo/Triangulo): ");
					} while (!op1.equalsIgnoreCase("Rectangulo") && !op1.equalsIgnoreCase("Triangulo"));

					if (op1.equalsIgnoreCase("Rectangulo")) {
						try {
							base = Integer.parseInt(JOptionPane.showInputDialog("Escriba la base"));
							altura = Integer.parseInt(JOptionPane.showInputDialog("Escriba la altura"));
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "No has introducido un nº entero");
						}
						miPantalla.anade_Figura(new Rectangulo(base, altura));

					} else {
						try{
							lado = Integer.parseInt(JOptionPane.showInputDialog("Escriba el lado"));
							tipo = JOptionPane.showInputDialog("Escriba el tipo de triangulo (a/b/c/d)");
						}catch(Exception e){
							JOptionPane.showMessageDialog(null, "No has introducido un nº entero");
						}
						
						miPantalla.anade_Figura(new Triangulo(lado, tipo));
					}
					op2 = JOptionPane.showInputDialog("¿Desea continuar introduciendo más figuras? \n "
							+ "Escriba 'si' para continuar o cualquier caracter para salir");
				} while (op2.equalsIgnoreCase("Si"));
				caracter = JOptionPane.showInputDialog("¿Con qué caracter desea formar las figuras?").charAt(0);
				miPantalla.modifica_Figura(caracter);

				break;
			case 2:
				caracter = JOptionPane.showInputDialog(null, "Introduzca el nuevo caracter").charAt(0);
				miPantalla.modifica_Figura(caracter);
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "El dibujo de las figuras se mostrará por consola: ");
				miPantalla.muestra_Pantalla();
				break;
			case 4:
				int areaTotal = miPantalla.area_Pantalla();
				JOptionPane.showMessageDialog(null, "EL área total de todas las figuras es de: " + areaTotal);
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "La lista de las figuras se mostrará por consola: ");
				miPantalla.lista_Figuras();
				break;
			case 6:
				opcion=0;
				break;
			}
			
				
			
		}while(opcion>=1 && opcion<=5);
			

		} catch (Exception e) {
			System.out.println("Debes de introducir un número!!");
			JOptionPane.showMessageDialog(null, "Debes de introducir un número!!! \n");

		}

	}

}
