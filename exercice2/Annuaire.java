package exercice2;
import java.util.HashMap;

import java.util.Map;

public class Annuaire {
	
	private Map<String,Fiche> T;
	
	Annuaire(){
		this.T=new HashMap<>();
	}
	 public void ajout(String nom, String num, String adr) {
		 T.put(nom, new Fiche(nom,adr,num));
	 }
	 public void affiche() {
		 T.values().forEach(System.out::println);
	 }
	 public Fiche Recherchce(String nom) {
		return T.get(nom);
	 }
	
}
