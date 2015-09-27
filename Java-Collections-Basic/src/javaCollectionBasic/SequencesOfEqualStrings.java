package javaCollectionBasic;

import java.util.*;

public class SequencesOfEqualStrings {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] elements = scanner.nextLine().split(" ");
		
//		Arrays.sort(elements);
		
		ArrayList<String> equalElements = new ArrayList<>();
		equalElements.add(elements[0]);
		String previousElement = elements[0];
		
		for(int i = 1; i < elements.length + 1; i++) {
			
			if(i < elements.length) {
				if(previousElement.equals(elements[i])) {
					equalElements.add(elements[i]);
				}
				else {
					for(String element : equalElements) {
						System.out.print(element + " ");
					}
					System.out.println();
					equalElements = new ArrayList<>();
					equalElements.add(elements[i]);
				}
				previousElement = elements[i];
			}
			else {
				for(String element : equalElements) {
					System.out.print(element + " ");
				}
			}
		}
		
		scanner.close();
	}

}
