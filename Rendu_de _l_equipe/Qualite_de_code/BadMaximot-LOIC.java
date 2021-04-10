package coursqualiteapplication;

//IMPORT CONNECTIONS 
import java.util.Random;

public class BadMaximot {

	public static void main(String[] args) {
		
		//VARIABLES
		String[] dic = {"FRAISE","BANANE","ORANGE"};
		Random r = new Random();
		int randomIndex = r.nextInt(dic.length);
		String mot = dic[randomIndex];
		
		// USE & ATTRIBUTE MIXER FUNCTION WITH VARIABLE
		String mix = mixer(mot);
		
		// DISPLAY RESULT
		System.out.println(mix);		
	}

	
	// FUNCTION MIX LETTERS
	public static String mixer(String mot) 	{
		
		// VARIABLES
		Random r = new Random();
		char[] m = mot.toCharArray();
		int l = m.length;
	
		// LOOP FOR MIX
		for (int i = 0; i < l * 4; i++) {
			
			// TEMPORARY VARIABLES
			int p1 = r.nextInt(l);
			int p2 = r.nextInt(l);
			char temp = m[p1];
			
			// CHANGE VALUE 
			m[p1] = m[p2];
			m[p2] = temp;
		}
		
		// RETURN MIX RESULT
		return new String(m);
	}
}
