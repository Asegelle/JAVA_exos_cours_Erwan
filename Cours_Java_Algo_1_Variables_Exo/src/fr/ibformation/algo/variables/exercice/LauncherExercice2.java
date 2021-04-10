package fr.ibformation.algo.variables.exercice;

import java.util.Scanner;

public class LauncherExercice2 {

	public static void main(String[] args) {
		// Mon programme commence ici
		
		/*
		 * Faire un algorithme permettant de déterminer si une personne peut être électeur
		 */
		
		// Déclaration des variables
		boolean francais, capaciteJuridiqueCivique, inscrit;
		int age;
		Scanner scanner = new Scanner(System.in);
		
		// Saisie si la personne est française ?
		System.out.println("Etes-vous français (true/false)?");
		francais = scanner.nextBoolean();
		
		// Saisie si la personne est française ?
		System.out.println("Quel est votre âge ? ");
		age = scanner.nextInt();
		
		// Saisie si la personne est française ?
		System.out.println("Avez-vous la capacité juridique et civique (true/false)? ");
		capaciteJuridiqueCivique = scanner.nextBoolean();
		
		// Saisie si la personne est française ?
		System.out.println("Etes-vous inscrit sur les listes électorales (true/false)?");
		inscrit = scanner.nextBoolean();
		
		// Mise en place des tests
		if (age >= 18 && francais == true && capaciteJuridiqueCivique == true && inscrit == true) {
			System.out.println("Vous pouvez voter ! ");
		} else {
			System.out.println("Vous ne pouvez pas voter ! ");
		}
		// Mon programme se termine ici

	}

}
