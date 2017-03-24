package Curso;

public class ClaseDosUno {

	public static void main(String[] args) {
		
		int [] vectoresAleatorios=new int[150];
		
		for(int i= 0; i< vectoresAleatorios.length;i++){
		vectoresAleatorios[i]=(int)Math.round(Math.random()*100) ; 
	}
	for(int numeros:vectoresAleatorios){
		System.out.print(numeros+ " ");
	}
}
}
