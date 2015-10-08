import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Weightlifting {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		TreeMap<String, TreeMap<String,Integer>> weightlifting = new TreeMap<String, TreeMap<String,Integer>>();
		
		for(int i = 0; i < n; i ++) {
			
			String[] input = scanner.nextLine().split(" ");
			String name = input[0];
			String exercise = input[1];
			int kilograms = Integer.parseInt(input[3]);
			
			if(!weightlifting.containsKey(name)) {
				weightlifting.put(name, new TreeMap<String,Integer>());
				weightlifting.get(name).put(exercise, kilograms);
			}
			else {
				if(!weightlifting.get(name).containsKey(exercise)) {
					weightlifting.get(name).put(exercise, kilograms);
				}
				else {
					int oldWeight = weightlifting.get(name).get(exercise);
					weightlifting.get(name).put(exercise, kilograms + oldWeight);
				}
			}
		}
		
		Set<String> keys = weightlifting.keySet();
		
		for(String key : keys) {
			System.out.printf("%s : ", key);
			
			TreeMap<String, Integer> results = weightlifting.get(key);
			Set<String> exercises = results.keySet();
			
			boolean isFirst = true;
			for(String exercise : exercises) {
				int totalWeights = results.get(exercise);
				if(!isFirst) {
					System.out.print(", ");
				}
				
				isFirst = false;
				
				System.out.printf("%s - %d kg", exercise, totalWeights);
			}
			System.out.println();
		}
	}
}
