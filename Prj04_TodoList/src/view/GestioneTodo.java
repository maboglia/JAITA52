package view;

import controller.TodoCtrl;
import model.Todo;

public class GestioneTodo {

	public static void main(String[] args) {
		
	
		TodoCtrl ctrl = new TodoCtrl();
		
		ctrl.addTodo("latte", 0);
		ctrl.addTodo("pane", 1);
		ctrl.addTodo("biscotti", 2);
		ctrl.addTodo("caffè", 3);
		ctrl.addTodo("the");
		ctrl.addTodo("limoni");
		ctrl.addTodo("pesche");
		ctrl.addTodo("pomodori");
		ctrl.addTodo("banane");
		ctrl.addTodo("sapone");
		ctrl.addTodo("pasta");
		
		ctrl.completaTodo(2);
		
		for (Todo cosa : ctrl.getCoseDaFare()) {
			if (cosa != null) {
				System.out.println(cosa.leggiTodo());
			}
		}

	}

}
