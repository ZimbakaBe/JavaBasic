package javaCollectionBasic;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numberOfIntegers = scanner.nextInt();
		
		int[] integers = new int[numberOfIntegers];
		
		for(int i = 0; i < numberOfIntegers; i++) {
			integers[i] = scanner.nextInt();
		}
		
		Arrays.sort(integers);
		
		for(int integer : integers) {
			System.out.println(integer);
		}

		scanner.close();
	}

}
