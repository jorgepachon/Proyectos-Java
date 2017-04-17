package FIGURAS;

public class Rectangulo implements Figura {
	public int base;
	public int altura;
	public char caracter;

	public Rectangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
		
	}

	@Override
	public String Nombre() {
		// TODO Auto-generated method stub

		return "Rectángulo Tipo de " + base + "x" + altura;
	}

	@Override
	public void Dibujar() {
		for (int i = 0; i < this.altura; i++) {
			for (int j = 0; j < this.base; j++) {
				System.out.print(this.caracter);

			}
			System.out.println("");

		}

	}

	@Override
	public int Area() {
		// TODO Auto-generated method stub

		return this.base * this.altura;
	}

	@Override
	public void setCaracter(char c) {
		this.caracter=c;

	}

	@Override
	public char getCaracter() {
		// TODO Auto-generated method stub
		return this.caracter;
	}
}
