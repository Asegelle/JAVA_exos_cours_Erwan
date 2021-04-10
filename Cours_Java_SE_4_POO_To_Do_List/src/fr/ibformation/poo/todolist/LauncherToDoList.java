package fr.ibformation.poo.todolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.ibformation.poo.todolist.bo.Product;

public class LauncherToDoList {

	public static void main(String[] args) {
		
		// Etape 1 : Déclaration des variables
		Scanner scanner = new Scanner(System.in);
		boolean isExit = false;
		List<Product> products = new ArrayList<Product>();
		
		// BOUCHON TEMPORAIRE
		products.add(new Product(0, "Pomme", 40));
		products.add(new Product(1, "Poire", 30));
		products.add(new Product(2, "Banane", 20));
		
		// Etape 2 : On boucle sur le menu tant que l'utilisateur n'a pas choisi de partir du programme
		do {
			// Etape 3 : Afficher le menu
			displayMenu();
			
			// Etape 4 : Choix de l'utilisateur
			int inputMenuChoice = scanner.nextInt();
			
			// Etape 5 : Condition pour lancer la bonne action en fonction de la saisie utilisateur
			switch (inputMenuChoice) {
				case 1:
					System.out.println("Afficher la liste des éléments :");
					displayProducts(products);
					break;
				case 2:
					System.out.println("Ajouter un élément :");
					break;
				case 3:
					System.out.println("Supprimer un élément :");
					break;
				case 4:
					System.out.println("Modifier un élément :");
					break;
				case 5:
					System.out.println("Quitter le programme !");
					isExit = true;
					break;
				default:
					System.err.println("Je n'ai pas compris votre saisie !");
					break;
			}
		} while(isExit == false);
		
		// Etape 6 : Dire au revoir
		System.out.println("Bye bye !");
		

	}
	
	private static void displayMenu() {
		System.out.println("Menu de la To Do List :");
		System.out.println("1 - Afficher la liste des éléments");
		System.out.println("2 - Ajouter un élément");
		System.out.println("3 - Supprimer un élément");
		System.out.println("4 - Modifier un élément");
		System.out.println("5 - Quitter le programme");
	}
	
	private static void displayProducts(List<Product> products) {
		for(Product element : products) {
			System.out.println(element);
		}
	}

}
