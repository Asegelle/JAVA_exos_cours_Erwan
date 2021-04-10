package Challanges;

import java.util.Scanner;

public class JeuNombreMistere_Bediss {

	public static void main(String[] args) {
		// D�claration des variables
		int inputNumber, mysteryNumber, compteur =0;
		boolean isFind = false;
		
		// D�claration de la variable de saisie
		Scanner scanner = new Scanner (System.in);
		
		// Choix du nombre al�atoire
		mysteryNumber = 48;
		
		
		// Saisir une variable d'entr�e
		System.out.println("Nous vous rappelons que vous devez trouver le nombre Myst�re en 7 coups Maximum");
		System.out.println("Nous vous rappelons que vous le nombre est entre 0 et 100");
		System.out.println();
		
		do {
			System.out.println("Devinez le nombre : ");
			inputNumber = scanner.nextInt();
			
			// Rapprocher la valeur entr�e % au nombre Myst�re
			if (inputNumber > mysteryNumber) {
				System.out.println("Trop grand");
			} else if (inputNumber < mysteryNumber) {
				System.out.println("Trop petit");
			} else if (inputNumber == mysteryNumber) {
				System.out.println("Bravo tu as trouv� le nombre Myst�re : " + mysteryNumber);
				isFind = true;
			} else if (inputNumber > 100) {
				System.out.println("Ta saisie est sup�rieure � 100 !!!");
			} else if ( inputNumber <0 ) {
				System.out.println("Ta saisie est inf�rieur � 0 !!!");
			}
			
			compteur++;
			
			if (isFind != true) {
				if (compteur == 7) {
					System.out.println("Fin de la partie");
					isFind =true;
					
				} else if (2  < compteur && compteur < 7) {
					
					System.out.println("Courage il vous reste : " + (7- compteur)+ " fois " +"Essayez encore");
				} else if (compteur == 6) {
					System.out.println("Derni�re tentative");
				}	
			}
			
				
			
		} while (isFind !=true );
		
		
		
		
	}	
		
}		
		// Etape finale
		/*A la fin du jeu, le syst�me indique :
				le nombre de coup en cas de victoire, 
			ou 
				un message de d�faite le cas �ch�ant
			


/*
Le syst�me choisit un nombre al�atoire entre 1 et 100 (il est possible de le fixerdans un premier temps). 

Le joueur doit trouver le nombre myst�re en 7 coups maximum ! 

A chaque tentative, le syst�me indique si le nombre myst�re est 
		plus grand
	ou 
		plus petit. 

A la fin du jeu, le syst�me indique :
		le nombre de coup en cas de victoire, 
	ou 
		un message de d�faite le cas �ch�ant


*/