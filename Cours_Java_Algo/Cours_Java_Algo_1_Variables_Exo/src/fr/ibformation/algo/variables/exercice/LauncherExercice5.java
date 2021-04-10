package fr.ibformation.algo.variables.exercice;

import java.util.Scanner;

public class LauncherExercice5 {

	public static void main(String[] args) {
		// Exercice 5 : Ecrire un algorithme permettant de calculer l’aire d’un cercle (Aire = π x r²)
		

		// Etape 1 : Déclarations
		double r, area; 
		
		Scanner scanner = new Scanner(System.in);
		
		// Etape 2 : Saisir 
		System.out.println("Saisir le rayon (en mètre)");
		r = scanner.nextDouble();
		
		// Etape 3 : Calcul
		area = Math.PI * r * r; // PI * r²
		
		// Etape 4 : Calcul
		System.out.println("L'aire est de : " + area + " m²");
		
		// Puissance
		System.out.println(Math.pow(12.5d, 3d));
		
		

	}

}
