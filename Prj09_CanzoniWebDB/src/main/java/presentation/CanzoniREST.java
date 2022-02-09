package presentation;

import java.io.BufferedReader;
import java.io.IOException;

import org.json.JSONArray;

import com.google.gson.Gson;

import controller.CanzoniCtrl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Canzone;

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
		
		//con json.org creiamo una collezione di canzoni in formato json
		JSONArray canzoni = new JSONArray(this.ctrl.getCanzoni());
		//modifichiamo il content-type della risposta per ritornare un formato json
		response.setContentType("application/json");//MIME Type json
		//scriviamo il json nel flusso della response
		response.getWriter().append(canzoni.toString());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//mi faccio ritornare un buffer con la string json passata nella request
		BufferedReader reader = request.getReader();
		//creo un oggeto Gson
		Gson gson = new Gson();
		//uso l'oggetto gson per parserizzare il json e trasformarlo in un oggetto di tipo Canzone
		Canzone c = gson.fromJson(reader, Canzone.class);
		//uso il controller per aggiungere la canzone al DB
		this.ctrl.addCanzone(c);
		//chiamo doGet per ritornare il json dell canzoni nel db
		doGet(request, response);
	}

}
