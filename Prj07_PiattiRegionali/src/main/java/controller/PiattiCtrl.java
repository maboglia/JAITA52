package controller;

import java.util.ArrayList;
import java.util.List;

import model.Piatto;

public class PiattiCtrl {

	private List<Piatto> piatti;
	
	public PiattiCtrl() {
		this.piatti = new ArrayList<>();
	}
	
	public void addPiatto(String nome, String regione) {
		
		Piatto p = new Piatto(nome, regione);
		this.piatti.add(p);
		
	}
	
	public List<Piatto> getPiatti(){
		return this.piatti;
	}
	
	public List<Piatto> getPiattiByRegione(String regione){
		
		List<Piatto> piattiRegione = new ArrayList<Piatto>();
		
		for(Piatto p : this.piatti) {
			if (p.getRegione().equals(regione))
				piattiRegione.add(p);
		}
		
		return piattiRegione;
		
	}
	
}
