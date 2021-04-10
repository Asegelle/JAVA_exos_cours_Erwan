package fr.ibformation.javase.poo;

import fr.ibformation.javase.bo.Animal;

public class LauncherEncapsulation {

	public static void main(String[] args) {
		Animal animal = new Animal("Haglae", "Cat", 1);
		
		animal.setName("Haglae");
		animal.setSpecies("Cat");
		
		System.out.println("Name : " + animal.getName());
		System.out.println("Species : " + animal.getSpecies());
	}

}
