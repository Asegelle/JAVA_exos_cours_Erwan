package fr.ibformation.algo.tableaux.exo;

public class LauncherExercice2 {

	public static void main(String[] args) {
		// Mon programme commence ici
		
		/*
		 * Une course a eu lieu. Un algorithme permet de faire la chose suivante :
			Saisir les 5 premiers de la course dans un tableau 
			Afficher le commentaire d'arriv�e gr�ce � ces variables ce tableau
			Horreur, le premier a trich�, il est �limin�. Vous devez mettre le classement � jours

		 */
		
		// D�claration des variables
		String[] ranking = new String[5];
		
		// Affectation des valeurs
		ranking[0] = "Robert";
		ranking[1] = "Louis";
		ranking[2] = "Anna";
		ranking[3] = "Christelle";
		ranking[4] = "Bob";
		
		// Affichage du classement
		System.out.println("Classement : ");
		System.out.println("1�re place : " + ranking[0]);
		System.out.println("2�me place : " + ranking[1]);
		System.out.println("3�me place : " + ranking[2]);
		System.out.println("4�me place : " + ranking[3]);
		System.out.println("5�me place : " + ranking[4]);
		
		// R�affecter les ranking suite � la triche
		ranking[0] = ranking[1];
		ranking[1] = ranking[2];
		ranking[2] = ranking[3];
		ranking[3] = ranking[4];
		ranking[4] = "Jean le Bon";
		
		// Affichage du classement suite � la triche
		System.out.println("Classement final : ");
		System.out.println("1�re place : " + ranking[0]);
		System.out.println("2�me place : " + ranking[1]);
		System.out.println("3�me place : " + ranking[2]);
		System.out.println("4�me place : " + ranking[3]);
		System.out.println("5�me place : " + ranking[4]);
		
		// Mon programme se termine ici

	}

}
