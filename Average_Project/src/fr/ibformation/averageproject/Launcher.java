package fr.ibformation.averageproject;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		// Mon programme d�marre ici
		System.out.println("Mon programme d�marre ici !");
		
		// D�claration des variables
		int value1 = 4;
		int value2 = 9;
		double average;
		
		// Calcul
		average = (double)(value1 + value2) / 2;
		
		// Affichage du r�sultat
		System.out.println("Moyenne :" + average);
		
		// Saisie utilisateur
		System.out.println("Saisir un entier");
		Scanner scanEntier = new Scanner(System.in);
		int inputNumber = scanEntier.nextInt();
		System.out.println("saisie" + inputNumber);
		
		System.out.println("Mon programme se termine ici !");
		// Mon programme se termine ici
	}

}
