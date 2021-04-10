package fr.ibformation.variable;

import java.util.Random;

public class CodeEnVrac {
			
			//main
			public static void main(String[] args) {
				
				String[] fruit = {"FRAISE","BANANE","ORANGE"};			//separer l'affectation des déclarations.
				Random randomNum = new Random();
				int randomIndex = randomNum.nextInt(fruit.length);		// separer declaration/traitement int randomIndex; randomIndex = randomNum.nextInt(fruit.length);
				String mot = fruit[randomIndex];						// separer declaration/traitement
				String mix = mixer(mot);								// separer declaration/traitement
				
				System.out.println(mix);
			}
			
			//fonction
			public static String mixer(String mot) {
				
				Random rand = new Random();
				char[] tab = mot.toCharArray();							// separer declaration/traitement
				int tabLength = tab.length;										   
				
				
				for (int i = 0; i < tabLength * 4; i++) {      			// * 4 ??????? PK?
					int numRand1 = rand.nextInt(tabLength);				// separer declaration/traitement
					int numRand2 = rand.nextInt(tabLength);				// separer declaration/traitement	
					char temp = tab[numRand1];							// separer declaration/traitement
					
					tab[numRand1] = tab[numRand2];
					tab[numRand2] = temp;
				}	
					return new String(tab);					   // creer une variable String res = new String(tab); et return res 
				}

}
