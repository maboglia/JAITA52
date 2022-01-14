package view;

import model.Todo;

public class GestioneTodo {

	public static void main(String[] args) {
		
		Todo t1 = new Todo("Studiare Java");
		Todo t2 = new Todo("Studiare PHP");
		Todo t3 = new Todo("Studiare Javascript");
		Todo t4 = new Todo("Studiare Python");
		
		
		System.out.println(t2.leggiTodo());
		t2.completa();
		System.out.println(t2.leggiTodo());
		

	}

}
