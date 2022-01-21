package model;

public class Contatto {

	//contatore static: appartiene alla classe
	private static int counter = 1;
	
	private int id;
	private String nome;
	private String numero;
	
	
	public Contatto(String nome, String numero) {
		this.id = Contatto.counter++;
		this.nome = nome;
		this.numero = numero;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return id + ") " + nome + " - " + numero;
	}
	
	
	
	
	
}
