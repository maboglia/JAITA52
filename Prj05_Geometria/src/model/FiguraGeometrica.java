package model;

public abstract class FiguraGeometrica {//NON SI PUO' ISTANZIARE

	protected String nome;
	protected String nomeForma;
	
	public abstract double area();
	
	public abstract void prova();

	@Override
	public String toString() {
		return "La stanza di nome " + nome + ", di forma " + nomeForma + " ha una superficie di " + area();
	}

	
	
}
