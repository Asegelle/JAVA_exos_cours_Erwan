package fr.ibformation.javase.poo;

import java.util.ArrayList;
import java.util.Date;

public class LauncherGeneric {

	public static void main(String[] args) {
		// Cette ligne produit un warning, mais pour le moment on l'ignore
        // ArrayList collection = new ArrayList();
        // On crée une collection de chaînes de caractères
        ArrayList<String> collection = new ArrayList<String>();
        
        // On y stocke nos chaînes de caractères
        collection.add( "Essai" );
        collection.add( "Cours Java" );
        collection.add( "Tutoriel Java" );
            
        // collection.add( new Date() ); // Plus possible avec la généricité
    
        // Maintenant on parcourt la collection
        for ( Object value : collection ) {
            System.out.println( value );
        }

	}

}
