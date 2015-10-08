import java.util.Scanner;

public class Enigma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int countOfLines = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < countOfLines; i++) {
			
			String line = scanner.nextLine();
			
			String symbols = line.replaceAll("\\s*\\d*", "");
			int length = symbols.length()/2;
			
			for(int j = 0; j < line.length(); j++) {
				if(Character.isDigit(line.charAt(j))) {
					System.out.print(line.charAt(j));
				}
				else if (line.charAt(j) == ' ') {
					System.out.print(line.charAt(j));
				}
				else {
					int ascii = (int)line.charAt(j);
					System.out.print((char)(ascii + length));
				}
			}
			System.out.println();
		}
	}

}
