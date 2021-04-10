package fr.ibformation.algo.boucles.exo;

import java.util.Scanner;

public class LauncherDemo {

	public static void main(String[] args) {
		
		int[] numbers = new int[3];
		numbers[0] = 42;
		numbers[1] = 30;
		numbers[2] = 69;
		
		System.out.println(numbers.toString());
		
		// For
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// i++ = i + 1; // Incrémentation
		
		for (int iArray = 0; iArray < numbers.length; iArray++) {
			System.out.println(numbers[iArray]);
		}
		
		// While
		int count = 0;
		// On vérifie d'abord la condition avant de boucler
		while(count < 5) {
			System.out.println("Je suis dans la boucle while count " + count);
			count++;
		}
		
		int count2 = 8;
		// On vérifie d'abord la condition avant de boucler
		// Ne passe pas dedans
		while(count2 < 5) {
			System.out.println("Je suis dans la boucle while count2 " + count2);
			count2++;
			
		}
		
		
		do {
			System.out.println("Je suis dans la boucle do/while");
		} while (count2 < 5);

		// Saisie
		
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		int count3 = 8;
		// On vérifie d'abord la condition avant de boucler
		// Ne passe pas dedans
		while(count3 < 5) {
			
			System.out.println("Je suis dans la boucle while count3 " + count3);
			count3++;
			inputNumber = scanner.nextInt();
		}
		
		System.out.println("Saisie utilisateur : " + inputNumber);
		
		// On boucle une fois au moins avant de vérifier la condition du while
		int count4 = 3;
		do {
			System.out.println("Je suis dans la boucle do/while");
			inputNumber = scanner.nextInt();
			count4 = inputNumber;
			
		} while (count4 < 5);
		
		System.out.println("Saisie utilisateur : " + inputNumber);
		

	}

}
