package controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dal.CanzoneDAO;
import dal.CanzoneDAOImpl;
import model.Canzone;

public class CanzoniCtrl {

	private Map<Integer, Canzone> canzoni = new HashMap<>();
	
	private CanzoneDAO repo = new CanzoneDAOImpl();
	
	public void addCanzone(String titolo, String cantante, String genere, String album) {
		
		Canzone c = new Canzone(0, titolo, cantante, genere, album);
		try {
			this.repo.addCanzone(c);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public List<Canzone> getCanzoni(){
		try {
			return this.repo.getCanzoni();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void addCanzone(Canzone c) {
		try {
			this.repo.addCanzone(c);
			System.out.println("Aggiunta la canzone; " + c);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
