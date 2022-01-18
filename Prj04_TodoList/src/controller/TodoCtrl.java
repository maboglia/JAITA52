package controller;

import model.Todo;

public class TodoCtrl {

	Todo[] coseDaFare;
	
	public TodoCtrl() {//new TodoCtrl()
		coseDaFare = new Todo[10];
	}
	
	public void addTodo(String descrizione) {
		Todo temp = new Todo(descrizione);
		int pos = 
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
