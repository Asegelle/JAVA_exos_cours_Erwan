package fr.ibformation.nombremystere;

import java.util.Random;
import java.util.Scanner;

public class LauncherMysteryNumber {

	/*
	 * MysteryNumber :
	 * Le syst�me choisit un nombre al�atoire entre 1 et 100 
	 * (il est possible de le fixer dans un premier temps). 
	 * Le joueur doit trouver le nombre myst�re en 7 coups maximum ! 
	 * A chaque tentative, le syst�me indique si le nombre myst�re 
	 * est plus grand ou plus petit. A la fin du jeu, le syst�me 
	 * indique le nombre de coup en cas de victoire, ou un message 
	 * de d�faite le cas �ch�ant 
	 */
	
	public static void main(String[] args) {
		// D�claration des variables
		int inputUser;
		int mysteryNumber;
		int countTry = 0;
		
		final int MAX_INTERVAL = 100;
		final int MAX_TRIES = 7;
		
		Scanner scanner = new Scanner(System.in);
		
		// G�n�ration al�atoire d'un nombre de 0 � 100
		mysteryNumber = generateMysteryNumber(MAX_INTERVAL);
		
		// Affichage de r�gles 
		gameRules();
		
		do {
			// Saisie de l'utilisateur
			System.out.println("Saisir un entier entre 0 et 100");
			inputUser = scanner.nextInt();
			
			countTry++;
			
			// Comparaison de la saisie de l'utilisateur
			if (inputUser < 0 || inputUser > 100) {
				System.err.println("Saisir entre 0 et 100");
				countTry--; // On ne comptabilise pas les mauvaises saisies pour le compteur du nombre de coup
			} else if (inputUser > mysteryNumber) {
				System.out.println("Le nombre saisi est " + inputUser + 
						" et est plus grand que le nombre myst�re");
			} else if (inputUser < mysteryNumber) {
				System.out.println("Le nombre saisi est " + inputUser + 
						" et est plus petit que le nombre myst�re");
			} else if (inputUser == mysteryNumber) {
				System.out.println("C'est le bon nombre ! Bravo vous avez gagn� !");
			} else {
				System.err.println("Erreur de saisie");
			}
			
			System.out.println("Nombre d'essais restants : " + (MAX_TRIES - countTry));
			
		} while(inputUser != mysteryNumber && countTry < MAX_TRIES);
		
		if (inputUser != mysteryNumber) {
			System.err.println("Vous avez perdu !");
		} else {
			System.out.println("Le jeu est termin� avec " + countTry + " essais");
		}
		
		// Afficher la victoire ou la d�faite
		
	}
	
	public static void gameRules() {
		System.out.println("Bienvenue sur le jeu du nombre myst�re !");
		System.out.println("Vous devez trouver un nombre entre 0 et"
				+ " 100 en moins de 7 coups !");
		System.out.println("Enjoy :)");
		System.out.println();
	}
	
	public static int generateMysteryNumber(final int MAX_INTERVAL) {
		Random random = new Random();
		int mysteryNumber = random.nextInt(MAX_INTERVAL + 1);
		System.out.println(mysteryNumber);
		
		return mysteryNumber;
	}

}
