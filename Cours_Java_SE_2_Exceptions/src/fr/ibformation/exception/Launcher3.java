package fr.ibformation.exception;

import fr.ibformation.exception.bo.User;

public class Launcher3 {

	public static void main(String[] args) {
		try {
			User user = null;
			getName(user);
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Il y eu une erreur !");
		}
	}
	
	public static void getName(User user) throws NullPointerException {
		if (user == null) {
			throw new NullPointerException("Toto");
		} else {
			System.out.println(user.name);			
		}
	}

}
