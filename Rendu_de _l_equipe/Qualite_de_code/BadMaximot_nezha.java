package fr.ibformation.exercice_correction_maximot;

import java.util.Random;

public class launcher {
	
	static Random r = new Random();        				//variable globale
	public static void main(String[] args) {
		String[] dictionary = {"FRAISE","BANANE","ORANGE"}; // on D�clare un tableau nom� dic de type string
							
		int randomIndexDictionary = r.nextInt(dictionary.length);   // on choisi al�atoirement un index dans le tableau entre 0 et 2 inclus
		String word = dictionary[randomIndexDictionary];			  // s�lection du mot choisi al�atoirement	
		//System.out.println(word);				  	
		String mixLetters = mixer(word);                 // j'appel la fonction "mixer" qui va mixer les lettres du mot en question
		System.out.println(mixLetters);				// j'�cris le r�sultat final mon word mix� ! 
		
	}

	public static String mixer(String word) {  // D�claration de ma fonction "mixer"
						
		char[] letter = word.toCharArray();  // convertie le mot en un tableau de character 
		int letterNumber = letter.length;             // d�claration de la variable l en lui attribuant la valeur de la longeur du tableau de character word (ici tous les mot font 6 characteres) 
	
			for (int i = 0; i < letterNumber * 4; i++) {    // On rentre dans la boucle FOR pour un i = 0 � i = 23 donc dans chaques boucles on interchange deux lettres du mot s�lectrionn� al�atoirement)   
				int l1 = r.nextInt(letterNumber);          // j'attribu � p1 la veleur al�atoir r (0=<r=<5)
		        int l2 = r.nextInt(letterNumber);		   // j'attribu � p2 une autre veleur al�atoir r (0=<r=<5)
		        char temp = letter[l1];           // cr�ation d'une variable temporaire � la qu'elle on affecte l'enplacement p1 du charactere dans le tableau m
		         letter[l1] = letter[l2];				 // j'affecte � la position p1 la position p2 du charactere  
		         letter[l2] = temp;				// j'affecte � la position p2 dans le tableau m, la position stock� dans temp donc p1
			}
			
		return new String(letter);		
		
	}
	

}
