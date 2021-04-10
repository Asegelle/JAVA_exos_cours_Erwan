package fr.ibformation.javase.bo;

public class RoleStatic {
	public static String role = "Developper";
	public static final String OTHER = "Other";
	
	public static void displayRole() {
		System.out.println(role);
	}
	
	public static void changeRole(String newRoleParam) {
		role = newRoleParam;
	}
}
