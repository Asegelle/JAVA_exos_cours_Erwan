package fr.ibformation.algo.tests.exercice;

import java.util.Scanner;

public class LauncherExercice1 {

	public static void main(String[] args) {
		// Mon programme commence ici
		
		/*
		 * Ecrire un algorithme qui demande un nombre � l�utilisateur, et l�informe ensuite si ce nombre est positif, n�gatif ou nul
		 */
		
		// Etape 1 : D�claration des variables
		int inputNumber;
		Scanner scanner = new Scanner(System.in);
		
		// Etape 2 : Saisie de l'utiisateur
		System.out.println("Saisir un entier :");
		inputNumber = scanner.nextInt();
		
		// Etape 3 : V�rifier les conditions
		if (inputNumber > 0) {
			System.out.println("Votre saisie est un nombre positif");
		} else if (inputNumber == 0) {
			System.out.println("Votre saisie est un nombre nul");
		} else {
			System.out.println("Votre saisie est un nombre n�gatif");
		}
		
		// Etape finale : Afficher l'info du nombre s'il est positif, n�gatif ou c'est null
		
		// Mon programme se termine ici
	}

}
