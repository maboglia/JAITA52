package model;

public class Canzone {

	private int id;
	private String titolo;
	private String cantante;
	
	public Canzone() {
		// TODO Auto-generated constructor stub
	}

	public Canzone(int id, String titolo, String cantante) {
		this.id = id;
		this.titolo = titolo;
		this.cantante = cantante;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getCantante() {
		return cantante;
	}

	public void setCantante(String cantante) {
		this.cantante = cantante;
	}

	@Override
	public String toString() {
		return "Canzone [id=" + id + ", titolo=" + titolo + ", cantante=" + cantante + "]";
	}
	
	
	
	
}
