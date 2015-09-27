package javaCollectionBasic;

import java.util.regex.*;
import java.util.Scanner;

public class CountAllWords {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		Pattern pattern = Pattern.compile("(\\w+)");
		Matcher matcher = pattern.matcher(input);
		int count = 0;
		
		while(matcher.find()) {
			count++;
		}
		
		System.out.println(count);
		
		scanner.close();
	}

}
