package fr.ibformations.badmaximot;

import java.util.Random;

public class BadMaximot {

	public static void main(String[] args) {
		// D�clarer et d�finir un tableau de mots
		String[] words = {"FRAISE","BANANE","ORANGE"};
		// Choisir un des mots de la table au hasard
		Random r = new Random();
		int randomIndex = r.nextInt(words.length);
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
		4 x n fois (n �tant le nombre de caract�res du mot */
		Random ran = new Random();
		for (int i = 0; i < charWord.length * 4; i++) {
			int letter1 = ran.nextInt(charWord.length);
			int letter2 = ran.nextInt(charWord.length);
		    char temp = charWord[letter1];
			charWord[letter1] = charWord[letter2];
			charWord[letter2] = temp;
		}
	    // Affiche un tableau de caract�res des lettres m�lang�es du mot initial	
	    return new String(charWord);
	}

}
