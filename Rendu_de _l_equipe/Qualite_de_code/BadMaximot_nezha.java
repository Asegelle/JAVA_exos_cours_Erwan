package fr.ibformation.exercice_correction_maximot;

import java.util.Random;

public class launcher {
	
	static Random r = new Random();        				//variable globale
	public static void main(String[] args) {
		String[] dictionary = {"FRAISE","BANANE","ORANGE"}; // on Déclare un tableau nomé dic de type string
							
		int randomIndexDictionary = r.nextInt(dictionary.length);   // on choisi aléatoirement un index dans le tableau entre 0 et 2 inclus
		String word = dictionary[randomIndexDictionary];			  // sélection du mot choisi aléatoirement	
		//System.out.println(word);				  	
		String mixLetters = mixer(word);                 // j'appel la fonction "mixer" qui va mixer les lettres du mot en question
		System.out.println(mixLetters);				// j'écris le résultat final mon word mixé ! 
		
	}

	public static String mixer(String word) {  // Déclaration de ma fonction "mixer"
						
		char[] letter = word.toCharArray();  // convertie le mot en un tableau de character 
		int letterNumber = letter.length;             // déclaration de la variable l en lui attribuant la valeur de la longeur du tableau de character word (ici tous les mot font 6 characteres) 
	
			for (int i = 0; i < letterNumber * 4; i++) {    // On rentre dans la boucle FOR pour un i = 0 à i = 23 donc dans chaques boucles on interchange deux lettres du mot sélectrionné aléatoirement)   
				int l1 = r.nextInt(letterNumber);          // j'attribu à p1 la veleur aléatoir r (0=<r=<5)
		        int l2 = r.nextInt(letterNumber);		   // j'attribu à p2 une autre veleur aléatoir r (0=<r=<5)
		        char temp = letter[l1];           // création d'une variable temporaire à la qu'elle on affecte l'enplacement p1 du charactere dans le tableau m
		         letter[l1] = letter[l2];				 // j'affecte à la position p1 la position p2 du charactere  
		         letter[l2] = temp;				// j'affecte à la position p2 dans le tableau m, la position stocké dans temp donc p1
			}
			
		return new String(letter);		
		
	}
	

}
