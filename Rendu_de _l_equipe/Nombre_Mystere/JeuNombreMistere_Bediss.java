package Challanges;

import java.util.Scanner;

public class JeuNombreMistere_Bediss {

	public static void main(String[] args) {
		// Déclaration des variables
		int inputNumber, mysteryNumber, compteur =0;
		boolean isFind = false;
		
		// Déclaration de la variable de saisie
		Scanner scanner = new Scanner (System.in);
		
		// Choix du nombre aléatoire
		mysteryNumber = 48;
		
		
		// Saisir une variable d'entrée
		System.out.println("Nous vous rappelons que vous devez trouver le nombre Mystère en 7 coups Maximum");
		System.out.println("Nous vous rappelons que vous le nombre est entre 0 et 100");
		System.out.println();
		
		do {
			System.out.println("Devinez le nombre : ");
			inputNumber = scanner.nextInt();
			
			// Rapprocher la valeur entrée % au nombre Mystère
			if (inputNumber > mysteryNumber) {
				System.out.println("Trop grand");
			} else if (inputNumber < mysteryNumber) {
				System.out.println("Trop petit");
			} else if (inputNumber == mysteryNumber) {
				System.out.println("Bravo tu as trouvé le nombre Mystère : " + mysteryNumber);
				isFind = true;
			} else if (inputNumber > 100) {
				System.out.println("Ta saisie est supérieure à 100 !!!");
			} else if ( inputNumber <0 ) {
				System.out.println("Ta saisie est inférieur à 0 !!!");
			}
			
			compteur++;
			
			if (isFind != true) {
				if (compteur == 7) {
					System.out.println("Fin de la partie");
					isFind =true;
					
				} else if (2  < compteur && compteur < 7) {
					
					System.out.println("Courage il vous reste : " + (7- compteur)+ " fois " +"Essayez encore");
				} else if (compteur == 6) {
					System.out.println("Dernière tentative");
				}	
			}
			
				
			
		} while (isFind !=true );
		
		
		
		
	}	
		
}		
		// Etape finale
		/*A la fin du jeu, le système indique :
				le nombre de coup en cas de victoire, 
			ou 
				un message de défaite le cas échéant
			


/*
Le système choisit un nombre aléatoire entre 1 et 100 (il est possible de le fixerdans un premier temps). 

Le joueur doit trouver le nombre mystère en 7 coups maximum ! 

A chaque tentative, le système indique si le nombre mystère est 
		plus grand
	ou 
		plus petit. 

A la fin du jeu, le système indique :
		le nombre de coup en cas de victoire, 
	ou 
		un message de défaite le cas échéant


*/