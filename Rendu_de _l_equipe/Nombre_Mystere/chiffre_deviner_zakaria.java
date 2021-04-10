package fr.ibinformation.firstprojet;

import java.util.Scanner;  // Import the Scanner class

public class chiffre_deviner_zakaria{
	
   private final static int max = 100;//max et constant variable public
   
   public static void main(String[] args) {
     
	   
	   
	   int nombre = (int)(Math.random() * max) + 1; // nombre randome a deviner il est aleatoire pour une fois 
      
      System.out.println("le nombre a deviner entre 0 et " + max);
     
      int proposition, nbPropositions = 0;
      do {    	                    
    	  Scanner sca = new Scanner(System.in);
    	  System.out.println("Veuillez saisir un nombre :");
    	  int str = sca.nextInt();// lire le chiffre saisie
  	  
    	  if(str> max) //verification de numero depasse le max ou negatif
         	 System.out.println("Ton numero et Plus grand que le maximum !");
    	  if(str< 0)
          	 System.out.println("Ton numero  et negatif  !");
     //comparer si grand ou petite si non else correct
    	  proposition = str;//Console.readInt()
         nbPropositions++;// compteur combien de coup
         if(proposition > nombre)
        	 System.out.println(" choisir un numero plus petite");
         
         else if(proposition < nombre)
        	 System.out.println(" choisir un numero plus grand!");
      } while(proposition != nombre);
      System.out.println("Trouvé en " + nbPropositions + " coups");
   }
}
