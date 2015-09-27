package javaCollectionBasic;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class _11_MostFrequentWord {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] inputText = scanner.nextLine().toLowerCase().split("\\P{Alpha}+");
		
		Map<String, Integer> nameAndCount = new HashMap<>();
		
		for(String text : inputText) {
			
			Integer count = nameAndCount.get(text);
			
			if(count == null) {
				nameAndCount.put(text, 1);
			}
			else {
				nameAndCount.put(text, ++count);
			}
		}
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.putAll(nameAndCount);
		
		int maxValue = Collections.max(map.values());
		
		for(Entry<String, Integer> entry : map.entrySet()) {
			
			if(entry.getValue() == maxValue) {
				System.out.println(entry.getKey() + " -> "+ entry.getValue() + " times");
			}
		}
		
		scanner.close();
	}
}
