import java.util.Random;
import java.util.Scanner;

public class chifomi_zakaria {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);//methode scanne
		Integer scoreA = 0;//initialisation de score compteur joueur A
		Integer scoreB = 0;//initialisation score compteur  joueur B *0* nest pas dans les choix 1.2.3
		Random r = new Random();// nombre r aleatoir

		while (!(scoreA == 3) && !(scoreB == 3))  // tanque score de joueur A ou joueur B deferent de 3 
		{
			System.out.println("---------------"); // sauter de ligne
			System.out.println("choisir un chiffre entre les trois possibilite");        //message de choix
			System.out.println("* 1-Caillou");                                           //choix 1
			System.out.println("* 2-Ciseaux");                                          //choix 2
			System.out.println("* 3-Feuille");                                          //choix 3
			
			System.out.print("Joueur A: ");
	
			int choixjoueurA = sc.nextInt();                                       // lire numero entrée par l'utilisateur
			
			if ((choixjoueurA==1) || (choixjoueurA==2)|| (choixjoueurA==3) )  //verification numero entree par le joueur a si 1/2/3  
			{
			 
			int choixjoueurB = r.nextInt(3)+1 ;                                  //choix joueur B  aleatoir (machine)
			
			System.out.println("joueur B : "+choixjoueurB );
		
			
			if (choixjoueurA==choixjoueurB)    //si A=B resultat de jeux apres le test egalite si jouerA=jouerB
			{
				System.out.println("rejoue encore une fois resultats = egalite"); 
				
			} 
			// formule Gangante (1-Caillou/ 2-Ciseaux) +(3-Feuille-1-Caillou)+ ( 2-Ciseaux/3-Feuille)
			else if (((choixjoueurA==1) && (choixjoueurB==2))  // resultat de jeux apres le test  jouerA gagne
					|| ((choixjoueurA==3) && (choixjoueurB==1))
					|| ((choixjoueurA==2) && (choixjoueurB==3)) )
			{
				
				scoreA++;
				System.out.println("Joueur A gagne la partie "+scoreA+" fois ");
				if (scoreA==2) {System.out.println("Joueur A il te  reste une partie pour gagner");}
				
		     } 
			
			else if (((choixjoueurB==1) && (choixjoueurA==2))  // resultat de jeux apres le test  jouerA gagne
				|| ((choixjoueurB==3) && (choixjoueurA==1))
				|| ((choixjoueurB==2) && (choixjoueurA==3)) )
			{
				
				scoreB++;
				System.out.println("Joueur B gagne la   "+ scoreB +" fois");
				if (scoreB==2) {System.out.println("Joueur B lui reste une partie pour gagner");}
			}
		 }else  {                                          ///si numero a nest pas 1/2/3 
				System.out.println("le numero choisi n'est pas correct");
				}
			}
		
		
		
		System.out.println("**********************");// Affichage resultats
		System.out.println("    ************");
		System.out.println("  Resultats final  ");
		System.out.println("  Joueu A : " + scoreA);
		System.out.println("  Joueu B : " + scoreB);
		
		if (scoreA < scoreB)                              //si le compteur b > a    
		{
			System.out.println("*********************");
			System.out.println("  joueur *B* gagne le jeu ");
			System.out.println("**********************");
		} 
		else                                              //si le compteur b > a  
		{
			System.out.println("*****************");
			System.out.println("  joueur *A* gagne les troix parti  ");
			System.out.println("*****************");
		}

		sc.close();  //arreter la lecture scanner
	}

	

}

