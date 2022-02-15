package com.maboglia.canzoni.model;

public class Canzone {

	private int id;
	private String titolo;
	
	public Canzone() {
		// TODO Auto-generated constructor stub
	}

	public Canzone(int id, String titolo) {
		super();
		this.id = id;
		this.titolo = titolo;
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

	@Override
	public String toString() {
		return "Canzone [id=" + id + ", titolo=" + titolo + "]";
	}
	
	
	
	
}
