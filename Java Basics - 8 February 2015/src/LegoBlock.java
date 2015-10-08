import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LegoBlock {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int rows = Integer.parseInt(scanner.nextLine());
		
		String[][] firstJaggedArray = new String[rows][];
		String[][] secondJaggedArray = new String[rows][];
		
		List<String> firstArray = new ArrayList<>();
		List<String> secondArray = new ArrayList<>();
		
		for(int row = 0; row < rows; row++) {
			
			String[] numbers = scanner.nextLine().split(" ");
			
			for(String number : numbers) {
				firstArray.add(number);
			}
			
			firstJaggedArray[row] = firstArray.toArray(new String[firstArray.size()]);
			firstArray = new ArrayList<>();
			
		}
		
		for(int row = 0; row < rows; row++) {
			
			String[] numbers = scanner.nextLine().split(" ");
			
			for(String number : numbers) {
				secondArray.add(number);
			}
			
			Collections.reverse(secondArray);
			secondJaggedArray[row] = secondArray.toArray(new String[secondArray.size()]);
			secondArray = new ArrayList<>();
		}
		
		int lenght = firstJaggedArray[0].length + secondJaggedArray[0].length;
		boolean isMatch = true;
		
		for(int i = 1; i < rows; i++) {
			if(firstJaggedArray[i].length + secondJaggedArray[i].length != lenght) {
				isMatch = false;
			}
		}
		
		if(isMatch) {
			for(int i = 0; i < rows; i++) {
				StringBuilder sb = new StringBuilder();
				for(String array : firstJaggedArray[i]) {
					sb.append(array);
				}
				for(String array : secondJaggedArray[i]) {
					sb.append(array);
				}
				System.out.println("[" + String.join(", ", sb) + "]");
				sb = new StringBuilder();
			}
		} else {
			int sum = 0;
			for(int i = 0; i < rows; i++) {
				sum += firstJaggedArray[i].length + secondJaggedArray[i].length;
			}
			System.out.println("The total number of cells is: " + sum);
		}
		
		scanner.close();
	}

}
