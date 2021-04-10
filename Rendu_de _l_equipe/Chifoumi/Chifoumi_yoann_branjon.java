import java.util.Scanner;

public class Chifoumi {

	public static void main(String[] args) {

		String userChoice = "";
		int uC=999;
		int count = 1;
		boolean isOk;
		boolean isVerificationOk = true;
		Scanner sc = new Scanner(System.in);
		int iaNumber;

		do {
			iaNumber = getRandomInt(0, 2);
			isOk = true;
			System.out.println();
			System.out.println("Veuillez renseigner un choix : pierre, feuille ou ciseaux."); 
			userChoice = sc.nextLine();
			
			//V�rifie la saisie
			isVerificationOk = inputVerification(userChoice);
			
			if (isVerificationOk == true) {
			//permet de convertir la saisie de l'utilisateur en int
			uC = switchUserChoice(userChoice, uC);
			
			//permet d'afficher le coup de l'IA en fonction du random
			iaNumber = switchIA(iaNumber);
			
			//permet de d�terminer qui est vainqueur
			count = confrontation(uC, iaNumber, count);
			
			//permet de savoir si un joueur a gagn� deux fois de suite
			isOk = victoryCondition(count);
			
			}
		}
		while(isOk == true);
		
		System.out.println("Fin de la partie");

	}

//////////////////////////////////////////////////FONCTION///////////////////////////////////////////////////////////////////////
	
	private static int getRandomInt(int min, int max) {
		if (min>=max) {
			throw new IllegalArgumentException("Le Max doit �tre sup�rieur au minimum");
	}
		return (int)(Math.random() * ((max - min) + 1)) + min;
		}
	
	
	public static boolean inputVerification(String userChoice) {
		
		if (!userChoice.equals("pierre") && !userChoice.equals("feuille") && !userChoice.equals("ciseaux")) {
			System.out.println(userChoice + " n'est pas une valeur autoris�e, veuillez recommencer");
			return false;
		}
		else {
			return true;
		}
	}
	
	public static boolean victoryCondition(int count) {
		
		if (count > 2) {
			System.out.println("Vous avez gagn� la manche");
			return false;
		}
		else if (count < -2){
			System.out.println("Vous avez perdu la manche");
			return false;
		}
		else {
			
			return true;
		}
	}
	public static int confrontation(int uC, int iaNumber, int count) {
		
		//Pierre contre ciseaux
		if (uC == 0 && iaNumber == 2) {

			System.out.println("Pierre gagne contre ciseaux, vous avez gagn�");
			return count = count + 1;
		};

		if (uC == 2 && iaNumber == 0) {

			System.out.println("Pierre gagne contre ciseaux, vous avez perdu");
			return count = count - 1;
		};
		//Pierre contre feuille
		if (uC == 1 && iaNumber == 0) {

			System.out.println("Feuille gagne contre pierre, vous avez gagn�");
			return count = count + 1;
		};

		if (uC == 0 && iaNumber == 1) {

			System.out.println("Feuille gagne contre pierre, vous avez perdu");
			return count = count - 1;
		};
		//Feuille contre ciseaux
		if (uC == 2 && iaNumber == 1) {

			System.out.println("Ciseaux gagne contre ciseaux, vous avez gagn�");
			return count = count + 1;
		};

		if (uC == 1 && iaNumber == 2) {

			System.out.println("Ciseaux gagne contre pierre, vous avez perdu");
			return count = count - 1;
		};
		//Match nul
		if (uC == iaNumber) {

			System.out.println("Match nul !");
		}
		return count;
		
	}

	// Choix de l'IA
	public static int switchIA(int iaNumber) {
		switch (iaNumber) {

		case 0 : 
			System.out.println("L'ia a jou� Pierre");
			return iaNumber = 0;

		case 1 : 
			System.out.println("L'ia a jou� Feuille");
			return iaNumber = 1;

		case 2 : 
			System.out.println("L'ia a jou� Ciseaux");
			return iaNumber = 2;
		}
		return iaNumber;
	}

	// Conversion userChoice
	public static int switchUserChoice(String userChoice, int uC) {

		switch (userChoice) {

		case "pierre" : 
			return uC = 0;
			
		case "feuille" : 
			return uC = 1;

		case "ciseaux" : 
			return uC = 2;			
		}
		return uC;
	}
}
