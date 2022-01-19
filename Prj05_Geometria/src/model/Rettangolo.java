package model;


public class Rettangolo {

	private Segmento base, altezza;

	public Rettangolo(Segmento base, Segmento altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	public double perimetro() {
		return 2* (base.calcolaLunghezza() + altezza.calcolaLunghezza());
	}
	
	public double area() {
		return base.calcolaLunghezza() * altezza.calcolaLunghezza();
	}
	
	
}


