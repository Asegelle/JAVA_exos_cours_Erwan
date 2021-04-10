package fr.ibformation.javase.poo;

import fr.ibformation.javase.bo.RoleStatic;

public class LauncherStatic {

	public static void main(String[] args) {
		// RoleStatic role = new RoleStatic(); // Pas besoin avec static
	
		RoleStatic.displayRole();
		RoleStatic.changeRole("Admin");
		RoleStatic.displayRole();
		
	}

}
