package fr.ibformation.projectTwo;

//IMPORT CONNECTIONS 
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.IllegalArgumentException;
//import java.util.Locale;

public class Launcher5 {

	public static void main(String[] args) {
		
		//VARIABLES
		int x,y;
		int playerPoint=0;
		int iaPoint=0;		
		int essai=0;
		String[] PFC=new String[3];
		PFC[0]="PIERRE";
		PFC[1]="FEUILLE";
		PFC[2]="CISEAUX";
		
		// GAME TURNS
		do {
			x=getRandomInt(1,3); // CALL FUNCTION RANDOM
			essai++;
			
			// INVITE PLAYER
			System.out.println("");
			System.out.println("Essai n°"+essai+" : 1-Pierre, 2-Feuille, 3-Ciseaux");
			
			// PICK-UP SCAN
			Scanner scannerY=new Scanner(System.in);
			y=scannerY.nextInt();			
			
			// SCAN ANALYSIS & EARN A POINT
			if(y==x || y<1 || y>3) essai--;
			else if(y>x || (y==1 && x==3)) playerPoint++; 
			else iaPoint++;	
			
			// DISPLAY RANDOM
			System.out.println("L'IA avait choisi "+PFC[x-1]);	//System.out.println("Humain : "+playerPoint+" - IA : "+iaPoint);
		} while(essai<5);
		
		// END GAME DISPLAY 
		System.err.println("");
		if(playerPoint>iaPoint) System.err.println("Victoire de l'humain : "+playerPoint+"-"+iaPoint); 
		else System.err.println("Victoire de l'IA : "+iaPoint+"-"+playerPoint); 
	}
	
	// FUNCTION RANDOM
    private static int getRandomInt(int min, int max) {
        if (min>=max) {
            throw new IllegalArgumentException("Le Max doit être supérieur au minimum"); // (TO TEST)
        }
        return (int)(Math.random()*((max-min)+1))+min;
    }    
}