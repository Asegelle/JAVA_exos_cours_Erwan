package fr.ibformation.algo.fonctions.exo;

import java.util.Arrays;
import java.util.List;

public class LauncherExercice3 {

	public static void main(String[] args) {
		/*
		 * Exercice bonus : Faire plusieurs fonctions :
			Une qui permettra de trouver le maximum d置n tableau (sans aide de Java)
			Une qui permettra de trouver le maximum d置n tableau (avec aide de Java)
			Une qui permettra de trouver le minimum d置n tableau (sans aide de Java)
			Une qui permettra de trouver le minimum d置n tableau (avec aide de Java)
		 */
		
		// D馗laration des variables
		int[] numbers = new int[6];
		numbers[0] = 2;
		numbers[1] = 5;
		numbers[2] = 9;
		numbers[3] = 1;
		numbers[4] = 8;
		numbers[5] = 42;
		
		// Une qui permettra de trouver le maximum d置n tableau (sans aide de Java)
		int maxResult = maxWithoutHelp(numbers);
		
		// Afficher le max du tableau
		System.out.println("Maximum :" + maxResult);
		
		// Une qui permettra de trouver le minimum d置n tableau (sans aide de Java)
		int minResult = minWithoutHelp(numbers);
		// Afficher le min du tableau
		System.out.println("Minimum :" + minResult);
		
		// Une qui permettra de trouver le maximum d置n tableau (avec aide de Java)
		maxWithHelp(numbers);
		
		// Une qui permettra de trouver le minimum d置n tableau (avec aide de Java)
		minWithHelp(numbers);

	}
	
	public static int maxWithoutHelp(int[] numbers) {
		int max = Integer.MIN_VALUE;

		// On rentre dans la boucle FOR
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		
		return max;
	}
	
	public static int minWithoutHelp(int[] numbers) {
		int min = Integer.MAX_VALUE;
		
		// On rentre dans la boucle FOR
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		
		return min;
	}
	
	public static void maxWithHelp(int[] numbers) {
		// TODO Not optimized
		int max = Arrays.stream(numbers).max().getAsInt();
		System.out.println("Max with help :" + max);  
	}
	
	public static void minWithHelp(int[] numbers) {
		// TODO Not optimized
		int min = Arrays.stream(numbers).min().getAsInt();
		System.out.println("Min with help :" + min);  
	}
	
}
