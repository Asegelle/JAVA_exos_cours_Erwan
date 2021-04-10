package fr.ibformations.badmaximot;

import java.util.Random;

public class BadMaximot_Brieuc {
	
	 public static Random random = new Random();
	 public static final int factor = 4;

	public static void main(String[] args) {
		// Déclarer et définir un tableau de mots
		String[] words = {"FRAISE","BANANE","ORANGE"};
		
		// Choisir un des mots de la table au hasard
		
		int randomIndex = random.nextInt(words.length);
		String word = words[randomIndex];
		
		// Le mot est mélangé
		String mixedWord = mix(word);
		
		// Afficher le mot mélangé
		System.out.println(mixedWord);
	}
	
	// Mélanger le mot choisi
	public static String mix(String word) {
		// Transformer la chaine de caractères 'word'(mot) en tableau de caractères
		char[] charWord = word.toCharArray();
		
		/* Boucle qui permet d'échanger deux lettres aléatoires du tableau de caractères
		4 x n fois (n étant le nombre de caractères du mot) */
		for (int i = 0; i < charWord.length * factor; i++) {
			int letter1 = random.nextInt(charWord.length);
			int letter2 = random.nextInt(charWord.length);
		    char temp = charWord[letter1];
			charWord[letter1] = charWord[letter2];
			charWord[letter2] = temp;
		}
		
	    // Affiche un tableau de caractères des lettres mélangées du mot initial	
	    return new String(charWord);
	}

}
