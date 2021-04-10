package fr.ibformation.algo.variables.exercice;

import java.util.Scanner;

public class LauncherExercice1 {

	public static void main(String[] args) {
		// Mon programme commence ici
		
		/*
		 * Ecrire un algorithme qui demande un nombre � l�utilisateur, et l�informe ensuite si ce nombre est positif, n�gatif ou nul
		 */
		
		
		// D�claration des variables
		int nombre;
		
		// Saisie du entier
		System.out.println("Saisir un entier :");
		Scanner scannerEntier = new Scanner(System.in);
		nombre = scannerEntier.nextInt();
		
		// Mise en place des tests
		if (nombre > 0) {
			System.out.println("Le nombre est positif");
		} else if (nombre < 0) {
			System.out.println("Le nombre est n�gatif");
		} else {
			System.out.println("Le nombre est nul");
		}
		
		// Mon programme se termine ici
	}

}
