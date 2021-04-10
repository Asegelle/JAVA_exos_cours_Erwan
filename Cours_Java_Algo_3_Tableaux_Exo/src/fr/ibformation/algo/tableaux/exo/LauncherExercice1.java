package fr.ibformation.algo.tableaux.exo;

public class LauncherExercice1 {

	public static void main(String[] args) {
		// Mon programme commence ici
		
		/*
		 * Ecrire un algorithme qui déclare et remplisse un tableau contenant les six voyelles de l’alphabet latin
		 */
		
		// Déclaration des variables
		char[] vowels = new char[6];
		
		// Affectation des voyelles
		vowels[0] = 'a';
		vowels[1] = 'e';
		vowels[2] = 'i';
		vowels[3] = 'o';
		vowels[4] = 'u';
		vowels[5] = 'y';
		
		// Affichage des lettres
		System.out.println(vowels);
		System.out.println("voyelles : " + vowels);
		System.out.println("voyelles : " + vowels[0] + vowels[1] + vowels[2] + vowels[3] + vowels[4] + vowels[5]);
		
		// Mon programme se termine ici

	}

}
