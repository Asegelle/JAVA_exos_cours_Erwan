package fr.ibformation.chifoumi;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Launcher_Anthony {
	
	public static Scanner scanner = new Scanner(System.in);
	public static boolean isPlaying = true;
	
	public static void main(String[] args) {
			System.out.println("Bienvenue dans la console de jeu : ");
			init();	
	}
	
/* -------------------------------------------------------------------------------------------------
 * ------------------------ INITIALISATION/MENU ----------------------------------------------------	
-------------------------------------------------------------------------------------------------*/

	public static void init() {	
		
		System.out.println("Veuillez entrer votre sélection : \n"
				+ "1/ Le nombre mystère \n"
				+ "2/ Shi-Fou-mi \n"
				+ "3/ Mastermind \n"
				+ "4/ Quitter ");
		
		//L'utilisateur choisi un jeu en entrant une valeur 
		int gameChoice = scanner.nextInt();
		
		//Permet de choisir entre les différents jeux
		if (gameChoice !=1 || 
			gameChoice !=2 ||
			gameChoice !=3 ||
			gameChoice !=4) {
			switch (gameChoice) {
				case 1:	
					nombreMystere();
					break;
				case 2:
					shiFouMi();
					break;
				case 3:
					mastermind();
					break;
				//Permet la fermeture de l'application
				case 4:
					System.out.println("Au revoir");
					System.exit(0);
					break;
			}
		}
		else {
			System.err.println("Veuillez rentrer un bon chiffre");
			init();
		}
	}
	
/* -------------------------------------------------------------------------------------------------
 * ------------------------ NOMBRE MYSTERE ---------------------------------------------------------	
---------------------------------------------------------------------------------------------------*/
		
		
	public static void nombreMystere() {
		System.out.println("Bienvenue dans le nombre Mystère, "
				+ "vous avez le droit à 7 tentatives pour trouver le bon nombre");
			
			//Déclaration des variables
			int i;
			
			//La boucle permet ici de relancer le jeu si l'utilisateur veut rejouer
			do {
				int aiChoice = (int)(Math.random() * 101);
				System.out.println(aiChoice);
				for (i = 0;i<7;i++) {
					
					//Entrée utilisateur 
					System.out.println("Veuillez entrer un nombre entre 0 et 100"); 
					int playerChoice = scanner.nextInt();
						
						//Retourne un message plus petit, plus grand, ou égal selon l'entrée utilisateur
						if (playerChoice < aiChoice) {
							System.out.println("Le nombre mystère est plus grand ");
								if (i==6) {
									System.out.println("Perdu");
								}
						}
						else if (playerChoice> aiChoice) {
							System.out.println("Le nombre mystère est plus petit ");
							if (i==6) {
								System.out.println("Perdu");
							}
						}
						else {
							System.out.println("Félicitation! Vous avez trouvé le bon nombre");
							i = 7;
						}
					}
				isPlaying = replay();	
				i = 0;	
				}
			while (isPlaying == true);
			
		//Message qui apparaît lors de la fermeture du jeu
		System.out.println("A bientôt");
		}
	
	
/* -------------------------------------------------------------------------------------------------
 * ------------------------ SHI-FOU-MI -------------------------------------------------------------	
 -------------------------------------------------------------------------------------------------*/	

	public static void shiFouMi() {
		
		// Declaration des variables
		final String stone = "pierre";
		final String paper = "feuille";
		final String scissors = "ciseaux";
		int aiChoice;
		int playerChoice;
		int i = 0;
		int j = 0;
		
		// Initiation du choix du joueurs et du jeu
		System.out.println("SHI-FOU-MI ");
		
		do {
			
			//Test sur l'entrée utilisateur
			try {
				do {	
					//Selection des choix via une entrée utilisateur
					System.out.println("Veuillez taper 1 pour pierre, 2 pour feuille ou 3 pour ciseaux ");
					playerChoice = scanner.nextInt();
					
					if ((playerChoice == 1) || 
						(playerChoice == 2) || 
						(playerChoice == 3)) {
						
						//Affectation des variables selon le choix de l'utilisateur
						if (playerChoice == 1) {
							System.out.println("Votre choix est : " +stone);
						}
						else if (playerChoice == 2) {
							System.out.println("Votre choix est : " +paper);
						}
						else if (playerChoice == 3){
							System.out.println("Votre choix est : " +scissors);
						}
			
						//Permet de générer un chiffre aléatoire 1,2 ou 3
						aiChoice = (int)(Math.random() * 3 )+1;
		
						//Permet de transcrire le nombre aléatoire en une variable
						if (aiChoice == 1) {
							System.out.println("Choix de l'ordinateur : " +stone);
						}
						else if (aiChoice == 2) {
							System.out.println("Choix de l'ordinateur : " +paper);
						}
						else {
							System.out.println("Choix de l'ordinateur : " +scissors);
						}
        
						//Permet d'afficher le résultat du match à l'utilisateur
						if (aiChoice == playerChoice) {
							System.out.println("Match nul, score : " + i + " " + j);
						}
						else if ((aiChoice == 2 && playerChoice == 1) || 
								 (aiChoice == 3 && playerChoice == 2) || 
								 (aiChoice == 1 && playerChoice == 3)) {
							j = j + 1;
							System.out.println("Vous avez perdu, score : " + i + " / " + j);
						}
						else {
							i = i + 1;
							System.out.println("Vous avez gagné, score : " + i + " / " + j);
						}
					}
					else {
						System.out.println("Veuillez entrer un bon chiffre (1, 2 ou 3)");
					}
				}
				//Fermeture du jeu lorsque l'un des deux joueurs obtient 3 points
				while ((i<3) && (j<3));
			
			
			//Affichage du score final
			if (i==3) {
				System.out.println("FATALITY! Votre adversaire est KO! Score final : " + i + " / " + j);
			}
			else {
				System.out.println("FATALITY! Vous êtes KO! Score final : " + i + " / " + j);
			}
			isPlaying = replay();
			i=0;
			j=0;
		}
		catch(Exception e) {
		System.out.println("Veuillez entrer un bon chiffre");
		}
	}
	while (isPlaying == true);		
	}
	
/* --------------------------------------------------------------------------------------------------
* ---------------------------------- MASTERMIND -----------------------------------------------------	
* ---------------------------------------------------------------------------------------------------*/
			
			
	public static void mastermind() {
		
			//Déclaration des variables
			int i; 
			int aiChoice;
			String playerChoice;
			String[] aiChoicePlaying= new String[10];
			String[] colors = new String[10];
			
			//Initialisation des valeurs de la liste colors
			colors[0]= "BLEU";
			colors[1]= "ROUGE";
			colors[2]= "JAUNE";
			colors[3]= "ORANGE";
			colors[4]= "VERT";
			colors[5]= "BLANC";
			colors[6]= "VIOLET";
			colors[7]= "ROSE";
			//colors[8]= "NOIR";
			//colors[9]= "BLANC";
			
			//Permet l'assignation d'une ArrayList
			List<String> colorList = Arrays.asList(colors);
			
			//Règles du jeu
			System.out.println("Bienvenue dans le Mastermind : \n"
					+ "Règles du jeu : l'ordinateur choisi");
			
			do {
				
				/*Permet d'affecter 5 valeurs aléatoires et de les stocker en mémoire 
				*/
				for (i = 0; i < 5; i++) {	
					aiChoice = (int)(Math.random() * 8 );
					aiChoicePlaying[i] = colors[aiChoice];
					System.out.println(colors[aiChoice]); // affichage débug
				}
				
				System.out.println("L'ordinateur a fait son choix, à votre tour !");
				
				//Permet de boucler 12 fois, correspond aux nombres de tours du joueur
				for(i = 1; i < 13; i++) {
					System.out.println(i + "er tour : Veuillez entrez 5 couleurs");
					
					//Affiche l'entrée utilisateur en majuscule
					playerChoice = scanner.next().toUpperCase();
					
						//Controle si la liste color contient bien l'entrée utilisateur 
						if (colorList.contains(playerChoice)) {
							System.out.println(playerChoice);
						}
						else {
							System.out.println("Veuillez rentrer une couleur valide : 'bleu','rouge','jaune','orange', "
									+ "'vert', 'blanc', 'violet' ou 'rose'");
						}
				}
			isPlaying = replay();
			i = 0;
			}
			while (isPlaying ==true);
	}
	
	
/* -------------------------------------------------------------------------------------------------
* ------------------------ FONCTION REPLAY ----------------------------------------------------------	
* -------------------------------------------------------------------------------------------------*/		
		

	//Permet de relancer la partie du jeu en cours ou de retourner au menu principal
	public static boolean replay() {
			
		//Permet de relancer le jeu ou non suivant le choix de l'utilisateur
		System.out.println("Voulez-vous rejouer ? (oui/non)");
		
		//Nouvelle entrée utilisateur et évite les majuscules
		String replay = scanner.next().toLowerCase();
			
		//controle sur les entrées utilisateurs ferme le jeu si mauvaise entrée
		if (replay.contains("oui")) {
				isPlaying = true;
			}
			else if (replay.contains("non")){
				isPlaying = false;
				System.out.println("Retour au menu principal");
				init();
			}
			else {
				isPlaying = false;
				System.err.println("Erreur lors de la saisie utilisateur, retour au menu principal");
				init();
			}
		return isPlaying;
	}
}
