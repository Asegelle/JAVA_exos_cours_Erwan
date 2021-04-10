package fr.ibformation.javase.fichiers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LauncherSelectWordIntoDictionnary {

	public static void main(String[] args) {
		String wordChoosed = selectWordIntoDictionnary(2000);
		
		System.out.println(wordChoosed);
	}
	
	public static String selectWordIntoDictionnary(int lineChoosed) {
		try (
			FileInputStream fichier = new FileInputStream("files/dictionnaire.txt"); // This will be automaticaly closed when the try / catch is finished with this syntax
			Scanner s = new Scanner(fichier); // This will be automaticaly closed when the try / catch is finished with this syntax
		) {
			for (int i = 0; i < lineChoosed; i++) {
				s.nextLine(); // Browse file to the line before the lineChoosed
			}
			
			return s.nextLine().toUpperCase(); // Return word String with uppercase letters
		} catch (IOException e) {
			System.out.println("[DemoFile] numberOfLineIntoFile : An error from count the number of words into file !");
			System.out.println(e);
		}
		return null;
	}

}
