package fr.ibformation.exception;

public class LauncherExercice1 {

	public static void main(String[] args) {
		// Exercice 1 : D�tecter o� se situe l'erreur avec le debug
		
		int a, b, c, d, e;
		
		a = 1;
		b = 3;
		c = 5;
		d = 7;
		e = 2;
		
		int firstCalculation = a + b;
		int secondCalculation = d - c - e;
		
		int finalCalculation = firstCalculation / secondCalculation;
		
		System.out.println("test");
		
		System.out.println(finalCalculation);
	}

}
