package tp1;

import java.util.ArrayList;
import java.util.Collections;

public class Stats  {
   ArrayList<Etudiant> ListEE;
	
	public Stats() {
		this.ListEE=new ArrayList<Etudiant> ();
	}
	
	public void addEtud(Etudiant e) {
		this.ListEE.add(e);
	}
	public static Note meilleurNote(Etudiant e) {
		return e.maxNote();
	}
	public static Float Moyenne(Etudiant e) {
		return e.getValue(); 
		
	}
	public static Note MoinsNote(Etudiant e) {
		return e.minNote();
	}
	
	
	public static Etudiant meilleurEtudiant(ArrayList<Etudiant> e) {
		return Collections.max(e);
	}
	public static Etudiant mauvaisEtudiant(ArrayList<Etudiant> e) {
		return Collections.min(e);
	}
	public static Float MoyenneGroup(ArrayList<Etudiant> e) {
		float s=0;
		for (Etudiant a:e) {
			s+=a.getValue();
		}
		return s/e.size();
	}
	
	public void TriMat(ArrayList<Etudiant> e) {
		Collections.sort(e , new MatriculeTri());
	}
	
	
	
	public void TriNom(ArrayList<Etudiant> e) {
		Collections.sort(e , new NomTri());
	}
	
	public static void main(String args[]) {
		
		Etudiant e1= new Etudiant("AAAA1","Balkiss");
		Etudiant e2= new Etudiant("BBBB2","Amal");
		
		
		Note n1 = new Note(17,"JAVA");
		Note n2 = new Note(15,"UML");
		Note n3 = new Note(16,"BDD");
		
		e1.addNote(n1);
		e1.addNote(n2);
		e1.addNote(n3);
		
		Note n11 = new Note(12,"JAVA");
		Note n22 = new Note(11,"UML");
		Note n33 = new Note(10,"BDD");
		
		e2.addNote(n11);
		e2.addNote(n22);
		e2.addNote(n33);
		
		Stats s= new Stats();
		 System.out.println("Mauvaises notes: ");
		    System.out.println(s.MoinsNote(e2));
		    System.out.println(s.MoinsNote(e1));
		    System.out.println();

		    System.out.println("Meilleurs notes: ");
		    System.out.println(s.meilleurNote(e2));
		    System.out.println(s.meilleurNote(e1));
		    System.out.println();

		    System.out.println("Moyenne du groupe: ");
		    System.out.println(s.MoyenneGroup(s.ListEE));
		    System.out.println();
		
		s.addEtud(e2);
		s.addEtud(e1);
		
		
	}


}
