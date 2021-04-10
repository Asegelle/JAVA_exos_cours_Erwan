package fr.ibformation.exojavase;

import java.util.Random;

public class BadMaximot {
	
	public static Random r = new Random();
	public static void main(String[] args) {
		
		int randomIndex;
		String randomWord;
		String[] arrayWords = { "FRAISE", "BANANE", "ORANGE" }; 
		randomIndex = r.nextInt(arrayWords.length);
		randomWord = arrayWords[randomIndex]; 
		
		mixingLetters(randomWord); 
		
	}
	
	public static void mixingLetters(String word) {
		
		char[] wordInArray = word.toCharArray();
		int lenghWord = wordInArray.length;
		char temp;
		int p1, p2;
		
		for (int i = 0; i < lenghWord ; i++) {
			p1 = r.nextInt(lenghWord);
			p2 = r.nextInt(lenghWord);
			temp = wordInArray[p1];
			wordInArray[p1] = wordInArray[p2];
			wordInArray[p2] = temp;
		}
		
		System.out.println( new String( wordInArray ));
	}
	
}





