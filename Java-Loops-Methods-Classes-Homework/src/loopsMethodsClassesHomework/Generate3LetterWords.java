package loopsMethodsClassesHomework;
import java.util.Scanner;

public class Generate3LetterWords {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String inputCharacters = input.nextLine();
		
		printThreeLetterWordsFromTwoAndThreeCharacters(inputCharacters);
		
		input.close();
	}
	
	public static void printThreeLetterWordsFromTwoAndThreeCharacters(String inputCharacters) {
		
		String[] words = new String[(int) Math.pow(inputCharacters.length(), 3)];
		int currentElement = 0;

		if(inputCharacters.length() == 1) {
			String initialWord = inputCharacters;
			words[0] = initialWord + initialWord + initialWord;
		}
		else {
			for(int i = 0; i < inputCharacters.length(); i++) {
				for(int j = 0; j < inputCharacters.length(); j++) {
					for(int k = 0; k < inputCharacters.length(); k++) {
						
						words[currentElement] = Character.toString(inputCharacters.charAt(i)) + 
												Character.toString(inputCharacters.charAt(j)) + 
												Character.toString(inputCharacters.charAt(k)); 
						currentElement++;
					}
				}
			}
		}
		
		for(String word : words) {
			System.out.println(word);
		}
		
	}
}
