package fr.ibformation.algo.variables.exercice;

import java.util.Scanner;

public class LauncherExercice4 {

	public static void main(String[] args) {
		// Exercice 4 : Ecrire un algorithme  permettant le calcul de la surface d�une pi�ce
		
		// Etape 1 : D�clarations
		double length, width, surface;
		
		Scanner scanner = new Scanner(System.in);
		
		// Etape 2 : Saisir 
		System.out.println("Saisir la longueur (en m�tre)");
		length = scanner.nextDouble();
		
		System.out.println("Saisir la largeur (en m�tre)");
		width = scanner.nextDouble();
		
		// Etape 3 : Calcul
		surface = length * width;
		
		// Etape 4 : Calcul
		System.out.println("La surface est de : " + surface + " m�");
		

	}

}
