package fr.ibformation.algo.tests.exercice;

import java.util.Scanner;

public class LauncherExercice2 {

	public static void main(String[] args) {
		// Mon programme commence ici
		
		/*
		 * Faire un algorithme permettant de déterminer si une personne peut être électeur
		 */
		// Etape 1 : Déclaration des variables
		int age;
		boolean isFrench, isOnCapacity, isOnList;
		
		Scanner scanner = new Scanner(System.in);
		
		// Etape 2 : Saisies utilisateur
		// age
		System.out.println("Quel est votre âge ?  (entier) :");
		age = scanner.nextInt();
		
		// isFrench
		System.out.println("Etes-vous français (true/false) :");
		isFrench = scanner.nextBoolean();
		
		// isOnCapacity
		System.out.println("Avez-vous la capacité juridique et civique (true/false) :");
		isOnCapacity = scanner.nextBoolean();
		
		// isOnList
		System.out.println("Etes-vous inscrit sur les listes électorales (true/false) :");
		isOnList = scanner.nextBoolean();
		
		// Etape 3 : Vérifier la condition
		if (age >= 18 && isOnCapacity == true && isFrench == true && isOnList == true) {
			// Etape finale : Afficher à l'utilisateur s'il peut voter ou non
			System.out.println("Vous pouvez voter !");
		} else {
			// Etape finale : Afficher à l'utilisateur s'il peut voter ou non
			System.out.println("Vous ne pouvez pas voter !");
		}
		
		// Mon programme se termine ici

	}

}
