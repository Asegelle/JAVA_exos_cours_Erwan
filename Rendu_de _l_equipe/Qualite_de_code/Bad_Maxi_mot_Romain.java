package fr.ibcegos.qualite;

import java.util.Random;

public class BadMaximot {
	
	
	public static Random r = new Random(); 

	public static void main(String[] args) {

		// d�claration des variables
		
		String[] dick = {"FRAISE","BANANE","ORANGE"};	// d�claration d'un tableau
				
		int randomIndex = r.nextInt(dick.length);// random sur une valeur sur la longueur du tableau (0 � la taille du tableau)
				
		String mot = dick[randomIndex];// sort la valeur du tableau qui a pour index randomIndex
		
		/* appel de la fonction mixer + affectation du retour de la fonction dans une variable
		(pour s'en resservir si n�cessaire) */
		String mixed = mixer(mot);
				 
		System.out.println(mixed); // retour console

	}

	// Fonction pour mixer le mot (
	
	public static String mixer(String mot) {
		
		
		
		char[] randomWord = mot.toCharArray();// d�claration d'un tableau char(1 lettre) pour r�duire les mot � un caract�re par case de tableau      0 = o ! 1 = r ! 2 = a ! 3 = n !  4 = g ! 5 = e
		
		
		int lengthWord = randomWord.length;// d�claration d'un int "l" = longueur du mot par rapport au tableau qui divise le mot en case d'une lettre       int l = 6 * 4
		
		String resultat;

		/* for ( int "i" d�clarer � 0; 									0
		 * 
		 * tant que "i" est inf�rieur � la longueur "l" du mot choisi 	6*4 = 24
		 * pour que la boucle augmente de 1 en 1
		*/
		
		
		for (int i = 0; i < lengthWord * 4; i++) {     // 
			
			int p1 = r.nextInt(lengthWord); // s�lection d'une lettre random dans le mot choisie random aussi     					int p1 =   2
			
			int p2 = r.nextInt(lengthWord); // s�lection d'une lettre random dans le mot choisie random aussi   						 int p2  = 4
			
			char temp = randomWord[p1]; 	// d�claration de la premi�re lettre random dans un temp             						char temp = m[p1] = m[2] = a
			randomWord[p1] = randomWord[p2]; 		// d�claration de la deuxi�me lettre random dans la premi�re lettre random  				 a = g
			randomWord[p2] = temp;} 		// d�claration de la la lettre temp  dans la deuxi�me lettre random    						 g = a
		
		resultat = new String(randomWord);  // change le tableau char en String (lettres toutes li�es)
		
			// retour de fonction qui rend comme r�sultat le nouveau 
		return resultat; 																								
		
	}

}
