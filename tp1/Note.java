package tp1;

public class Note implements Statisticable, Comparable<Note>  {
	private String intitulé;
	private float valeur;
	public Note(float valeur, String intitulé) {
		super();
		this.intitulé = intitulé;
		this.valeur = valeur;
	}
	public String getIntitulé() {
		return intitulé;
	}
	public void setIntitulé(String intitulé) {
		this.intitulé = intitulé;
	}
	public float getValeur() {
		return valeur;
	}
	public void setValeur(float valeur) {
		this.valeur = valeur;
	}
	
	@Override
	public String toString() {
		return "Note [intitulé=" + intitulé + ", valeur=" + valeur + "]";
	}
	@Override
	public float getValue() {
		return valeur;
	}
	
	@Override
	public int compareTo(Note o) {
		 if (this.valeur < o.getValeur()) {
		        return -1;
		    } else if (this.valeur > o.getValeur()) {
		        return 1;
		    } else {
		        return 0;
		    }
	}
	
	 

}
