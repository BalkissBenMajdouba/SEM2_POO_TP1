package exercice2;

import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
		  Annuaire an = new Annuaire();
	      String cmd;
	    an.ajout("AA1", "2222", "Nabeul");
	    an.affiche();
	  Fiche Farechercher =  an.Recherchce("AA2");
	    if(Farechercher!= null) {
	    	System.out.println("existe");
	    }
	    else 
	    	System.out.println("n existe pas !");
	  
	  
  	do {
  	Scanner s = new Scanner(System.in);
  	System.out.println("donner une commande ");
  	cmd=s.nextLine();
  	switch (cmd.charAt(0)) {
  	case '+':
  		String adr, numero;
  		
      	System.out.println("donner une adresse");
      	 adr=s.nextLine();
      	 
       	System.out.println("donner le num ");
       	 numero=s.nextLine();
       	 an.ajout(cmd.substring(1), numero, adr);
       	 break;
  	 case '?':
         String r=cmd.substring(1);
         Fiche f=an.Recherchce(r);
         if(f != null) {
      	   System.out.println("trouvee"+f);
         }
         else {
      	   System.out.println("non trouvee"+f);
         }
  		break;
  	 case '!':
           an.affiche();
           break;

       case '.':
           
           System.out.println("Au revoir !");
           break;

       
  		
  	}
  	
  	}while (! cmd.equals("bye"));
  	
  }
}

		
		

