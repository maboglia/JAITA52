package model;

public class ContattoLavoro extends Contatto {

	private String azienda;
	
	public ContattoLavoro(String nome, String numero, String azienda) {
		super(nome, numero);

		this.azienda = azienda;
	
	}

	public String getAzienda() {
		return azienda;
	}

	public void setAzienda(String azienda) {
		this.azienda = azienda;
	}

	@Override
	public String toString() {
		
		String s = super.toString() + "("+ azienda +")";
		
		return s;
	}
	
	
	

}
