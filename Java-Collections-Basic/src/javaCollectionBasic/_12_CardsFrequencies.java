package javaCollectionBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _12_CardsFrequencies {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String inputText = scanner.nextLine();
		Pattern pattern = Pattern.compile("([2-9JQKA]|10)");
		Matcher matcher = pattern.matcher(inputText);
		ArrayList<String> cards = new ArrayList<>();
		
		for(int i = 0; i < inputText.length(); i++) {
			if(matcher.find()) {
				cards.add(matcher.group());
			}
		}
		
		HashMap<String, Integer> cardAndCount = new HashMap<>();
		
		for(String card : cards) {
			
			Integer count = cardAndCount.get(card);
			
			if(count == null) {
				cardAndCount.put(card, 1);
			}
			else {
				cardAndCount.put(card,++count);
			}
		}
		
		int cardsCount = cards.size();
		
		for(Entry<String, Integer> entry : cardAndCount.entrySet()) {
			
			double getPercentage = (double)(entry.getValue()*100)/cardsCount;
			
			System.out.printf(entry.getKey() + " -> %.2f" + "%%", getPercentage);
			System.out.println();
		}
		
		scanner.close();
	}
}
