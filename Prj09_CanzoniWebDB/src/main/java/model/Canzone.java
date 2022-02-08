package model;

public class Canzone {

	private int id;
	private String titolo;
	private String cantante;
	private String genere;
	private String album;
	
	public Canzone() {}

	public Canzone(int id, String titolo, String cantante, String genere, String album) {
		this.id = id;
		this.titolo = titolo;
		this.cantante = cantante;
		this.genere = genere;
		this.album = album;
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

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	@Override
	public String toString() {
		return "Canzone [id=" + id + ", titolo=" + titolo + ", cantante=" + cantante + ", genere=" + genere + ", album="
				+ album + "]";
	}
	
	
	
}
