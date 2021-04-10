package fr.ibformation.javase.variables;

/**
 * Demo for Java Documentation
 * @author erwan
 */
public class LauncherJavaDocumentation {
	// -----------------------------------------------------------------------------
	// VOIR https://openclassrooms.com/fr/courses/1115306-presentation-de-la-javadoc
	// -----------------------------------------------------------------------------

	/**
	 * The name of java documentation
	 */
	public String name;

	public static void main(String[] args) {
		System.out.println(compareNumber(1,2));
		System.out.println(compareNumber(1,1));
	}

	/**
	 * Compare <strong>two number</strong> 
	 * @param numberArg First number to compare
	 * @param numberArgToCompare Second number to compare
	 * @return the result
	 * @since 0.1
	 */
	public static boolean compareNumber(int numberArg, int numberArgToCompare) {
		return numberArg == numberArgToCompare;
	}

}
