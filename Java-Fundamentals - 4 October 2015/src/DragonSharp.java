import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DragonSharp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int lines = Integer.parseInt(scanner.nextLine());
		ArrayList<String> list = new ArrayList<>();
		boolean isTrue = true;
		String[] input = new String[lines];
		for(int i = 0; i < lines; i++) {
			
			String line = scanner.nextLine();
			
			Pattern pattern = Pattern.compile("\"(\\w*\\s*)*\";");
			Matcher match = pattern.matcher(line);
			int countLine = i + 1;
			
			if(!match.find()) {
				System.out.println("Compile time error @ line " + countLine);
				isTrue = false;
				break;
			}
			input[i] = line;
		}
		
		boolean isElse = true;
		
		if(isTrue) {
			
			for(int i = 0; i < input.length; i++) {
				
				String[] inputSplit = input[i].split(" ");
				String output = "";
				Pattern pattern = Pattern.compile("(\\p{Punct})");
				Matcher matches = pattern.matcher(input[i]);
				
				if(inputSplit[0].equals("if")) {
						switch(inputSplit[1].charAt(2)) {
						case '=':
							if(inputSplit[1].charAt(1) == inputSplit[1].charAt(4)) {
								if(inputSplit[2].equals("loop")) {
									output = input[i].substring(22, input[i].length() - 2);
									int counter = Integer.parseInt(inputSplit[3]);
									for(int j = 0; j < counter; j++) {
										System.out.println(output);
									}
								}
								else {
									output = input[i].substring(15, input[i].length() - 2);
									System.out.println(output);
								}
							}
							else {
								isElse = false;
							}
							break;
						case '>':
							if(inputSplit[1].charAt(1) > inputSplit[1].charAt(4)) {
								if(inputSplit[2].equals("loop")) {
									output = input[i].substring(22, input[i].length() - 2);
									int counter = Integer.parseInt(inputSplit[3]);
									for(int j = 0; j < counter; j++) {
										System.out.println(output);
									}
								}
								else {
									output = input[i].substring(15, input[i].length() - 2);
									System.out.println(output);
								}
							}
							else {
								isElse = false;
							}
							break;
						case '<':
							if(inputSplit[1].charAt(1) < inputSplit[1].charAt(4)) {
								if(inputSplit[2].equals("loop")) {
									output = input[i].substring(22, input[i].length() - 2);
									int counter = Integer.parseInt(inputSplit[3]);
									for(int j = 0; j < counter; j++) {
										System.out.println(output);
									}
								}
								else {
									output = input[i].substring(15, input[i].length() - 2);
									System.out.println(output);
								}
							}
							else {
								isElse = false;
							}
							break;
						}
				}
				else {
					if(isElse == false) {
						if(inputSplit[1].equals("loop")) {
							String outputIfElse = input[i].substring(17, input[i].length() - 2);
							int counter = Integer.parseInt(inputSplit[2]);
							for(int j = 0; j < counter; j++) {
								System.out.println(outputIfElse);
							}
						}
						else {
							String outputIfElse = input[i].substring(10, input[i].length() - 2);
							System.out.println(outputIfElse);
						}
					}
				}

			}
		}
	}
}
