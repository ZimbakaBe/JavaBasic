package javaCollectionBasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] inputText = scanner.nextLine().split("\\P{Alpha}+");
		ArrayList<String> words = new ArrayList<>();
		
		for(int i = 0; i < inputText.length; i++) {
			
			String currentWord = inputText[i].toLowerCase();
			
			if(!words.contains(currentWord)) {
				words.add(currentWord);
			}
		}
		
		Collections.sort(words);
		
		for(String word : words) {
			System.out.print(word + " ");
		}
		
		scanner.close();
	}

}
