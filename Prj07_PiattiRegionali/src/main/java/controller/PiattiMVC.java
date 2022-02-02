package controller;

import java.io.IOException;
import java.util.ArrayList;
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
		
		if (request.getParameter("regione") != null) {
			
			List<Piatto> piatti = new ArrayList<>();//contenitore VUOTO
			
			for (Piatto p : this.ctrl.getPiatti()) {
				if (p.getRegione().equals(request.getParameter("regione")))
					piatti.add(p);
			}
			request.setAttribute("elencoPiatti", piatti);
			
			
		} else {
			//aggiungo alla request l'attributo di nome elencoPiatti e con valore List<Piatto>
			request.setAttribute("elencoPiatti", this.ctrl.getPiatti());
		}
		
		
		
		
		//chiamo la pagina jsp e le passo la richiesta con il nuovo attributo appena inserito
		request.getRequestDispatcher("elenco.jsp").forward(request, response);
		
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
