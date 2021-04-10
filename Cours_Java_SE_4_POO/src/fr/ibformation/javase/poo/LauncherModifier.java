package fr.ibformation.javase.poo;

import fr.ibformation.javase.bo.TownModifier;

public class LauncherModifier {
	public static String nameHere;
	protected static int sizeHere;
	static int countCitizenHere;
	private static String nameMayorHere;

	public static void main(String[] args) {
		TownModifier town = new TownModifier();
		town.name = "Nantes";
		// town.size = 300; // Pas dans le m�me package et pas une classe d�riv�es
		// town.countCitizen = 82342; // Pas dans le m�me package
		// town.nameMayor = "Erwan BACCON"; // Pas dans la m�me classe
		
		// Dans la m�me classe
		nameHere = "Nantes";
		sizeHere = 300;
		countCitizenHere = 82342; 
		nameMayorHere = "Erwan BACCON"; 
	}

}
