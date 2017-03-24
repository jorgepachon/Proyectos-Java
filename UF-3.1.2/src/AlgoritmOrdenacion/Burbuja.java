package AlgoritmOrdenacion;

public class Burbuja {

	public static void main(String[] args) {
		
		int[] listado1 = { 6, 2, 3, 1, 4, 5, 7 };
		int[] listado2 = { 1, 2, 3, 4, 5, 6, 7 };
		boolean isSort=true;
		
		for (int i = 0; i < listado1.length-1; i++) {
			if(listado1[i]>listado1[i+1]){
				isSort=false;
			}
		}
		if (isSort)
			System.out.println("El vector está ordenado");
			else
			System.out.println("El vector NO está ordenado");
	}

}
