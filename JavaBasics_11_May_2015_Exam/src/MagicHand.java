import java.util.Arrays;
import java.util.Scanner;

public class MagicHand {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] cards = new String[] {"*", "*", "2", "3", "4", "5", "6", "7", "8", "9", "10", "*", "J", "Q", "K", "A"};
		String[] input = scanner.nextLine().split(" ");
		String oddEven = scanner.nextLine();
		String magicCard = scanner.nextLine();
		int sum = 0;
		
		String magicCardFace = magicCard.substring(0, magicCard.length() - 1);
		String magicCardSuit = magicCard.substring(magicCard.length() - 1, magicCard.length());
		int startPosition = oddEven.equals("odd") ? 1 : 0;
		
		for(int i = startPosition; i < input.length; i += 2) {
			String cardFace = input[i].substring(0, input[i].length()-1);
			String cardSuit = input[i].substring(input[i].length()-1, input[i].length());
			
			int value = Arrays.asList(cards).indexOf(cardFace)*10;
			
			if(cardFace.equals(magicCardFace)) {
				value *= 3;
			}
			if(cardSuit.equals(magicCardSuit)) {
				value *= 2;
			}
			
			sum += value;
		}
		
		System.out.println(sum);
		
		scanner.close();
	}
}
