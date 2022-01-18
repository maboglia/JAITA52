package controller;

import model.Todo;

public class TodoCtrl {

	Todo[] coseDaFare;
	
	public TodoCtrl() {//new TodoCtrl()
		coseDaFare = new Todo[10];
	}
	
	public void addTodo(String descrizione) {
		int pos = trovaPosizioneLibera();

		if (pos > -1) {
			Todo temp = new Todo(descrizione);
			coseDaFare[pos] = temp;
		} else {
			System.out.println("contenitore pieno!!!!");
		}

	}
	
	private int trovaPosizioneLibera() {
		
		int pos = -1;
		
		for (int i = 0; i < coseDaFare.length; i++) {
			if (coseDaFare[i] == null) {
				return i;
			}
		}
		
		return pos;
	}

	public void addTodo(String descrizione, int pos) {
		Todo temp = new Todo(descrizione);
		coseDaFare[pos] = temp;
	}
	
	public Todo[] getCoseDaFare() {
		return coseDaFare;
	}

	public void completaTodo(int i) {
		
		
		if (i>= 0 && i <  coseDaFare.length) {
			if (coseDaFare[i] != null )
				coseDaFare[i].completa(); 
			
		}
		
		
	}
}
