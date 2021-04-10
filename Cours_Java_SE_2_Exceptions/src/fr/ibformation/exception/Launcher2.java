package fr.ibformation.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Launcher2 {

	public static void main(String[] args) {

		Scanner sc = null;
		boolean saisieCorrecte = true;
		int nombre = 0;
		
		do {
			try {
				System.out.println("Entrer un nombre entre 1 et 10");
				sc = new Scanner(System.in);
				nombre = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Vous n'avez pas saisi un nombre");
				saisieCorrecte = false;
			}
			
			if (!(nombre > 0 && nombre < 11)) {
				saisieCorrecte = false;
			}
		} while (!saisieCorrecte && !(nombre > 0 && nombre < 11));
		
		sc.close();
		System.out.println("Vous avez saisi " + nombre);
	}

}