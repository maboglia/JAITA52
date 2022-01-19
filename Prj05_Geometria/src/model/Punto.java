package model;

public class Punto extends Object{//everything is object

	private int x;//private, public, protected, 'niente': modificatori di accesso
	private int y;//incapsulamento
	
	public Punto() {
		System.out.println("hai chimato il costruttore vuoto");
	}//new Punto()
	
	/**
	 * Costruttore del punto
	 * @param a inserire il valore intero della coordinata x
	 * @param b inserire il valore intero della coordinata y
	 */
	public Punto(int x, int y) {//new Punto(1,2)
		System.out.println("hai chimato il costruttore con argomenti");
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
