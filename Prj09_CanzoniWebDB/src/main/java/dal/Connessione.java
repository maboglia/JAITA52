package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private final String DB_URL = "jdbc:mysql://localhost:3306/Its2020";
	private final String USER = "Its2020";
	private final String PASS = "Its2020";
	
	private Connection conn = null;
	
	public Connection connetti() {
		
		if (this.conn == null) {
			try {
				this.conn = DriverManager.getConnection(DB_URL, USER, PASS);
				
				System.out.println("Siamo connessi :)");
				
			} catch (SQLException e) {
				System.err.println("Errore di connessione");
				System.err.println(e.getMessage());
//				e.printStackTrace();
			}
		}
		
		return conn;
	}
	
	
	public static void main(String[] args) {
		Connessione c = new Connessione();
		c.connetti();
	}
	
}
