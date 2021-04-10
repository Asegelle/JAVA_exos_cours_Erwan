package fr.ibformation.correctionville;

import fr.ibformation.correctionville.bo.City;
import fr.ibformation.correctionville.bo.Monument;

public class Launcher {
	
	/*
	 * Exercice Villes : 
	 
		Création d'un objet Ville 
		nom (String)
		pays (String)
		nombre d'habitants (entier)
		Créer 3 instances de villes
		 Honolulu, Quiberon, New-York
		Afficher les 3 villes
		Système de catégories par rapport au nombre d'habitants :
		A < 1000 
		1000 < B < 10 000
		10 000 < C < 100 000
		100 000 > D

	Créer une méthode pour comparer 2 objets ville par rapport au nombre d'habitants
	Créer une méthode qui permet de dire si deux villes ont le même nom
	Ajouter à la ville une variable monument de Type Monument
	Chaque monument a un nom et une année de construction

	*/

	public static void main(String[] args) {
		
		// Instanciate 3 city
		City honolulu = new City("Honolulu", "USA", 15000, null);
		City quiberon = new City("Quiberon", "France", 4838, null);
		City newYork = new City("New-York", "USA", 8336000, new Monument("Statue de la liberté", 1886));
		City honolulu2 = new City("honolulu", "USA", 14000, null);
		
		System.out.println(honolulu.description());
		System.out.println(quiberon.description());
		System.out.println(newYork.description());
		
		System.out.println(newYork);
		
		// Compare count citizen
		System.out.println(honolulu.compareTwoCityCountCitizen(newYork));
		System.out.println(newYork.compareTwoCityCountCitizen(quiberon));
		
		// Compare name 
		System.out.println(honolulu.compareTwoCityName(newYork));
		System.out.println(honolulu.compareTwoCityName(honolulu));
		System.out.println(honolulu.compareTwoCityName(honolulu2));
		
	}

}
