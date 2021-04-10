package fr.ibformation.javase.poo;

public class LauncherStringBuilder {

	public static void main(String[] args) {
		String hobby = "Crossfit";
		
		StringBuilder builder = new StringBuilder();
		builder.append("Erwan est un homme de ");
		builder.append(30);
		builder.append("ans et il pratique le ");
		builder.append(hobby);
		
		System.out.println(builder.toString());
	}

}
