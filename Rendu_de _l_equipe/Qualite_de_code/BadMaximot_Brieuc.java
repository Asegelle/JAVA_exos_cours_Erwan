package fr.ibformations.badmaximot;

import java.util.Random;

public class BadMaximot_Brieuc {
	
	 public static Random random = new Random();
	 public static final int factor = 4;

	public static void main(String[] args) {
		// D�clarer et d�finir un tableau de mots
		String[] words = {"FRAISE","BANANE","ORANGE"};
		
		// Choisir un des mots de la table au hasard
		
		int randomIndex = random.nextInt(words.length);
		String word = words[randomIndex];
		
		// Le mot est m�lang�
		String mixedWord = mix(word);
		
		// Afficher le mot m�lang�
		System.out.println(mixedWord);
	}
	
	// M�langer le mot choisi
	public static String mix(String word) {
		// Transformer la chaine de caract�res 'word'(mot) en tableau de caract�res
		char[] charWord = word.toCharArray();
		
		/* Boucle qui permet d'�changer deux lettres al�atoires du tableau de caract�res
		4 x n fois (n �tant le nombre de caract�res du mot) */
		for (int i = 0; i < charWord.length * factor; i++) {
			int letter1 = random.nextInt(charWord.length);
			int letter2 = random.nextInt(charWord.length);
		    char temp = charWord[letter1];
			charWord[letter1] = charWord[letter2];
			charWord[letter2] = temp;
		}
		
	    // Affiche un tableau de caract�res des lettres m�lang�es du mot initial	
	    return new String(charWord);
	}

}
