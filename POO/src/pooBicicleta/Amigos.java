package pooBicicleta;

public class Amigos {
	public static void main(String[] args) {
		Bicicleta miBicicleta = new Bicicleta();
		Bicicleta tuBicicleta = new Bicicleta();
		Humano yo = new Humano("Yo y miBicicleta");
		Humano tu = new Humano("Tu y tuBicicleta");
		
		System.out
				.println("Este domingo hemos decidido ir a dar una vuelta en bici y nos encontramos en el parque para empezar nuestra ruta en bicicleta");
		System.out.print(yo.nombre);miBicicleta.imprime();
		System.out.print(tu.nombre);tuBicicleta.imprime();
		System.out.println();
		System.out.println("Empezamos a pedalear");
		yo.arrancar();
		tu.arrancar();
		System.out.print(yo.nombre);yo.imprime();
		System.out.print(tu.nombre);tu.imprime();
		System.out.println();
		System.out.println("Comenzamos a pedalear (Subimos cadencia)");
		yo.cambiarCadencia(true);
		tu.cambiarCadencia(true);
		System.out.print(yo.nombre);yo.imprime();
		System.out.print(tu.nombre);tu.imprime();
		System.out.println();
		System.out
				.println("La parte de la ruta es una recta larga en la cual podemos mantener una velocidad constante, subimos varias marchas para aumentar la velocidad y aumentamos la cadencia 2 puntos.");
		yo.cambiarMarcha(true);
		tu.cambiarMarcha(true);
		yo.cambiarMarcha(true);
		tu.cambiarMarcha(true);
		yo.cambiarMarcha(true);
		tu.cambiarMarcha(true);
		yo.cambiarCadencia(true);
		tu.cambiarCadencia(true);
		yo.cambiarCadencia(true);
		tu.cambiarCadencia(true);
		System.out.print(yo.nombre);yo.imprime();
		System.out.print(tu.nombre);tu.imprime();
		System.out.println();
		System.out.println("Se acerca el final de la recta y frenamos, bajamos dos marchas para iniciar el ascenso al puerto");
		yo.frenar(false);
		tu.frenar(false);
		yo.cambiarMarcha(false);
		tu.cambiarMarcha(false);
		System.out.print(yo.nombre);yo.imprime();
		System.out.print(tu.nombre);tu.imprime();
		System.out.println();
		System.out.println("Aumentamos cadencia para iniciar el ascenso. En la subida tu decides adelantarme por que tu ritmo es mas alto");
		yo.cambiarCadencia(true);
		tu.cambiarCadencia(true);
		yo.cambiarCadencia(true);
		tu.cambiarCadencia(true);
		tu.cambiarCadencia(true);
		System.out.print(yo.nombre);yo.imprime();
		System.out.print(tu.nombre);tu.imprime();
		System.out.println();
		tu.cambiarCadencia(false);
		System.out.println("Tras la subida, iniciamos el descenso. aumentamos la velocidad");
		yo.cambiarMarcha(true);
		tu.cambiarMarcha(true);
		yo.cambiarMarcha(true);
		tu.cambiarMarcha(true);
		yo.cambiarMarcha(true);
		tu.cambiarMarcha(true);
		System.out.print(yo.nombre);yo.imprime();
		System.out.print(tu.nombre);tu.imprime();
		System.out.println();
		System.out.println("llegamos a nuestro destino y frenamos hasta detenernos para dar por finalizada la jornada");
		yo.frenar(true);
		tu.frenar(true);
		System.out.print(yo.nombre);yo.imprime();
		System.out.print(tu.nombre);tu.imprime();
	}
}
