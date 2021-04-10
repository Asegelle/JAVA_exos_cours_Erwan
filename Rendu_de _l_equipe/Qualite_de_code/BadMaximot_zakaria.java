
package coursqualiteapplication;

import java.util.Random;



public class BadMaximot_zakaria {
	
	public static Random r = new Random();// methode nombre aleatoire
	
	public static void main(String[] args) 
	
	{		
		
		String[] dic = {"FRAISE","BANANE","ORANGE"};//tableau rempli fraise/banane/orange
	
		int randomIndex = r.nextInt(dic.length); //changeur d'index random
		
		String mot = dic[randomIndex];//mots choisi parmi les fruit propose  ( soit fraise /banane/orange)

		System.out.println(mixer(mot));//afficher le mots depeuis la methode mixer 
	
	}

	public static String mixer(String mot) {

			char[] mots = mot.toCharArray();      //tableau rempli un de cest proposition fraise/banane/orange
			int longeur = mots.length;           //longeur du mot
			for (int i = 0; i < longeur * 4; i++)  //boucle de mixage affectation dans la table qui as la meme taille de mots
			{
				int p1 = r.nextInt(longeur);//index aleatoire p1 <longeur
			int p2 = r.nextInt(longeur);//index aleatoire p2 <longeur
			char temp =mots[p1];  //temp caracterre case temporaire 
			mots[p1] = mots[p2];
			mots[p2] = temp;}
			return new String(mots);
			
			}
}