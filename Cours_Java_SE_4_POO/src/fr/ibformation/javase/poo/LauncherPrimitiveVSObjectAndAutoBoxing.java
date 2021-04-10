package fr.ibformation.javase.poo;

public class LauncherPrimitiveVSObjectAndAutoBoxing {

	public static void main(String[] args) {
		// Primitive
		int age = 0;
		boolean isHere = true;
		
		// Object
		Integer age2 = 0;
		Boolean isHere2 = true;
		
		// age. // N'a pas de fonctionnalités en plus
		// age2. // A des fonctionnalités en plus
		
		String firstName = new String("Erwan");
		String firstName2 = new String("Erwan");
		System.out.println(firstName.equalsIgnoreCase(firstName2));
		System.out.println(firstName == firstName2);
		
		Integer j = 1; // Autoboxing
		int i = new Integer(1); // Unboxing
	}

}
