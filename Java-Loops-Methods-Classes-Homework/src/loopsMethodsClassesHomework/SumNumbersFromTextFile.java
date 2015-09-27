package loopsMethodsClassesHomework;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumNumbersFromTextFile {
	
	public static int sum = 0;
	
	public static void main(String[] args) {
	
		try(
				BufferedReader fileReader = new BufferedReader(
						new FileReader("C:\\Users\\Viktor\\Desktop\\Workspace\\JavaBasic\\Java-Loops-Methods-Classes-Homework\\bin\\loopsMethodsClassesHomework\\SumNumbers_Input.txt"));
		) {
			while (true) {
				String line = fileReader.readLine();
				
				if(line == null) {
					break;
				}
				
				sum += Integer.parseInt(line);
		   }
		} 
		catch (IOException ioex) {
				System.err.println("Error");
		}
		finally {
				System.out.println(sum);
		}
	}
}
