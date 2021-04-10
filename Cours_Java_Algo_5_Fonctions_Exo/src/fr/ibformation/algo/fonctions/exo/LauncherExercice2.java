package fr.ibformation.algo.fonctions.exo;

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
		affectRanking("Robert", "Louis", "Anna", "Christelle", "Bob");
		
		// Affichage du classement
		displayRanking("Classement temporaire : ", ranking);
		
		// Réaffecter les ranking suite à la triche
		affectRanking(ranking[1], ranking[2], ranking[3], ranking[4], "Jean le Bon");
		
		// Affichage du classement suite à la triche
		displayRanking("Classement final : ", ranking);
		
		// Mon programme se termine ici
	}
	
	public static String[] affectRanking(String place1, String place2, String place3, String place4, String place5) {
		String[] rankingFunction = new String[5];
		rankingFunction[0] = place1;
		rankingFunction[1] = place2;
		rankingFunction[2] = place3;
		rankingFunction[3] = place4;
		rankingFunction[4] = place5;
		
		return rankingFunction;
	}
	
	public static void displayRanking(String typeRanking, String[] rankingParam) {
		System.out.println(typeRanking);
		System.out.println("1ère place : " + rankingParam[0]);
		System.out.println("2ème place : " + rankingParam[1]);
		System.out.println("3ème place : " + rankingParam[2]);
		System.out.println("4ème place : " + rankingParam[3]);
		System.out.println("5ème place : " + rankingParam[4]);
	}

}
