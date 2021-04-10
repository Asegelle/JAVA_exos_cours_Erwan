package fr.ibformation.exception;

public class LauncherExercice2Final {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		String price = "50€";
		
		try {
			numbers[1] = 12;
			numbers[2] = 25;
			numbers[3] = Integer.parseInt(price);
			numbers[4] = 42;
			numbers[5] = 34;
		} catch (NumberFormatException e) {
			System.err.println("Erreur dans le prix");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Erreur dans l'index du tableau");
			e.printStackTrace();
		} finally {
			System.out.println("Le programme est terminé");
		}
		
		

	}

}
