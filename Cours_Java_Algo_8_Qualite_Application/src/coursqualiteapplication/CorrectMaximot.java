package coursqualiteapplication;

import java.util.Random;


public class CorrectMaximot {
	
	// Variables globales
	public static Random random = new Random();

	public static void main(String[] args) {
		// Etape 1 : Construction du dictionnaire
		String[] dictionary = {"FRAISE","BANANE","ORANGE"};
		
		// Etape 2 : Détermination du mot aléatoire
		int randomIndex = random.nextInt(dictionary.length);
		String wordChoose = dictionary[randomIndex];
		
		// Etape 3 : Mixer le mot choisi aléatoirement
		String wordMixed = mixWord(wordChoose);
		
		// Etape 4 : Afficher le mot mélangé
		System.out.println(wordMixed);
	}

	public static String mixWord(String wordChoose) {
		// Transformation du String en char[]
		char[] wordCharArray = wordChoose.toCharArray();
		
		int lengthWordCharArray = wordCharArray.length;

		int p1;
		int p2;
		char temp;
		// For each loop interchange letter
				// Number of loop : (number of letters in the word) * 4 = number of loop 
				// Exemple: LOOP 1 : CUILLERE : [C]UIL[L]ERE --> LUILCERE
				//          LOOP 2 : LUILCERE : LUI[L]C[E]RE --> LUIECLRE
				//          LOOP 3 : LUIECLRE : LUIE[[C]]LRE --> LUIECLRE (Same Letter randomly selected) 
		for (int i = 0; i < lengthWordCharArray * 4; i++) {
			p1 = random.nextInt(lengthWordCharArray);
			p2 = random.nextInt(lengthWordCharArray);
			temp = wordCharArray[p1];
			wordCharArray[p1] = wordCharArray[p2];
			wordCharArray[p2] = temp;
		}

		return new String(wordCharArray);
	}
}
