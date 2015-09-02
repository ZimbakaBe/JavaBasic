package javaSyntaxHomework;
import java.util.Scanner;

public class CountOfBitsOne {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int number = in.nextInt();
		System.out.println(Integer.bitCount(number));
		
//		int countOnes = 0;
//		String numberToBinary = Integer.toBinaryString(number);
//		
//		for(int i = 0; i < numberToBinary.length(); i++) {
//			if(numberToBinary.charAt(i) == '1') {
//				countOnes++;
//			}
//		}
//		System.out.println(countOnes);
		
		in.close();
	}

}
