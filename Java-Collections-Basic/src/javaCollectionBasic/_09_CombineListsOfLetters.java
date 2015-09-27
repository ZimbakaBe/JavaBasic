package javaCollectionBasic;

import java.util.ArrayList;
import java.util.Scanner;

public class _09_CombineListsOfLetters {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String inputText = scanner.nextLine();
		String initialTextToAmmend = scanner.nextLine();
		
		ArrayList<String> finalTextToAmmend = new ArrayList<>();

		for(int i = 0; i < initialTextToAmmend.length(); i++) {
			String currentChar = String.valueOf(initialTextToAmmend.charAt(i));
			finalTextToAmmend.add(currentChar);
		}
		
		
		ArrayList<String> ammendedText = new ArrayList<>();
		ammendedText.add(inputText);
		
		for(int i = 0; i < initialTextToAmmend.length(); i++) {
			
			String currentChar = String.valueOf(initialTextToAmmend.charAt(i));
			
			if(inputText.contains(currentChar)) {
				finalTextToAmmend.remove(currentChar);
			}
		}
		
		ammendedText.addAll(finalTextToAmmend);
		
		for(String text : ammendedText) {
			System.out.print(text);
		}
	
		scanner.close();
		
	}

}
