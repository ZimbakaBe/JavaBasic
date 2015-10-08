import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DragonSharp_1 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String[]> output = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] parts = input.split("(?<=if|\\)|else|\\d|out|loop) (?=loop|\\d|out|\"|\\()", 6);
            String lastElement = parts[parts.length-1];
            if (lastElement.charAt(0) != '"' ||
                    lastElement.charAt(lastElement.length()-2) != '"' ||
                    lastElement.charAt(lastElement.length() -1) != ';') {
                System.out.printf("Compile time error @ line %d%n", i+1);
                return;
            }
            output.add(parts);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (output.get(i)[0].equals("if")) {
                String statement = output.get(i)[1].substring(1, output.get(i)[1].length()-1);
                if (verifyCorrectStatement(statement)) {
                    if (output.get(i)[2].equals("loop")) {
                        int loops = Integer.parseInt(output.get(i)[3]);
                        for (int j = 0; j < loops; j++) {
                            sb.append(output.get(i)[5].substring(1,output.get(i)[5].length()-2));
                            sb.append("\r\n");
                        }
                    }else{
                        sb.append(output.get(i)[3].substring(1,output.get(i)[3].length()-2));
                        sb.append("\r\n");
                    }
 
 
                }else if (i <= n-2 && output.get(i + 1)[0].equals("else")){
                    if (output.get(i+1)[1].equals("loop")) {
                        int loops = Integer.parseInt(output.get(i+1)[2]);
                        for (int j = 0; j < loops; j++) {
                            sb.append(output.get(i+1)[4].substring(1, output.get(i+1)[4].length() - 2));
                            sb.append("\r\n");
                        }
                    }else{
                        sb.append(output.get(i+1)[2].substring(1,output.get(i+1)[2].length()-2));
                        sb.append("\r\n");
                    }
 
                }
               
            }
        }
        System.out.print(sb);
    }
 
    private static boolean verifyCorrectStatement(String statement) {
        Pattern pattern = Pattern.compile("(\\d+)(==|>|<)(\\d+)");
        Matcher matcher = pattern.matcher(statement);
        matcher.find();
        int firstNumber = Integer.parseInt(matcher.group(1));
        int secondNumber = Integer.parseInt(matcher.group(3));
        String operation = matcher.group(2);
        switch (operation){
            case "==": return firstNumber == secondNumber;
            case ">": return firstNumber > secondNumber;
            case "<": return firstNumber < secondNumber;
            default: return false;
        }
    }
}
