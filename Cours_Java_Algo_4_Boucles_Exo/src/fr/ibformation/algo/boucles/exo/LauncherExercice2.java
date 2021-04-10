package fr.ibformation.algo.boucles.exo;

import java.util.Scanner;

public class LauncherExercice2 {
	
	public static void main(String[] args) {
		// Mon programme commence ici
		
		/*
		 * Exercice 2 : Ecrire un algorithme permettant de faire 
		 * trouver le maximum et le minimum d’un tableau de nombre entier
		 */
		
		// Déclaration des variables
		int[] numbers = new int[6];
		numbers[0] = 2;
		numbers[1] = 5;
		numbers[2] = 9;
		numbers[3] = 1;
		numbers[4] = 8;
		numbers[5] = 42;
		
		// MAXIMUM
		// int max = numbers[0];
		int max = Integer.MIN_VALUE;

		
		// On rentre dans la boucle FOR
		for (int i = 0; i < numbers.length; i++) {
//			System.out.println("index :" + i);
//			System.out.println("Valeur du tableau à l'index : " + i + " : " + numbers[i]);
//			System.out.println("numbers[" + i + "] : " + numbers[i]);
			
			if (numbers[i] > max) {
				max = numbers[i];
			}
			
			// A la fin de la boucle on réalise l'incrémentation de "i"
		}
		
		// Afficher le max du tableau
		System.out.println("Maximum :" + max);
		
		// MINIMUM
		// int min = numbers[0];
		int min = Integer.MAX_VALUE;
		
		// On rentre dans la boucle FOR
		for (int i = 0; i < numbers.length; i++) {
//			System.out.println("index :" + i);
//			System.out.println("Valeur du tableau à l'index : " + i + " : " + numbers[i]);
//			System.out.println("numbers[" + i + "] : " + numbers[i]);
			
			if (numbers[i] < min) {
				min = numbers[i];
			}
			
			// A la fin de la boucle on réalise l'incrémentation de "i"
		}
		
		// Afficher le max du tableau
		System.out.println("Minimum :" + min);
		
		
		// Mon programme se termine ici

	}

}
