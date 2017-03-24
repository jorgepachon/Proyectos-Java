package Ejercicio3;

public class Serie2 {

	public static void main(String[] args) {
		int x,termino;
        x=1;
        termino=100;
        while (x<27) {
            System.out.print(termino);
            System.out.print("  ");
            x++;
            termino=termino -2;
        }
    }
}

