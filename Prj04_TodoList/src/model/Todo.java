package model;

public class Todo {

	String descrizione;
	boolean completo;
	
	public Todo(String desc) {
		descrizione = desc;
		completo = false;
	}
	
	public void completa() {
		completo = true;
	}
	
	public String leggiTodo() {
		return "Desc: " + descrizione + " " + completo;
	}
}
