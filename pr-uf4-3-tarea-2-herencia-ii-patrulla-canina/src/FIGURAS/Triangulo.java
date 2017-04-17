package FIGURAS;


public class Triangulo implements Figura {
	public int lado;
	public String tipo;
	public char caracter;

	public Triangulo(int lado, String tipo) {
		super();
		this.lado = lado;
		this.tipo = tipo;
	}

	@Override
	public String Nombre() {
		// TODO Auto-generated method stub
		return "Triángulo " + tipo + " lado " + lado;
	}

	@Override
	public void Dibujar() {

		if (tipo.equalsIgnoreCase("a")) {

			int lado2 = this.lado;
			for (int i = 0; i < this.lado; i++) {
				for (int j = lado2; j > 0; j--) {
					System.out.print(this.caracter + " ");
				}
				lado2--;
				System.out.println("");
			}
		
		} else if (tipo.equalsIgnoreCase("b")) {

			for (int i = this.lado; i >= 0; i--) {
				for (int j = 1; j <= this.lado; j++) {
					if (j < this.lado - (i - 1)) {
						System.out.print(" ");
					} else {
						System.out.print(this.caracter);
					}

				}

				System.out.println("");
			}
			
		} else if (tipo.equalsIgnoreCase("c")) {

			for (int i = 1; i <= this.lado; i++) {
				for (int k = 1; k < i; k++) {
					System.out.print(this.caracter);
				}
				System.out.println(this.caracter);
			}
			System.out.println("");
		} else {

			for (int i = 1; i <= this.lado; i++) {
				for (int j = 1; j <= lado; j++) {
					if (j < this.lado - (i - 1)) {
						System.out.print(" ");
					} else {
						System.out.print(this.caracter);
					}

				}

				System.out.println("");
			}
			
		}

	}

	@Override
	public int Area() {

		return this.lado * this.lado / 2;
	}

	@Override
	public void setCaracter(char c) {
		// TODO Auto-generated method stub
		this.caracter = c;

	}

	@Override
	public char getCaracter() {
		// TODO Auto-generated method stub
		return this.caracter;
	}
}
