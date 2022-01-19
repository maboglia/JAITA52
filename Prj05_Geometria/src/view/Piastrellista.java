package view;

import java.util.Scanner;

import model.FiguraGeometrica;
import model.Quadrato;
import model.Rettangolo;
import model.Segmento;
import model.Triangolo;

public class Piastrellista {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quante stanze ha l'appartamento?");
		
		int nStanze = sc.nextInt();
		sc.nextLine();
		
		FiguraGeometrica[] stanze = new FiguraGeometrica[nStanze];
		
		for (int i = 0; i < stanze.length; i++) {
			
			System.out.println("Che forma ha la stanza (t, q, r)" + i + "?");
			String formaStanza = sc.next();
			sc.nextLine();
			
			if (formaStanza.equals("t")) {
				System.out.println("Dimensione lato 1 in cm.");
				int lato1 = sc.nextInt();
				sc.nextLine();
								
				System.out.println("Dimensione lato 2 in cm.");
				int lato2 = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Dimensione lato 3 in cm.");
				int lato3 = sc.nextInt();
				sc.nextLine();
				
				Triangolo t = new Triangolo(new Segmento(lato1), new Segmento(lato2), new Segmento(lato3));
				stanze[i] = t;
				
			} else 
				if (formaStanza.equals("q")) {
					System.out.println("Dimensione lato in cm.");
					int lato = sc.nextInt();
					sc.nextLine();
					Quadrato q = new Quadrato(new Segmento(lato));
					stanze[i] = q;
					
				} else	
					if (formaStanza.equals("r")) {
						System.out.println("Dimensione lato lungo in cm.");
						int latoLungo = sc.nextInt();
						sc.nextLine();
						
						System.out.println("Dimensione lato corto in cm.");
						int latoCorto = sc.nextInt();
						sc.nextLine();
						Rettangolo r = new Rettangolo(new Segmento(latoLungo), new Segmento(latoCorto));
						stanze[i] = r;
					} 
			
		}
		
		double totale = 0;
		
		for (FiguraGeometrica fg : stanze) {
			System.out.println(fg);
			totale += fg.area();
		}

		System.out.println("La superficie totale è: " + totale);
		
	}

}
