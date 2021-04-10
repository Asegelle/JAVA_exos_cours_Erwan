package fr.ibformation.javase.bo;

public class Animal {
	private String name;
	private String species;
	private int category;
	
	public Animal (String name, String species, int category) {
		this.name = name;
		this.species = species;
		this.category = category;
		
		
	}
	
	public void testPublicMethod() {
		this.testPrivateMethod();
	}
	
	private void testPrivateMethod() {
		System.out.println("testPrivateMethod");
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (this.category != 1) {
			this.name = name;
		} else {
			this.name = "unknown";
		}
	}
	
	public String getSpecies() {
		return this.species;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
}
