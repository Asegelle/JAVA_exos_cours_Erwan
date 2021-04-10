package fr.ibformation.javase.variables;

public class LauncherOperators {

	public static void main(String[] args) {
		int a, b, c, d;
		a = 2;
		b = 3;
		c = 5;
		d = 0;
		
		// Addition
		System.out.println("a + b = " + (a + b));
		
		// Soustraction
		System.out.println("a - b = " + (a - b));
		
		// Multiplication
		System.out.println("a * b = " + (a * b));
		
		// Division
		System.out.println("a / b = " + (a / b));
		
		// Modulo : Divise puis garde seulement le restant que n'a pas pu être divisé
		System.out.println("c % a = " + (c % a));
		System.out.println("26 % 3 = " + (26 % 3));
		
		/*
		 * 5 % 2
		 * 1) 5 - 2 = 3 (1 soustraction par 2, il reste 3)
		 * 2) 3 - 2 = 1 (1 soustraction par 2, il reste 1)
		 * 3) 1 - 2 = -1 Si on soustrait 2 à la valeur 1, est-ce qu'on tombe en négatif
		 */
		
		// Distributeur de billets et de pièces
		int moneyAskByUser = 212;
		final int NOTE_20 = 20;
		final int NOTE_10 = 10;
		
		int remainingMoney = moneyAskByUser % NOTE_20;
		System.out.println(remainingMoney);
		remainingMoney = moneyAskByUser % NOTE_10;
		System.out.println(remainingMoney);
		
		// Incrémenation (Le principe d'augmenter de 1)
		d++;
		System.out.println("d++; d = " + d);
		d = d + 1; // Même chose
		System.out.println("d = d + 1; d = " + d);
		d += 1; // Même chose
		System.out.println("d += 1; d = " + d);
		
		// Décrémentation
		d--;
		System.out.println("d--; d = " + d);
		d = d - 1; // Même chose
		System.out.println("d = d - 1; d = " + d);
		d -= 1; // Même chose
		System.out.println("d -= 1; d = " + d);
		
	}

}
