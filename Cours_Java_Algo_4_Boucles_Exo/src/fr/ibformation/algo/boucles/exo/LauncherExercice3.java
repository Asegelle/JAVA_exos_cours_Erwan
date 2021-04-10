package fr.ibformation.algo.boucles.exo;

import java.util.Scanner;

public class LauncherExercice3 {

	public static void main(String[] args) {
		// Mon programme commence ici
		
		/*
		 * Exercice 3 : Ecrire un algorithme permettant de faire trouver,
		 * � un utilisateur, un chiffre entre 0 et 9. 
			Le chiffre � trouver est d�termin� par le programme
			C�est donc � l�utilisateur de deviner le chiffre
			
			L'algorithme pourra r�pondre par :
			- Plus petit
			- Plus grand
			- C'est le bon
			
			L�algorithme ne se termine pas tant que le bon chiffre n�a pas �t� trouv�
			V�rifier si le nombre saisie n�est pas erron�

		 */
		
		// D�claration des variables
		int mysteryNumber, inputNumberUser;
		Scanner scannerInputNumberUser = new Scanner(System.in);
		
		// Affectation des variables
		mysteryNumber = 4;
		
		// On rentre dans la boucle DO/WHILE
		do {
			// Saisie de la valeur (� l'int�rieur du while sinon, on a une boucle infini)
			System.out.println("Saisir un chiffre de 0 � 9 (entier) :");
			inputNumberUser = scannerInputNumberUser.nextInt();
			
			System.out.println(inputNumberUser); 
			
			// V�rification de la saisie
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
