import java.util.Random;

public class BadMaximot {
	
	public static Random r = new Random();
		
	public static void main(String[] args) {
		
		
			// Création d'une liste et initialisation des valeurs
			String[] word = new String[3];
			word[0] = "FRAISE";
			word[1] = "BANANE";
			word[2] = "ORANGE";
			
			//Permet de choisir un index aléatoire dans la liste word
			int randomIndex = r.nextInt(word.length);
			
			//Affecte l'index à une nouvelle variable
			String randomWord = word[randomIndex];
			
			//Fait appel à la fonction mixer
			String mix = mixer(randomWord);
			
			//affiche le résultat 
			System.out.println(mix);
		}
		
	public static String mixer(String randomWord) {
			
			//Permet de récupérer les lettres du mot aléatoire et de les stocker dans une liste
			char[] letter = randomWord.toCharArray();
			final int l = letter.length;
			
			//Boucle suivant le nombre de lettre du mot récupéré
			for (int i = 0; i < l; i++) {
				
				//rentre en paramètre deux variables aléatoires
				int param1 = r.nextInt(l);
				int param2 = r.nextInt(l);
				
				//Permet d'interchanger les lettres du mot récupérer
				char temp = letter[param1];
				letter[param1] = letter[param2];
				letter[param2] = temp;
				
			}
		return new String(letter);
		}
}
	

