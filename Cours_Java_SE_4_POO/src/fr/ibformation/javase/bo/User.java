package fr.ibformation.javase.bo;


public class User {
	// Attributs de classe / Variables de classe 
	public String firstName;
	public String lastName;
	public int age;
		
	// Constructeur(s)
	public User() {
		firstName = "Holy";
		lastName = "Razafinjoelina";
		age = 18;
	}
	
	public User(String firstNameParam, String lastNameParam, int ageParam) {
		firstName = firstNameParam;
		lastName = lastNameParam;
		age = ageParam;
	}
	
	// Méthodes de classes
	public String fullName() {
		return firstName + " " + lastName;
	}
	
	public String description() {
		return firstName + " " + lastName + " " + age + " ans";
	}
}
