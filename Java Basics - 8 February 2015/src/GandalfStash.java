import java.util.Scanner;

public class GandalfStash {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int gandalfsMood = Integer.parseInt(scanner.nextLine());
		String[] food = scanner.nextLine().toLowerCase().split("[^a-zA-Z]+");
		
		for(int i = 0; i < food.length; i++) {
			switch(food[i]) {
				case "cram":
					gandalfsMood += 2;
					break;
				case "lembas":
					gandalfsMood += 3;
					break;
				case "apple":
					gandalfsMood += 1;
					break;
				case "melon":
					gandalfsMood += 1;
					break;
				case "honeycake":
					gandalfsMood += 5;
					break;
				case "mushrooms":
					gandalfsMood += -10;
					break;
				default:
					gandalfsMood += -1;
					break;
			}
		}
		
		if(gandalfsMood < -5) {
			System.out.println(gandalfsMood + "\r\nAngry");
		}
		if(gandalfsMood >= -5 && gandalfsMood < 0) {
			System.out.println(gandalfsMood + "\r\nSad");
		}
		if(gandalfsMood >= 0 && gandalfsMood < 15) {
			System.out.println(gandalfsMood + "\r\nHappy");
		}
		if(gandalfsMood > 15) {
			System.out.println(gandalfsMood + "\r\nSpecial JavaScript mood");
		}
		
		scanner.close();
	}

}
