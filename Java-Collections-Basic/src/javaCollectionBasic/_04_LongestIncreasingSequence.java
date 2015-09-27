package javaCollectionBasic;
import java.util.Scanner;
import java.util.ArrayList;

public class _04_LongestIncreasingSequence {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] inputAsString = scanner.nextLine().split(" ");
		int[] inputAsInteger = new int[inputAsString.length];
		
		for(int i = 0; i < inputAsInteger.length; i++) {
			inputAsInteger[i] = Integer.valueOf(inputAsString[i]);
		}
		
		ArrayList<Integer> currentSequence = new ArrayList<>();
		ArrayList<Integer> longestSequence = new ArrayList<>();
		
		currentSequence.add(inputAsInteger[0]);
		
		for(int i = 0; i < inputAsInteger.length; i++) {
			
			if(i < inputAsInteger.length - 1) {
				if(inputAsInteger[i + 1] > inputAsInteger[i]) {
					currentSequence.add(inputAsInteger[i+1]);
				}
				else {
					if(currentSequence.size() > longestSequence.size()) {
						
						for(int integer : longestSequence) {
//							if(longestSequence.size() > 0) {
							System.out.print(integer + " ");
						}
						longestSequence = currentSequence;
					}
					else {
						for(int integer : currentSequence) {
							System.out.print(integer + " ");
						}
						System.out.println();
					}
	
					currentSequence = new ArrayList<>();
					currentSequence.add(inputAsInteger[i + 1]);
				}
			}
			else {
				if(currentSequence.size() > longestSequence.size()) {
					for(int integer : longestSequence) {
						System.out.print(integer + " ");
					}
					
					System.out.println();
					System.out.print("Longest: ");
					for(int integer: currentSequence) {
						System.out.print(integer + " ");
					}
				}
				else {
					for(int integer: currentSequence) {
						System.out.print(integer + " ");
					}
					System.out.println();
					System.out.print("Longest: ");
					for(int integer : longestSequence) {
						System.out.print(integer + " ");
					}
				}
			}
		}

	}

}
