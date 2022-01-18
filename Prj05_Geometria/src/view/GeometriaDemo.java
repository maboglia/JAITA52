package view;

import model.Punto;
import model.Segmento;
import model.Triangolo;

public class GeometriaDemo {

	public static void main(String[] args) {
		
		Punto a = new Punto(11, 9);
		Punto b = new Punto(11, 13);
		Punto c = new Punto(15, 14);
		
		Segmento ab = new Segmento(a, b);
		Segmento bc = new Segmento(b, c);
		Segmento ac = new Segmento(a, c);
		
		Triangolo t = new Triangolo(a, b, c);
		
		System.out.println(t.perimetro());//12
		System.out.println(t.area());//6.0
		

	}

}
