package fr.ibformations.mysterynumber;

import java.util.Scanner;

public class MysteryNumberBrieuc {
	
	public static final int maxRound = 7;
	public static final int minLimit = 1;
	public static final int maxLimit = 100;

	public static void main(String[] args) {
		
		//Déclaration des variables et initialisation du compteur
		int guessNumber;
		int count = 0;
	
		// Définition du nombre mystère
		final int mysteryNumber = (int)(Math.random() * 100 + 1);
		
		// Règles du jeu
		System.out.println("Le but du jeu est d'essayer de trouver un nombre mystère compris entre 1 et 100 en 7 coups maximum." + "\n");
		
		// Définition scanner
		Scanner scanValues = new Scanner(System.in);
		
		// Boucle où l'utilisateur essaie de deviner le nombre mystère
		do {
			// Demande de saisie et incrémentation du compteur
			System.out.println("Essayer de deviner le nombre entier mystère compris entre 1 et 100 :");
			guessNumber = scanValues.nextInt();
			count++;
			// Afficher l'indication si le nombre d'essais est inférieur à 7
			if (count < maxRound) {
			    clue (guessNumber, mysteryNumber);  
			} else {
				break;
			}
		} while (guessNumber != mysteryNumber);
		
		// Fermeture du scanner
		scanValues.close();

		// Affichage du résultat
		finalResult (guessNumber, mysteryNumber, count);
	}
	
	// Affiche l'indication par rapport au nombre à trouver
	public static void clue (int guess, int goal) {
		if (guess < minLimit || guess > maxLimit) {
		    System.out.println("Votre nombre est incorrect, il doit être compris entre 1 et 100 !");
	    } else if (guess < goal) {
		    System.out.println("Plus grand");
	    } else if (guess > goal) {
		    System.out.println("Plus petit");
	    }
	}
	
	// Affichage du résultat
	public static void finalResult (int guess, int goal, int count) {
	    if (guess == goal) {
	        System.out.println("C'est le bon !" + " Vous avez mis " + count + " coups.");
	    } else {
		     System.out.println("Perdu !");
	    }
	}
}



