package fr.ibformation.algo.variables.exercice;

import java.util.Scanner;

public class LauncherExercice2 {

	public static void main(String[] args) {
		// Mon programme commence ici
		
		/*
		 * Faire un algorithme permettant de d�terminer si une personne peut �tre �lecteur
		 */
		
		// D�claration des variables
		boolean francais, capaciteJuridiqueCivique, inscrit;
		int age;
		Scanner scanner = new Scanner(System.in);
		
		// Saisie si la personne est fran�aise ?
		System.out.println("Etes-vous fran�ais (true/false)?");
		francais = scanner.nextBoolean();
		
		// Saisie si la personne est fran�aise ?
		System.out.println("Quel est votre �ge ? ");
		age = scanner.nextInt();
		
		// Saisie si la personne est fran�aise ?
		System.out.println("Avez-vous la capacit� juridique et civique (true/false)? ");
		capaciteJuridiqueCivique = scanner.nextBoolean();
		
		// Saisie si la personne est fran�aise ?
		System.out.println("Etes-vous inscrit sur les listes �lectorales (true/false)?");
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
