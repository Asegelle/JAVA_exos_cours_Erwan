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
		// town.size = 300; // Pas dans le même package et pas une classe dérivées
		// town.countCitizen = 82342; // Pas dans le même package
		// town.nameMayor = "Erwan BACCON"; // Pas dans la même classe
		
		// Dans la même classe
		nameHere = "Nantes";
		sizeHere = 300;
		countCitizenHere = 82342; 
		nameMayorHere = "Erwan BACCON"; 
	}

}
