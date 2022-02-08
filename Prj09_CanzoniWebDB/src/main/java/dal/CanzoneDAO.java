package dal;

import java.sql.SQLException;
import java.util.List;

import model.Canzone;

public interface CanzoneDAO {

	String GET_ALL = "SELECT * FROM canzoni";
	
	//update: modificano il db e ritornano un intero (le righe interessate dalla richiesta)
	void addCanzone(Canzone c) throws SQLException;
	void updCanzone(Canzone c) throws SQLException;
	void delCanzone(int id) throws SQLException;
	
	//query: non modificano il db e ritornano un ResultSet
	Canzone getCanzone(int id) throws SQLException;
	List<Canzone> getCanzoni() throws SQLException;
	
	
	
}
