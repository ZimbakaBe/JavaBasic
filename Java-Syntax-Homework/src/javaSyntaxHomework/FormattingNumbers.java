package javaSyntaxHomework;
import java.util.Locale;
import java.util.Scanner;
import static java.lang.System.out;

public class FormattingNumbers {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
//		Locale.setDefault(Locale.ROOT);
		
		int firstNumber = in.nextInt();
		float secondNumber = in.nextFloat();
		float thirdNumber = in.nextFloat();
		
		String firstNumberToHex = Integer.toHexString(firstNumber).toUpperCase();
		int firstNumberToBinary = Integer.parseInt(Integer.toBinaryString(firstNumber));
		
		out.printf("|%1$-10s|%2$010d|%3$10.2f|%4$-10.3f|", firstNumberToHex, firstNumberToBinary, secondNumber,thirdNumber);
		
		in.close();
	}

}
