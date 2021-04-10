package fr.ibformation.algo.tableaux.exo;

public class LauncherExercice2 {

	public static void main(String[] args) {
		// Mon programme commence ici
		
		/*
		 * Une course a eu lieu. Un algorithme permet de faire la chose suivante :
			Saisir les 5 premiers de la course dans un tableau 
			Afficher le commentaire d'arrivée grâce à ces variables ce tableau
			Horreur, le premier a triché, il est éliminé. Vous devez mettre le classement à jours

		 */
		
		// Déclaration des variables
		String[] ranking = new String[5];
		
		// Affectation des valeurs
		ranking[0] = "Robert";
		ranking[1] = "Louis";
		ranking[2] = "Anna";
		ranking[3] = "Christelle";
		ranking[4] = "Bob";
		
		// Affichage du classement
		System.out.println("Classement : ");
		System.out.println("1ère place : " + ranking[0]);
		System.out.println("2ème place : " + ranking[1]);
		System.out.println("3ème place : " + ranking[2]);
		System.out.println("4ème place : " + ranking[3]);
		System.out.println("5ème place : " + ranking[4]);
		
		// Réaffecter les ranking suite à la triche
		ranking[0] = ranking[1];
		ranking[1] = ranking[2];
		ranking[2] = ranking[3];
		ranking[3] = ranking[4];
		ranking[4] = "Jean le Bon";
		
		// Affichage du classement suite à la triche
		System.out.println("Classement final : ");
		System.out.println("1ère place : " + ranking[0]);
		System.out.println("2ème place : " + ranking[1]);
		System.out.println("3ème place : " + ranking[2]);
		System.out.println("4ème place : " + ranking[3]);
		System.out.println("5ème place : " + ranking[4]);
		
		// Mon programme se termine ici

	}

}
