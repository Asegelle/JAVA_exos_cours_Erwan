package Challanges;


import java.util.Random;

public class BadMaximotBedissNahdi {
		
	
	// Fonction Principale
	public static void main(String[] args) {
		// D�clation d'un tableau de chaine de carcat�re
		String[] tableauFruits = {"FRAISE","BANANE","ORANGE","B�diss"};
		
		// D�claration d'une variable al�atoire : Random (Al�atoire)
		Random motChoisiAleatoirement = new Random();
		
		
		// Fonction en ordre indissociable  // 
			// Obtenir un �l�ment al�atoire du tableau "dic"
		
			// Affecter les lettres chang�es dans chaque case de fa�on al�atoire
		int randomIndex = motChoisiAleatoirement.nextInt(tableauFruits.length);
		
			// Affecter les lettres chang�es dans chaque case
		String fruitMixe = tableauFruits[randomIndex];
		
			// Mixer les lettres
		String fruitDesordre = mixer(fruitMixe);
		
		
		
		// Afficher le mix des lettres
		System.out.println(fruitDesordre);
	}
	
	
	// Fonction prend un mot  PUIS l'affecte dans un tableau en carcatere Puis change les carcateres en al�atoire
	public static String mixer(String motSaisie) {
			// D�claration d'une variable al�atoire : Random (Al�atoire) 
		// TODO / Port�e GLOBALE 
			Random r = new Random();
			
			// D�claration de variable convertir les charat�res EN TABLEAU chaque carcat�re dans une case
			char[] motDecomposeCarcatere = motSaisie.toCharArray();
			
			// D�finition de la longeur du tableau (ci-dessus)
			int l = motDecomposeCarcatere.length;
			
			// Boucle /it�ration
			for (int i = 0; i < l * 4; i++) {
				// D�claration + initiation de deux variables en al�atoire  //+// une variable temporaire
				int p1 = r.nextInt(l);
				int p2 = r.nextInt(l);
				
				// Changement des emplacements de lettres
				char temp = motDecomposeCarcatere[p1];
				motDecomposeCarcatere[p1] = motDecomposeCarcatere[p2];
				motDecomposeCarcatere[p2] = temp;
			}
			
		return new String(motDecomposeCarcatere); // retourne les carcateres en al�atoire d'un "fruitParam" 
	}
	
		
}