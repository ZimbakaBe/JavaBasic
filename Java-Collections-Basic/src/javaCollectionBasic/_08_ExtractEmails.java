package javaCollectionBasic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _08_ExtractEmails {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		Pattern pattern = Pattern.compile("[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*@[A-Za-z0-9-]+(\\.[A-Z-a-z0-9]+)*(\\.[A-Za-z]{2,})", 
				Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(input);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
		scanner.close();	
	}

}
