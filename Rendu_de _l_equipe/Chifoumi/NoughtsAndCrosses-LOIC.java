package fr.ibformation.projectTwo;

//IMPORT CONNECTIONS 
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class Launcher2 {

	public static void main(String[] args) {	
		
		// VARIABLES
		int[][] morpions = new int[3][3];
		byte x, y;	
		byte player=1;
		boolean gameProcess=true;		
		final String SEPARATEUR = ",";
		String messError="";	
		
		// PASS A LINE
		System.out.println(""); 
		
		// GAME TURNS
		while(gameProcess) {
			
			// DISPLAY NOUGHTS AND CROSSES
			printTab(morpions); 

			// INVITE PLAYER
			System.out.println("");
			System.out.println(messError);
			System.out.println("Joueur "+player+", dans quelle case voulez-vous jouer ?");
			
			// PICK-UP SCAN
			Scanner scannerCoord = new Scanner(System.in);
			String coord = scannerCoord.next();
			
			// SCAN TREATMENT
			String coordo[] = coord.split(SEPARATEUR);
			if(coordo[0].equalsIgnoreCase("A")) {
				x=0;
			} else if (coordo[0].equalsIgnoreCase("B"))  {
				x=1;
			} else if (coordo[0].equalsIgnoreCase("C"))  {
				x=2;
			} else {
				x=-1;
			}
			
			y=(byte)Integer.parseInt(coordo[1]);
			y--;
			
			// SCAN ANALYSIS			
			if(x>=0 && x<=2 && y>=0 && y<=2 && morpions[x][y]!=1 && morpions[x][y]!=2) {
				
				morpions[x][y]=player; // INCREMENT PLAYER CHOICE
				
				// VICTORY TEST
				if(testRow(morpions)) {
					gameProcess=false; 
				} else {
					if(player<2) player++; 
					else player--;
				}
				messError="";			
			} else {
				// TYPING ERROR
				messError="Case "+coordo[0]+"-"+coordo[1]+" inconnue ou dejà occupée, joueur "+player+" doit rejouer";	
			}
		}
		
		// END GAME DISPLAY 
		printTab(morpions);
		System.out.println("");
		System.out.println("");
		System.out.println("Victoire du joueur "+player);
	}

	// FUNCTION DISPLAY NOUGHTS AND CROSSES
	public static void printTab(int[][] tab) {
		System.out.println("       | A || B || C |");
	
		for(int i=0; i<3; i++) {
			System.out.println("");
			System.out.print("| "+(i+1)+" |  ");
			for(int j=0; j<3; j++) {
				if(tab[j][i]==1) {
					System.out.print("| X |");
				} else if(tab[j][i]==2) {
					System.out.print("| O |");
				} else {
					System.out.print("|   |");
				} 
			}			
		}		
	}
	
	// FUNCTION VICTORY TEST 
	public static boolean testRow(int[][] tab) {
		if((tab[0][0]>0 && tab[0][0]==tab[0][1] && tab[0][1]==tab[0][2]) ||
				(tab[1][0]>0 && tab[1][0]==tab[1][1] && tab[1][1]==tab[1][2]) ||
				(tab[2][0]>0 && tab[2][0]==tab[2][1] && tab[2][1]==tab[2][2]) ||
		  	    (tab[0][0]>0 && tab[0][0]==tab[1][0] && tab[1][0]==tab[2][0]) ||
                (tab[0][1]>0 && tab[0][1]==tab[1][1] && tab[1][1]==tab[2][1]) ||
                (tab[0][2]>0 && tab[0][2]==tab[1][2] && tab[1][2]==tab[2][2]) ||
                (tab[0][0]>0 && tab[0][0]==tab[1][1] && tab[1][1]==tab[2][2]) ||
                (tab[0][2]>0 && tab[0][2]==tab[1][1] && tab[1][1]==tab[2][0])) {
			return true;
		}
		else {
			return false;
		}
	}
}