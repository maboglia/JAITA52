package dal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Libro;

public class LibroDAO implements LibroIDAO {

	private Map<Integer, Libro> libri;
	
	public LibroDAO() {
		this.libri = new HashMap<>();
	}

	@Override
	public void addLibro(String titolo, double prezzo) {
		Libro l = new Libro(titolo, prezzo);
		this.libri.put(l.getId(), l);
		
	}

	@Override
	public List<Libro> getAll() {
		Collection<Libro> collezioneLibri = this.libri.values();
		return new ArrayList<Libro>(collezioneLibri);
	}

	@Override
	public Libro getLibroById(int id) {
		return this.libri.get(id);
	}

	@Override
	public void updLibro(Libro l) {
		Libro libro = this.libri.get(l.getId());
		libro = l;
	}

	@Override
	public void delLibro(int id) {
		this.libri.remove(id);
		
	}
	
	//CRUD sulla tabella libri
	
	
	
	
}
