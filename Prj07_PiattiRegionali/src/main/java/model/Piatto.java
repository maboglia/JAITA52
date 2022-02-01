package model;

import java.util.ArrayList;
import java.util.List;

public class Piatto {

	private String nome;
	private String regione;
	private List<String> ingredienti;
	
	private String foto;
	private String ricetta;
	
	public Piatto(String nome, String regione) {
		this.nome = nome;
		this.regione = regione;
		
		this.ingredienti = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	public List<String> getIngredienti() {
		return ingredienti;
	}

	public void setIngredienti(List<String> ingredienti) {
		this.ingredienti = ingredienti;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getRicetta() {
		return ricetta;
	}

	public void setRicetta(String ricetta) {
		this.ricetta = ricetta;
	}

	@Override
	public String toString() {
		return "Piatto [nome=" + nome + ", regione=" + regione + ", ingredienti=" + ingredienti + ", foto=" + foto
				+ ", ricetta=" + ricetta + "]";
	}
	
	
	
	
}
