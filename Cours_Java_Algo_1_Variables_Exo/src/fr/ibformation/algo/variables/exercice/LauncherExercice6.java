package fr.ibformation.algo.variables.exercice;

public class LauncherExercice6 {

	public static void main(String[] args) {
		
		// Etape 1 : D�claration des variables
	    int a, b, c, d, e, temp;
	    
	    // Etape 2 : Affectation initiale des variables
	    a = 1;
	    b = 8;
	    c = 9;
	    d = 4;
	    e = 3;
	    System.out.println("a : " + a + " b : " + b + " c : " + c + " d : " + d + " e : " + e);

	    // Etape 3 : Inverser a et b
	    temp = a;
	    a = b;
	    b = temp;
	    System.out.println("a : " + a + " b : " + b + " c : " + c + " d : " + d + " e : " + e);

	    // Etape 4 : Inverser b et c
	    temp = b;
	    b = c;
	    c = temp;
	    System.out.println("a : " + a + " b : " + b + " c : " + c + " d : " + d + " e : " + e);

	    // Etape 5 : Somme de a et b dans c
	    c = a + b;
	    System.out.println("a : " + a + " b : " + b + " c : " + c + " d : " + d + " e : " + e);

	    // Etape 6 : Inverser c et e
	    temp = c;
	    c = e;
	    e = temp;
	    System.out.println("a : " + a + " b : " + b + " c : " + c + " d : " + d + " e : " + e);

	    // Etape 7 : Retour � l'�tat initial
	    a = 1;
	    b = 8;
	    c = 9;
	    d = 4;
	    e = 3;

	    // Etape finale : Afficher l'�tat de chaque variable
	    System.out.println("a : " + a + " b : " + b + " c : " + c + " d : " + d + " e : " + e);
	}

}
