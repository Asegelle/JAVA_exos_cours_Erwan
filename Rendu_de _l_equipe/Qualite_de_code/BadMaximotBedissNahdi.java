package Challanges;


import java.util.Random;

public class BadMaximotBedissNahdi {
		
	
	// Fonction Principale
	public static void main(String[] args) {
		// Déclation d'un tableau de chaine de carcatère
		String[] tableauFruits = {"FRAISE","BANANE","ORANGE","Bédiss"};
		
		// Déclaration d'une variable aléatoire : Random (Aléatoire)
		Random motChoisiAleatoirement = new Random();
		
		
		// Fonction en ordre indissociable  // 
			// Obtenir un élément aléatoire du tableau "dic"
		
			// Affecter les lettres changées dans chaque case de façon aléatoire
		int randomIndex = motChoisiAleatoirement.nextInt(tableauFruits.length);
		
			// Affecter les lettres changées dans chaque case
		String fruitMixe = tableauFruits[randomIndex];
		
			// Mixer les lettres
		String fruitDesordre = mixer(fruitMixe);
		
		
		
		// Afficher le mix des lettres
		System.out.println(fruitDesordre);
	}
	
	
	// Fonction prend un mot  PUIS l'affecte dans un tableau en carcatere Puis change les carcateres en aléatoire
	public static String mixer(String motSaisie) {
			// Déclaration d'une variable aléatoire : Random (Aléatoire) 
		// TODO / Portée GLOBALE 
			Random r = new Random();
			
			// Déclaration de variable convertir les charatères EN TABLEAU chaque carcatère dans une case
			char[] motDecomposeCarcatere = motSaisie.toCharArray();
			
			// Définition de la longeur du tableau (ci-dessus)
			int l = motDecomposeCarcatere.length;
			
			// Boucle /itération
			for (int i = 0; i < l * 4; i++) {
				// Déclaration + initiation de deux variables en aléatoire  //+// une variable temporaire
				int p1 = r.nextInt(l);
				int p2 = r.nextInt(l);
				
				// Changement des emplacements de lettres
				char temp = motDecomposeCarcatere[p1];
				motDecomposeCarcatere[p1] = motDecomposeCarcatere[p2];
				motDecomposeCarcatere[p2] = temp;
			}
			
		return new String(motDecomposeCarcatere); // retourne les carcateres en aléatoire d'un "fruitParam" 
	}
	
		
}