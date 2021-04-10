package fr.ibformation.javase.poo;

import fr.ibformation.javase.bo.User;

public class LauncherClass {

	public static void main(String[] args) {
		// Mon programme démarre ici
		
		// Pour Erwan
		User user; // Déclaration d'une variable objet
		user = new User(); // Affectation d'une instance d'objet de type User
		user.firstName = "Erwan"; // Affecte une valeur dans la variable FirstName de l'objet User créé plus tôt
		user.lastName = "Baccon";
		user.age = 30;
		
		System.out.println(user.fullName());
		
		// Pour Yohann
		User userY = new User();
		userY.firstName = "Yohann"; // Affecte une valeur dans la variable FirstName de l'objet User créé plus tôt
		userY.lastName = "Migliorini";
		userY.age = 22;
		
		System.out.println(userY.fullName());
		
		// Pour Holy
		User userH = new User();
		
		System.out.println(userH.fullName());
		
		// Pour Nezha
		User userN = new User("Nezha", "Bouhafs", 18);
		
		System.out.println(userN.fullName());
		System.out.println(userN.description());
		
		
		
		
		
		
		// Déclaration d'une variable avec une classe
		
		// Le mot cle "new" permet d'utiliser le constructeur pour fabriquer une instance de User
		
		
		// On créer une autre instance de User avec le constructeur d'arguments
		
		
		// On peut utiliser également la méthode de l'objet
		
		testNull();
		// Mon programme s'arrête ici
	}
	
	
	public static void testNull() {
		int testPrimitive;
		Integer testObject = 20;
		Integer testObject2 = null;
		
		testObject = null;
		
		System.out.println(testObject == testObject2);
	}

}
