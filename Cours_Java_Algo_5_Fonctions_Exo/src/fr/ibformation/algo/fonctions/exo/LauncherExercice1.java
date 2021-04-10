package fr.ibformation.algo.fonctions.exo;

public class LauncherExercice1 {

	public static void main(String[] args) {
		
		// Etape 1 : Déclaration des variables
	    int a, b, c, d, e, temp;
	    
	    // Etape 2 : Affectation initiale des variables
	    a = 1;
	    b = 8;
	    c = 9;
	    d = 4;
	    e = 3;
	    displayVariables(a, b, c, d, e);

	    // Etape 3 : Inverser a et b
	    temp = a;
	    a = b;
	    b = temp;
	    displayVariables(a, b, c, d, e);

	    // Etape 4 : Inverser b et c
	    temp = b;
	    b = c;
	    c = temp;
	    displayVariables(a, b, c, d, e);

	    // Etape 5 : Somme de a et b dans c
	    c = a + b;
	    displayVariables(a, b, c, d, e);

	    // Etape 6 : Inverser c et e
	    temp = c;
	    c = e;
	    e = temp;
	    displayVariables(a, b, c, d, e);

	    // Etape 7 : Retour à l'état initial
	    a = 1;
	    b = 8;
	    c = 9;
	    d = 4;
	    e = 3;

	    // Etape finale : Afficher l'état de chaque variable
	    displayVariables(a, b, c, d, e);
	}

	public static void displayVariables(int a, int b, int c, int d, int e) {
		System.out.println("Liste de variables : a : " + a + " b : " + b + " c : " + c + " d : " + d + " e : " + e);
	}


}
