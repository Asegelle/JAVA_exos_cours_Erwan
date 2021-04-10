package fr.ibformation.nombremystere;

import java.util.Random;
import java.util.Scanner;

public class LauncherMysteryNumber {

	/*
	 * MysteryNumber :
	 * Le système choisit un nombre aléatoire entre 1 et 100 
	 * (il est possible de le fixer dans un premier temps). 
	 * Le joueur doit trouver le nombre mystère en 7 coups maximum ! 
	 * A chaque tentative, le système indique si le nombre mystère 
	 * est plus grand ou plus petit. A la fin du jeu, le système 
	 * indique le nombre de coup en cas de victoire, ou un message 
	 * de défaite le cas échéant 
	 */
	
	public static void main(String[] args) {
		// Déclaration des variables
		int inputUser;
		int mysteryNumber;
		int countTry = 0;
		
		final int MAX_INTERVAL = 100;
		final int MAX_TRIES = 7;
		
		Scanner scanner = new Scanner(System.in);
		
		// Génération aléatoire d'un nombre de 0 à 100
		mysteryNumber = generateMysteryNumber(MAX_INTERVAL);
		
		// Affichage de règles 
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
						" et est plus grand que le nombre mystère");
			} else if (inputUser < mysteryNumber) {
				System.out.println("Le nombre saisi est " + inputUser + 
						" et est plus petit que le nombre mystère");
			} else if (inputUser == mysteryNumber) {
				System.out.println("C'est le bon nombre ! Bravo vous avez gagné !");
			} else {
				System.err.println("Erreur de saisie");
			}
			
			System.out.println("Nombre d'essais restants : " + (MAX_TRIES - countTry));
			
		} while(inputUser != mysteryNumber && countTry < MAX_TRIES);
		
		if (inputUser != mysteryNumber) {
			System.err.println("Vous avez perdu !");
		} else {
			System.out.println("Le jeu est terminé avec " + countTry + " essais");
		}
		
		// Afficher la victoire ou la défaite
		
	}
	
	public static void gameRules() {
		System.out.println("Bienvenue sur le jeu du nombre mystère !");
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
