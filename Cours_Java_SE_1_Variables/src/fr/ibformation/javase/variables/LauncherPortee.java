package fr.ibformation.javase.variables;

public class LauncherPortee {
	
	// Variables globales
	public static String firstNameGlobal = "ErwanGlobal";
	public static final String ROLE_DEVELOPPER = "Developper";
	
	public static void main(String[] args) {
		// Déclaration des variables
		String firstNameMain = "ErwanMain";
		String roleUser = ROLE_DEVELOPPER;
		
		// Appel de la fonction
		displayText();
		
		// System.out.println(firstNameDisplay); // Ne marche pas car la variable appartient seulement à la fonction displayText (Variable locale)
		
		// Globale
		System.out.println(firstNameGlobal);
		
		// ROLE_DEVELOPPER = "Admin"; // Ne peut pas marcher. On ne peut pas réaffecter une constante avec une nouvelle valeur
		
		final int TEST = 2; // Contante locale
		
		if (roleUser.equalsIgnoreCase(ROLE_DEVELOPPER)) {
			System.out.println(firstNameGlobal + " is " + roleUser);
		}
	}
	
	public static void displayText() {
		// Déclaration des variables
		String firstNameDisplay = "ErwanDisplay";
		//System.out.println(firstNameMain); // Ne marche pas car la variable appartient seulement à la fonction main (Variable locale)
		
		// Globale
		System.out.println(firstNameGlobal);
		
		String roleUser = ROLE_DEVELOPPER;
		
		if (roleUser.equalsIgnoreCase(ROLE_DEVELOPPER)) {
			System.out.println(firstNameGlobal + " is " + roleUser);
		}
		
	}

}
