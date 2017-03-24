import java.util.ArrayDeque;
public class Deque {

	public static void main(String[] args) {
		int[] listadoInicial = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		ArrayDeque<Integer> listadoFinal = new ArrayDeque<Integer>();
		
		for (Integer elto : listadoInicial) {
			// Por tú código aquí
			
			if(elto %2==0){
				listadoFinal.addFirst(elto);
			}else{
				listadoFinal.addLast(elto);
			}
				
		}
		System.out.println("Resultado Final:");
		for (Integer elto : listadoFinal) {
			System.out.print(elto + " ");
		}
	}
}
