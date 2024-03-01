package exercice2;

public class Fiche {
	String nom;
	String adr;
	String num;
	public Fiche(String nom, String adr, String num) {
		super();
		this.nom = nom;
		this.adr = adr;
		this.num = num;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdr() {
		return adr;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Fiche [nom=" + nom + ", adr=" + adr + ", num=" + num + "]";
	}
	
}
