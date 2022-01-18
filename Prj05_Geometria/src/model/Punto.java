package model;

public class Punto extends Object{

	private int x;//private, public, protected, 'niente': modificatori di accesso
	private int y;//incapsulamento
	
	/**
	 * Costruttore del punto
	 * @param a inserire il valore intero della coordinata x
	 * @param b inserire il valore intero della coordinata y
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	
	
	public int getX() {
		return x;
	}



	public int getY() {
		return y;
	}



	@Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
	
}
