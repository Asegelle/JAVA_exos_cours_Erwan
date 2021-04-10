package fr.ibformation.variables;

import java.util.Scanner;

public class LauncherDemoManipVariables {

	public static void main(String[] args) {
		
		int valueInt; // Declaration
		valueInt = 42; // Affectation
		
		// Contatenation
		
		String fullName = "Erwan BACCON"; // Déclaration et affectation sur une seule ligne
		String role = "Developper";
		int age = 30;
		
		String description = fullName + " est " + role;
		System.out.println(description);
		
		String fullDescription = fullName + " est " + role + " et a " + age + " ans";
		System.out.println(fullDescription);
		
		
		// Write
		// sysout
		System.out.println("Voici un message d'information pour l'utilisateur");
		
		// Read
		System.out.println("Saisir un entier");
		Scanner scanner = new Scanner(System.in); // Déclaration et Affectation
		int inputInt = scanner.nextInt(); // Demande saisie utilisateur d'un entier
		System.out.println("Saisie utilisateur : " + inputInt);
		
		System.out.println("Saisir un String");
		Scanner scannerString = new Scanner(System.in); // Déclaration et Affectation
		String inputString = scanner.next(); // Demande saisie utilisateur d'un entier
		System.out.println("Saisie utilisateur : " + inputString);
	}

}
