package presentation;

import java.io.IOException;

import dal.LibroDAO;
import dal.LibroIDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/libri")
public class LibriMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private LibroIDAO repo;
	
    /**
     * Default constructor. 
     */
    public LibriMVC() {
    	repo = new LibroDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		response.getWriter().append(repo.getAll().toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("titolo")!=null) {
			
			String titolo = request.getParameter("titolo");
			
			repo.addLibro(titolo, 1+ Math.random() * 10);
			
			
		}
		
		
		doGet(request, response);
	}

}
