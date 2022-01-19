package model;

public class Quadrato extends Rettangolo {

	private Segmento lato;
	
	public Quadrato(Segmento lato) {
		super(lato, lato);
		this.lato = lato;
	}

	@Override
	public double area() {
		System.out.println("ho applicato la formula del quadrato");
		return Math.pow(lato.calcolaLunghezza(), 2);
	}

	
	
}
