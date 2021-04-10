package fr.ibformation.algo.boucles.exo;

import java.util.Scanner;

public class LauncherExercice1 {

	public static void main(String[] args) {
		// Mon programme commence ici
		
		/*
		 * Ecrire un algorithme qui demande un nombre de départ et qui écrit la table de multiplication de ce nombre.
			Il faut que ce soit présenté comme suit (cas ou l'utilisateur entre le nombre 7) : 
			
			Table de 7 :
			7 x 1 = 7
			7 x 2 = 14
			7 x 3 = 21
			…
			7 x 10 = 70
		 */
		
		// Déclaration des variables
		int inputNumber;
		Scanner scannerInputNumber = new Scanner(System.in);

		// Saisie de la valeur
		System.out.println("Saisir un entier");
		inputNumber = scannerInputNumber.nextInt();
		
		System.out.println("Saisir un entier : " + inputNumber);
		
		// On rentre dans la boucle FOR
		System.out.println("Table de multiplication pour " + inputNumber);
		for (int i = 1; i <= 10; i++) {
			// On affiche la table de multiplication à chaque itération
			int tempResult = inputNumber * i;
			System.out.println("" + inputNumber + " x " + i + " = " + tempResult);
			
			// Action d'incrémentation (i++ dans la boucle for)
		}
		
		// Mon programme se termine ici
	}

}
