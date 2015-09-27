package loopsMethodsClassesHomework;
import java.util.Random;
import java.util.Scanner;

public class RandomHandOfFiveCards {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        String[] suits = {"\u2660", "\u2665", "\u2666", "\u2663"};
        String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        
        int numberOfHands = Integer.parseInt(scanner.nextLine());
        String[] allRandomHands = new String[numberOfHands];
        
        for(int i = 0; i < numberOfHands; i++) {
        	Random random = new Random();
        	
        	String randomHand = faces[random.nextInt(12)] + suits[random.nextInt(3)] +
        						faces[random.nextInt(12)] + suits[random.nextInt(3)] +
        						faces[random.nextInt(12)] + suits[random.nextInt(3)] +
        						faces[random.nextInt(12)] + suits[random.nextInt(3)] +
        						faces[random.nextInt(12)] + suits[random.nextInt(3)];
        	
        	
        	allRandomHands[i] = randomHand;
        }
        
        for(String hand : allRandomHands) {
        	System.out.println(hand);
        }
        
        scanner.close();
	}

}
