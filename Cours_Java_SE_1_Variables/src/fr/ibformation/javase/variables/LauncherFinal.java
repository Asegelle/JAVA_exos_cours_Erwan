package fr.ibformation.javase.variables;

public class LauncherFinal {

	public static String lastName = "Bacon"; // D�claration et affectation
	public static final String ROLE = "Developper"; // D�claration et affection d'une constante gr�ce au final
	
	public static void main(String[] args) {
		lastName = "Baccon"; // Marche car la variable n'est pas une constante
		// ROLE = "Admin"; // Ne marche pas car c'est une constante, on ne souhaite pas la changer
	}

}
