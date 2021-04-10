package fr.ibformation.algo.variables.exercice;

import java.util.Scanner;

public class LauncherExercice3 {

	public static void main(String[] args) {
		/*
			Exercice 3 : Ecrire un algorithme permettant la saisie de deux entiers et en afficher :
			•	La somme 
			•	Le produit
		*/
		// Etape 1 : Déclarer la variable qui va stocker le nombre 1
		int valueNumber1;

	    // Etape 2 : Déclarer la variable qui va stocker le nombre 2
		int valueNumber2;

	    // Etape 3 : Déclarer la variable qui va stocker la somme
		int sum;

	    // Etape 4 : Déclarer la variable qui va stocker le produit
		int multiplication;
		
		Scanner scanner = new Scanner(System.in);

	    // Etape 5 : Demander la saisie du nombre 1 à l'utilisateur
		System.out.println("Saisir le nombre 1 (Entier) :");
		valueNumber1 = scanner.nextInt();

	    // Etape 6 : Demander la saisie du nombre 2 à l'utilisateur
		System.out.println("Saisir le nombre 2 (Entier) :");
		valueNumber2 = scanner.nextInt();

	    // Etape 7 : Calcul de la somme
		sum = valueNumber1 + valueNumber2;
		System.out.println("Somme des valeurs saisies : " + sum);
	    
	    // Etape 8 : Calcul du produit
		multiplication = valueNumber1 * valueNumber2;
		System.out.println("Produit des valeurs saisies : " + multiplication);

	    // Etape finale : Afficher la somme et le produit
		scanner.close();
	}

}
