package view;

import model.FiguraGeometrica;
import model.Punto;
import model.Quadrato;
import model.Rettangolo;
import model.Segmento;
import model.Triangolo;

public class GeometriaDemo {

	public static void main(String[] args) {
		
				
		Punto a = new Punto(4, 3);
		Punto b = new Punto(4, 6);
		Punto c = new Punto(8, 6);
		
		Segmento ab = new Segmento(a, b);
		Segmento bc = new Segmento(b, c);
		Segmento ac = new Segmento(a, c);
		
		Triangolo t = new Triangolo(a, b, c);
		
		Rettangolo r = new Rettangolo(ab, ab);
		
		Quadrato q = new Quadrato(ab);
		
		Rettangolo rq = new Quadrato(ab);
		
		FiguraGeometrica[] stanze = new FiguraGeometrica[5];
		
		stanze[0] = new Rettangolo(ab, ac);
		stanze[1] = new Quadrato(ab);
		stanze[2] = new Triangolo(a,b,c);
		stanze[3] = new Rettangolo(bc, ac);
		stanze[4] = new Quadrato(ac);
		
		double superficie = 0;
		
		for (FiguraGeometrica fg : stanze) {
			superficie += fg.area();
		}

		System.out.println("la superficie complessiva è: " + superficie);
		
	}

}
