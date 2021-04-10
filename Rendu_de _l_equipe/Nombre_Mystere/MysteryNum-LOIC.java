package fr.ibformation.projectTwo;

// IMPORT CONNECTIONS 
import java.util.Scanner;
import java.util.InputMismatchException;
//import java.util.IllegalArgumentException;
//import java.util.Locale;

public class Launcher3 {

	public static void main(String[] args) {
		
		// VARIABLES
		int x=getRandomInt(1,100);
		int y;	
		int essai=0;
		
		// GAME TURNS
		do {
			essai++;
			// INVITE PLAYER
			System.out.println("Tentez de trouver le nombre myst�re (1-100)");	
			
			// PICK-UP SCAN
			Scanner scannerY=new Scanner(System.in);
			y=scannerY.nextInt();
			
			// SCAN ANALYSIS & TURN RESULT			
			if(y>x) System.out.println("Le nombre myst�re est inf�rieur � "+y);	
			else if (y < x) System.out.println("Le nombre myst�re est sup�rieur � "+y);				
		} while(y!=x && essai<8);
		
		// END GAME DISPLAY
		if(x==y) System.out.println("Bravo");
		else System.out.println("Vous n'avez que 7 essais possible");
		System.out.println("Le nombre myst�re �tait "+y);	
	}
	

	// FUNCTION RANDOM
	private static int getRandomInt(int min, int max) {
        if (min>=max) {
            throw new IllegalArgumentException("Le Max doit �tre sup�rieur au minimum");
        }
        return (int)(Math.random()*((max-min)+1))+min;
    }
}