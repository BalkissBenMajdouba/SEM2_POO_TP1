package tp1;

import java.util.ArrayList;
import java.util.Collections;

public class Etudiant implements Statisticable,Comparable<Etudiant> {
	private String matricule;
	private String nom;
	private ArrayList<Note> noteE;
	public Etudiant(String matricule, String nom) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.noteE = new ArrayList<Note>(); 
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<Note> getNoteE() {
		return noteE;
	}
	public void setNoteE(ArrayList<Note> noteE) {
		this.noteE = noteE;
	}
	
	
	   @Override
	public String toString() {
		return "Etudiant [matricule=" + matricule + ", nom=" + nom + "]";
	}
	public void addNote(Note n) {
	        this.noteE.add(n);
	    }
	@Override
	public int compareTo(Etudiant e1) {
		float a=this.getValue();
		float b= e1.getValue();
		  if (a < b) {
		        return -1;
		    } else if (a > b) {
		        return 1;
		    } else {
		        return 0;
		    }
	}
	@Override
	public float getValue() {
		 float sum = 0;
		    for (Note note : noteE) {
		        sum += note.getValeur(); }
		        return sum / (float)noteE.size();
		
	}
	public Note maxNote() {
		return Collections.max(this.noteE);
	}
	
	public Note minNote() {
		return Collections.min(this.noteE);
	}

}
