package fr.ibformation.algo.tests.exercice;

import java.util.Scanner;

public class LauncherExercice1 {

	public static void main(String[] args) {
		// Mon programme commence ici
		
		/*
		 * Ecrire un algorithme qui demande un nombre à l’utilisateur, et l’informe ensuite si ce nombre est positif, négatif ou nul
		 */
		
		// Etape 1 : Déclaration des variables
		int inputNumber;
		Scanner scanner = new Scanner(System.in);
		
		// Etape 2 : Saisie de l'utiisateur
		System.out.println("Saisir un entier :");
		inputNumber = scanner.nextInt();
		
		// Etape 3 : Vérifier les conditions
		if (inputNumber > 0) {
			System.out.println("Votre saisie est un nombre positif");
		} else if (inputNumber == 0) {
			System.out.println("Votre saisie est un nombre nul");
		} else {
			System.out.println("Votre saisie est un nombre négatif");
		}
		
		// Etape finale : Afficher l'info du nombre s'il est positif, négatif ou c'est null
		
		// Mon programme se termine ici
	}

}
