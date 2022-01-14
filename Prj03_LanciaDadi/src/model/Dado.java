package model;

public class Dado {

	int facce = 6;
	
	public int lancia() {
		//1,2,3,4,5,6
		//int 32bit
		//double 64bit            //3.5478, 5.487921
		int casuale = (int)(Math.random() * facce) + 1  ;
		return casuale;
	}
	
}
