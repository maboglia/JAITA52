package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import model.Canzone;

public class CanzoneDAOImpl implements CanzoneDAO {

	private Connection conn = null;
	private Statement stat = null;
	private ResultSet rs = null;
	
	private Connessione db = new Connessione();
	
	
	
	@Override
	public void addCanzone(Canzone c) throws SQLException {
		this.conn = db.connetti();
		this.stat = this.conn.createStatement();
		
		String query = "INSERT INTO canzoni (titolo, cantante, genere, album) values( "
				
				+ "'" + c.getTitolo() + "', "
				+ "'" + c.getCantante() + "', "
				+ "'" + c.getGenere() + "', "
				+ "'" + c.getAlbum() + "')";
				
		this.stat.executeUpdate(query);
		System.out.println("Hai aggiunto la canzone " + c);

	}

	@Override
	public void updCanzone(Canzone c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delCanzone(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Canzone getCanzone(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Canzone> getCanzoni() {
		// TODO Auto-generated method stub
		return null;
	}

}
