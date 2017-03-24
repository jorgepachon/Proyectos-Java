package Array;

public class Array10 {//poner 10 al pimer y ultimo espcio

	public static void main(String[] args) {
		
		int [] values = new int [10];// numero de espacios
		values [0] = 10; //posicion primera
		values [values.length - 1] = 10; //posicion final
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
	}

}
}