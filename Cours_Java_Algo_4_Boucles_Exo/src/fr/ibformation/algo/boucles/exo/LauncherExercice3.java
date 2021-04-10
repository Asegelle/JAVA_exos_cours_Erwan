package fr.ibformation.algo.boucles.exo;

import java.util.Scanner;

public class LauncherExercice3 {

	public static void main(String[] args) {
		// Mon programme commence ici
		
		/*
		 * Exercice 3 : Ecrire un algorithme permettant de faire trouver,
		 * à un utilisateur, un chiffre entre 0 et 9. 
			Le chiffre à trouver est déterminé par le programme
			C’est donc à l’utilisateur de deviner le chiffre
			
			L'algorithme pourra répondre par :
			- Plus petit
			- Plus grand
			- C'est le bon
			
			L’algorithme ne se termine pas tant que le bon chiffre n’a pas été trouvé
			Vérifier si le nombre saisie n’est pas erroné

		 */
		
		// Déclaration des variables
		int mysteryNumber, inputNumberUser;
		Scanner scannerInputNumberUser = new Scanner(System.in);
		
		// Affectation des variables
		mysteryNumber = 4;
		
		// On rentre dans la boucle DO/WHILE
		do {
			// Saisie de la valeur (à l'intérieur du while sinon, on a une boucle infini)
			System.out.println("Saisir un chiffre de 0 à 9 (entier) :");
			inputNumberUser = scannerInputNumberUser.nextInt();
			
			System.out.println(inputNumberUser); 
			
			// Vérification de la saisie
			if (inputNumberUser < 0 || inputNumberUser > 9) {
				System.err.println("Erreur de saisie");
			} else if (inputNumberUser > mysteryNumber) {
				System.out.println("Plus grand !");
			} else if (inputNumberUser < mysteryNumber) {
				System.out.println("Plus petit !");
			} else if (inputNumberUser == mysteryNumber) {
				System.out.println("C'est le bon ! Winner !");
			} else {
				System.err.println("Erreur de saisie");
			}
		} while (inputNumberUser != mysteryNumber);
		
		scannerInputNumberUser.close();
		
		// Mon programme se termine ici

	}

}
