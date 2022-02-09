package presentation;

import java.io.IOException;

import org.json.JSONArray;

import controller.CanzoniCtrl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CanzoniMVC
 */
@WebServlet("/api/canzoni")
public class CanzoniREST extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CanzoniCtrl ctrl;
    /**
     * Default constructor. 
     */
    public CanzoniREST() {
    	this.ctrl = new CanzoniCtrl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//request.setAttribute("listaCanzoni", this.ctrl.getCanzoni());
		
		JSONArray canzoni = new JSONArray(this.ctrl.getCanzoni());
		
		response.setContentType("application/json");//MIME Type json
		
		response.getWriter().append(canzoni.toString());
		
		//request.getRequestDispatcher("lista.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("titolo")!=null) {
			
			String titolo = request.getParameter("titolo");
			String genere = request.getParameter("genere");
			String album = request.getParameter("album");
			String cantante = request.getParameter("cantante");
			
			this.ctrl.addCanzone(titolo, cantante, genere, album);
			
			System.out.println("sono la servlet, ho aggiunto la canzone");
			
			
		}

		
		
		doGet(request, response);
	}

}
