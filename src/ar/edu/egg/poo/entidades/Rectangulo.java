package ar.edu.egg.poo.entidades;

public class Rectangulo {
	private int base;
	private int altura;

	public Rectangulo() {
	}

	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public int getAltura() {
		return altura;
	}

	public int superficie() {
		return base * altura;
	}

	public int perimetro() {
		return 2 * (base + altura);
	}

	public void dibujo() {
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				if (j!=0 && j!=base-1 && i!=0 && i!=altura-1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
