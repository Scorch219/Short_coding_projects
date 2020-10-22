package Questions;

import java.util.LinkedList;

public class FirstReccuringChar_v2 {

	public static void main(String[] args) {
		String str = "letter";

		char answer = findFirstRecurrence(str);
		
		System.out.println(answer);
	}

//************************************************************************************************************************

	private static char findFirstRecurrence(String str) {
		LinkedList<Character>lOccur = new LinkedList<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			if (lOccur.contains(str.charAt(i))) {
				return str.charAt(i);
			}
			else {
				lOccur.add((Character)str.charAt(i));
			}
				
		}
		return ' ';
	}
}
