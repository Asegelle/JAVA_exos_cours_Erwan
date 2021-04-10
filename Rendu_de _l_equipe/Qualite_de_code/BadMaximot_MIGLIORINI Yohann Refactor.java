/*
 * Jeu du mot à retrouver
 * 
 * Ordre :
 * 1- Le programme permet de choisir un mot issus d'un tableau aleatoirement
 * 2- Le mot choisi aleatoirement est restructure de façon aleatoire avec les mêmes lettres
 * 3- Le programme affiche le mot pour que l'utilisateur essaie de deviner de quel mot il s'aggissait
 * 
 */

package coursqualiteapplication;

import java.util.Random;

public class BadMaximot {
	
	////////
	/*MAIN*/
	////////	
	public static void main(String[] args) {
		
		//Creation d'un tableau contenant des mots
		String[] dictionaryWord = {"FRAISE","BANANE","ORANGE"};
		
		//Recuperation d'un mot aleatoire à partir du tableau precedemment cree
		String randomWord = randomChoiceWordTab(dictionaryWord);
		
		//Transformation du mot aleatoire pour le rendre incomprehensible et affichage
		String mix = mixer(randomWord);
		System.out.println(mix);
	}
	
	///////////////////////////////////////////////////////////
	/*Fonction pour choisir un mot aleatoirement d'un tableau*/
	///////////////////////////////////////////////////////////
	public static String randomChoiceWordTab(String[] dictionaryWord) {
		
		//Creation d'un nombre aleatoire
		Random random = new Random();
		
		//Utilisation du nombre aletoire pour recuperer aleatoirement un index de notre tableau
		int randomIndex = random.nextInt(dictionaryWord.length);
		
		//Recuperation d'un mot issus du tableau avec notre index precedement genere aleatoirement
		String word = dictionaryWord[randomIndex];
		return word;
		
	}
	
	//////////////////////////////////////////////////////////
	/*Fonction pour melanger les lettres d'un mot et retour///
	//transforme en chaine*/                                //
	//////////////////////////////////////////////////////////
	public static String mixer(String mot){
		
		//Creation d'un nombre aleatoire
		Random random = new Random();
		
		//Creation du tableau contenant les lettres du mot et transformation en char avec une fonction
		char[] charTab = mot.toCharArray();
		
		//Recuperation de la taille du tableau dans une variable
		final int lengthTabChar = charTab.length;
		
		
		//Boucle parcourant le tableau de char precedemment cree
		for (int i = 0; i < lengthTabChar; i++){
			
			//Creation de deux index aleatoires entre le min et le max de la capacite du tableau
			int firstLetter = random.nextInt(lengthTabChar);
			int secondLetter = random.nextInt(lengthTabChar);
			
			//Creation d'une variable temporaire pour effectuer une permutation entre 2 lettres
			char tempLetter = charTab[firstLetter];
			
			//La seconde lettre se retrouve sur la 1re 
			charTab[firstLetter] = charTab[secondLetter];
			
			//La 1ere lettre se retrouve à la place de la seconde
			charTab[secondLetter] = tempLetter;
			
		}
		
		//Retour de notre tableau sous forme de string correspondant à notre mot melanger aleatoirement
		return new String(charTab);
	}
	
}
