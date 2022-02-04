package model;

public class Libro {

	private static int counter = 1;
	
	private int id;
	private String titolo;
	private double prezzo;
	
	public Libro() {
		this.id = counter++;
	}
	
	public Libro(String titolo, double prezzo) {
		this.id = counter++;
		this.titolo = titolo;
		this.prezzo = prezzo;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "{\"titolo\":\"" + titolo + "\"}";
	}
	
	//POJO plain old java object
	//JavaBean
	
	
	
	
	
}
