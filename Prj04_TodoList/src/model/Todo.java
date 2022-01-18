package model;

public class Todo {

	String descrizione;
	boolean completo;
	
	public Todo() {//new Todo()
		descrizione = "";
		completo = false;
	}
	
	public Todo(String desc) {//new Todo("java");
		descrizione = desc;
		completo = false;
	}
	
	public Todo(String desc, boolean fatto) {//new Todo("PHP", true);
		descrizione = desc;
		completo = fatto;
	}
	
	public void completa() {
		completo = true;
	}
	
	public String leggiTodo() {
		return "Desc: " + descrizione + " " + completo;
	}
}
