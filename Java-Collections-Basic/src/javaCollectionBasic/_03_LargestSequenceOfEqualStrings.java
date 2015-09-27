package javaCollectionBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _03_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] inputString = scanner.nextLine().split(" ");
		
		ArrayList<String> largestSequence = new ArrayList<>();
		ArrayList<String> currentSequence = new ArrayList<>();
		currentSequence.add(inputString[0]);
		
		String previousElement = inputString[0];
		
		for(int i = 1; i < inputString.length + 1; i++) {
			
			if(i < inputString.length) {
				if(previousElement.equals(inputString[i])) {
					currentSequence.add(inputString[i]);
				}
				else {
					if(currentSequence.size() > largestSequence.size()) {
						largestSequence = new ArrayList<String>();
						largestSequence = currentSequence;
					}
					currentSequence = new ArrayList<String>();
					currentSequence.add(inputString[i]);
				}
				previousElement = inputString[i];
			}
		}
		
		if(currentSequence.size() > largestSequence.size()) {
			largestSequence = new ArrayList<String>();
			largestSequence = currentSequence;
		}
		
		for(String sequence : largestSequence) {
			System.out.print(sequence + " ");
		}
		
		scanner.close();
	}
}
