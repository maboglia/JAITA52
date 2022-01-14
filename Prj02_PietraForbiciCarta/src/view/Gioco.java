package view;

import java.util.Scanner;

public class Gioco {
	
	
	public static void main(String[] args) {
		
		String sceltaUtente = menu();
		String sceltaPC = sceltaPC();
		String risultato = valutazione(sceltaUtente, sceltaPC);
		
		
		System.out.println(sceltaUtente);
		System.out.println(sceltaPC);
		System.out.println("Il risultato è: " + risultato);
	}

	private static String valutazione(String sceltaUtente, String sceltaPC) {

		String res = null;
		
		if (sceltaUtente.equals(sceltaPC)) {
			res = "pareggio";
		} else {
			if (sceltaUtente.equals("p")) {
				if (sceltaPC.equals("f")) {
					res = "vince umano";
				} else {
					res = "vince PC";
				}
			}//fine if
			else 
			if (sceltaUtente.equals("f")) {
				if (sceltaPC.equals("c")) {
					res = "vince umano";
				} else {
					res = "vince PC";
				}
			}//fine if
			else 
			if (sceltaUtente.equals("c")) {
				if (sceltaPC.equals("p")) {
					res = "vince umano";
				} else {
					res = "vince PC";
				}
			}//fine if
			
		}
		
		return res;
	}

	private static String sceltaPC() {

		String risposta = null;

		double casuale = Math.random();
		
		if(casuale < 0.3333) {
			risposta = "p";
		} else if (casuale < 0.6666) {
			risposta = "f";
		} else {
			risposta = "c";
		}
		
		return risposta;
	}

	private static String menu() {
		System.out.println("Scegli tra pietra, forbici, carta");
		System.out.println("p: pietra");
		System.out.println("f: forbici");
		System.out.println("c: carta");
		
		Scanner sc = new Scanner(System.in);
		
		String sceltaUtente = sc.next();
		return sceltaUtente;
	}





}
