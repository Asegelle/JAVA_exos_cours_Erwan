package fr.ibformation.exception;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		
		System.out.println("Programme pour tester les exceptions");
		
		int value1 = 5, value2 = 2;
		
		try {
			value1 = 3;
			// C'est ici qu'on met notre code qui peut poser problème
			System.out.println(value1 / value2);
			String string = null;
			string.charAt(0);
		} catch(ArithmeticException e) {
			// On agit en fonction de l'exception
			System.out.println("ArithmeticException");
			e.printStackTrace();
			
		} catch(NullPointerException e) {
			// On agit en fonction de l'exception
			System.out.println("NullPointerException");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("Autre Exception");
		} finally {
			// bloc de code toujours exécuté
			// exception ou pas
			System.out.println("Finally");
		}
		
		System.out.println("Je continue le programme");
		
		Scanner sc = new Scanner(System.in);
		sc.nextInt();

	}

}
