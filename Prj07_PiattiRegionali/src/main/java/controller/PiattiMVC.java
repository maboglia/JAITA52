package controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Piatto;

@WebServlet("/piatti")
public class PiattiMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private PiattiCtrl ctrl;
    
    public PiattiMVC() {
    	this.ctrl = new PiattiCtrl();
    	System.out.println("Ho creato la servlet e inizializzato il controller dei piatti");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StringBuilder sb = new StringBuilder();
		
		List<Piatto> piatti = this.ctrl.getPiatti();
		
		for (Piatto piatto : piatti) {
			sb.append(piatto);
		}
		
		//risposta del server
		response.getWriter().append(sb.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("nomePiatto")!=null && request.getParameter("nomeRegione")!=null) {
			String nome = request.getParameter("nomePiatto");
			String regione = request.getParameter("nomeRegione");
			
			this.ctrl.addPiatto(nome, regione);
			
		}
		
		
		
		doGet(request, response);
	}

}
