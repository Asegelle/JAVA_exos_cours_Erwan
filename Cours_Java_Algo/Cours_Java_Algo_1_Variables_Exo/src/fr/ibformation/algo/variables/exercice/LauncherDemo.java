package fr.ibformation.algo.variables.exercice;

import java.util.Scanner;

public class LauncherDemo {

	public static void main(String[] args) {
		int age;
		
		System.out.println("Quel est votre age ? :");
		Scanner scannerInteger = new Scanner(System.in);
		age = scannerInteger.nextInt(); 
		
		if (age >= 18 && age <= 150) {
			System.out.println("Vous �tes majeur");
		} else if (age == 17) {
			System.out.println("Vous �tes presque majeur");
		} else if (age > 150) {
			System.out.println("Vous �tes mort... normalement");
		} else if (age >= 0) {
			System.out.println("Vous �tes un enfant");
		} else {
			System.out.println("Vous �tes pas n�");
		}
		
		String backgroundColor, textColor;
		
		backgroundColor = "red";
		switch (backgroundColor) {
			case "black":
				textColor = "white";
				break;
			case "white":
				textColor = "black";
				break;
			default :
				textColor = "blue";
		}
		
		System.out.println("textColor " + textColor);



	}

}
