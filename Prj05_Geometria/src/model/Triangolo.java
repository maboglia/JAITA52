package model;

public class Triangolo extends FiguraGeometrica{

	private Punto a, b, c;
	private Segmento ab, bc, ac;
	
	public Triangolo(Punto a, Punto b, Punto c) {
		this.a = a;
		this.b = b;
		this.c = c;

		this.ab = new Segmento(a, b);
		this.bc = new Segmento(b, c);
		this.ac = new Segmento(a, c);
	
	}
	
	public double perimetro() {
		return 
				this.ab.calcolaLunghezza() +
				this.bc.calcolaLunghezza() +
				this.ac.calcolaLunghezza() ;
		
	}
	
	public double area () {
		double sp = this.perimetro()/2;
		return Math.sqrt(sp *  (sp - ab.calcolaLunghezza()) 
				*  (sp - bc.calcolaLunghezza())
				*  (sp - ac.calcolaLunghezza()));
	}
	
	
	
}
