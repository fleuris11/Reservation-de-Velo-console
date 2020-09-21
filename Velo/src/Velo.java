import java.util.Scanner;

public class Velo {

	 public static void main(String[] args) {
	        Scanner clavier = new Scanner(System.in);
	        System.out.print("Donnez l'heure de début de la location (un entier) : ");
	        int debut = clavier.nextInt();
	        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
	        int fin = clavier.nextInt();
	        /*******************************************
	         * Completez le programme a partir d'ici.
	         *******************************************/
	        boolean test1 = debut>=0 & debut<=7 || debut>=17 & debut<=24;
	        boolean test2 = fin>=0 & fin<=7 || fin>=17 & fin<=24;
	       
	        
	        boolean test3 = debut>=7 & debut<=17;
	        boolean test4 =fin>=7 & fin<=17;
	        
	       
	    	int tempsEc =  fin - debut;
        	double montantPayer = tempsEc *1; 
	       
	        /*boolean test2 =fin>=17 & fin<=24;
	        boolean test1 = debut>=17 & debut<=24;*/
        	 if(debut == fin) {
	        	  System.out.println("Bizarre, vous n'avez pas louÃ© votre vÃ©lo bien longtemps !");
	        	  System.exit(0);
	        	  
	        	
	        }  if((debut<0 || debut>24) || (fin<0 || fin>24)) {
	        	 System.out.println("Les heures doivent Ãªtre comprises entre 0 et 24 !");
	        	 System.exit(0);
	        	 
	        }
	        if (debut>fin) {
      		 System.out.println("Bizarre, le dÃ©but de la location est aprÃ¨s la fin ...");
      		System.exit(0);
	        }
        	
	          if(test1 & test2) {
	        
	        	 System.out.println("Vous avez loué votre vélo pendant");
	 	        System.out.println(+tempsEc+"heure(s) au tarif horaire de 1.0 franc(s)");
	 	        System.out.println("Le montant total à payer est de "+montantPayer+ "franc(s).");
	 	       System.exit(0);
	 	       
	 	     
	        } if(test3&test4) {
	        	int tempsEc2 =  fin - debut;
	        	double montantPayer2 = tempsEc2 *2;
	        	System.out.println("Vous avez loué votre vélo pendant");
	 	        System.out.println(+tempsEc2+"heure(s) au tarif horaire de 2.0 franc(s)");
	 	        System.out.println("Le montant total à payer est de "+montantPayer2+ "franc(s).");
	 	       System.exit(0);
	 	       
	        }
	        
       	
	        else {
	        
	        	if(debut>=0 & debut<=7){
	        		int temp1=7-debut;
	        		
	        		System.out.println("Vous avez loué votre vélo pendant");
		        	System.out.println(temp1+"heure(s) au tarif horaire de 1.0 franc(s)") ;
		        	if(fin>=7 & fin<=17) {
		        		int temp2=fin-7;
		        		double montantTotal=(temp1*1) + (temp2*2);
			        	System.out.println(temp2+"heure(s) au tarif horaire de 2.0 franc(s)") ;
			        	System.out.println("Le montant total à payer est de "+montantTotal+"franc(s)."); 
		        	}
	        	} if (fin>=17 & fin<=24){
	        		int temp3=fin-17;
	        		int temp4=17-debut;
	        		double montantTotal2=(temp3*1)+(temp4*2);
	        		System.out.println("Vous avez loué votre vélo pendant");
		        	System.out.println(temp3+"heure(s) au tarif horaire de 1.0 franc(s)") ;
		        	if(debut>=7 & debut<=17) {
		        		System.out.println(temp4+"heure(s) au tarif horaire de 2.0 franc(s)") ;
			        	System.out.println("Le montant total à payer est de "+montantTotal2+"franc(s)."); 
		        	}
	        	}
		        	
	        	 
	        	
	        	
	        }
	        
	        

	        /*******************************************
	         * Ne rien modifier apres cette ligne.
	         *******************************************/
	         
	         clavier.close();
	 }
}
