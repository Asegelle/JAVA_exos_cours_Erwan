package fr.ibformation.javase.poo;

import java.util.logging.Logger;

public class LauncherLogger {
	
	public static Logger logger = Logger.getLogger("LauncherLogger");
	public static int numberValue = 1; 

	public static void main(String[] args) {
		logger.info("Hello info");
		logger.warning("Hello warning");
		logger.severe("Hello error");
		logger.fine("Hello debug");
		
		try {
			// Tout se passe bien
			changeNumberValue();
		} catch (Exception e) {
			// Il y eu un problème
			logger.severe("Il y eu un soucis avec changeNumberValue");
		}
	}
	
	public static void changeNumberValue() {
		numberValue = 2;
	}

}
