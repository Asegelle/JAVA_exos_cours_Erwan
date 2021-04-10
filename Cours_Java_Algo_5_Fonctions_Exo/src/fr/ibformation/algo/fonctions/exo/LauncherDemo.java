package fr.ibformation.algo.fonctions.exo;

import java.util.Scanner;

public class LauncherDemo {
	public static void main(String[] args) {
		// Mon programme démarre ici
		
		// Appel de la fonction moyenne
		average();
		
		// Appel de la fonction avec un return
		int valueReturned = averageWithReturn();
		System.out.println("valueReturned : " + valueReturned);
		System.out.println("averageWithReturn() : " + averageWithReturn());
		
		// Appel de la fonction avec un / des paramètres
		averageWithParam(5, 15);
		averageWithParam(42, 156);
		averageWithParam(86, 134);
		
		// Appel de la fonction avec des param et return 
		int valueReturned2 = averageWithParamAndReturn(54, 42);
		System.out.println("valueReturned2 : " + valueReturned2);
		
		// Mon programme se termine ici
	}
	
	/**
	 * Déclaration d'une fonction Java
	 */
	public static void average() {
		int value1 = 5;
		int value2 = 15;
		int averageResult = (value1 + value2) / 2;
		System.out.println("Moyenne : " + averageResult );
	}
	
	public static int averageWithReturn() {
		int value1 = 5;
		int value2 = 15;
		int averageResult = (value1 + value2) / 2;
		System.out.println("Moyenne with return : " + averageResult );
		
		return averageResult;
	}
	
	public static void averageWithParam(int value1, int value2) {
		int averageResult = (value1 + value2) / 2;
		System.out.println("Moyenne with param : " + averageResult );
		averageWithReturn();
	}
	
	public static int averageWithParamAndReturn(int value1, int value2) {
		int averageResult = (value1 + value2) / 2;
		System.out.println("Moyenne with param and return : " + averageResult );
		return averageResult;
	}

}
