package fr.ibformation.javase.variables;

public class LauncherCast {

	public static void main(String[] args) {
		int number1 = 4;
		int number2 = 31;
		double number3 = 4.21;
		
		
		
		int resultInt = (number1 + number2) / 2;
		System.out.println(resultInt);
		
		double resultDouble = (number1 + number2) / 2;
		System.out.println(resultDouble);
		
		double resultDouble2 = (double)(number1 + number2) / 2;
		System.out.println(resultDouble2);
		
		double resultDouble3 = (number1 + number2) / 2.0;
		System.out.println(resultDouble3);
		
		int manualCast = (int) number3;
		System.out.println(manualCast);
		
		
		// PARSING
		String number1String = "2";
		
		double resultDoubleParsing = (Integer.parseInt(number1String) + number2) / 2;
		System.out.println("resultDoubleParsing " + resultDoubleParsing);
	}

}
