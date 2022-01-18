package controller;

import model.Todo;

public class TodoCtrl {

	Todo[] coseDaFare;
	
	public TodoCtrl() {//new TodoCtrl()
		coseDaFare = new Todo[10];
	}
	
	public void addTodo(String descrizione, int pos) {
		Todo temp = new Todo(descrizione);
		coseDaFare[pos] = temp;
	}
	
	public Todo[] getCoseDaFare() {
		return coseDaFare;
	}
}
