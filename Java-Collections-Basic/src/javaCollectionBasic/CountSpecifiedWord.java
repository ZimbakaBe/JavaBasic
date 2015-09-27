package javaCollectionBasic;

import java.util.Scanner;
import java.util.regex.*;

public class CountSpecifiedWord {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine().toLowerCase();
		String wordToSearchFor = scanner.nextLine();
		Pattern pattern = Pattern.compile("\\s*(" + wordToSearchFor + ")+\\'|\\'(" + wordToSearchFor + ")+\\s*|\\s*(" + wordToSearchFor + ")+\\s+");
		Matcher matcher = pattern.matcher(input);
		int count = 0;
		
		while(matcher.find()){
			count++;
		}
		
		System.out.println(count);
		
		scanner.close();
	}

}
