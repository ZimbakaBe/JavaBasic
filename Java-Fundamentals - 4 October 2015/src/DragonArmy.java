import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class DragonArmy {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int dragonCount = Integer.parseInt(scanner.nextLine());
		
		LinkedHashMap<String, TreeMap<String, ArrayList<Integer>>> dragons = new LinkedHashMap<String, TreeMap<String, ArrayList<Integer>>>();
		
		for(int i = 0; i < dragonCount; i++) {
			
			String[] dragonInfo = scanner.nextLine().split(" ");
			
			String type = dragonInfo[0];
			String name = dragonInfo[1];
			Integer damage = 0;
			Integer health = 0;
			Integer armor = 0;
			
			if(dragonInfo[2].equals("null")){
				damage = 45;
			}
			else {
				damage = Integer.parseInt(dragonInfo[2]);
			}
			if(dragonInfo[3].equals("null")){
				health = 250;
			}
			else {
				health = Integer.parseInt(dragonInfo[3]);
			}
			if(dragonInfo[4].equals("null")){
				armor = 10;
			} 
			else {
				armor = Integer.parseInt(dragonInfo[4]);
			}
			
			if(!dragons.containsKey(type)) {
				dragons.put(type, new TreeMap<String, ArrayList<Integer>>());
				dragons.get(type).put(name, new ArrayList<Integer>());
				dragons.get(type).get(name).add(damage);
				dragons.get(type).get(name).add(health);
				dragons.get(type).get(name).add(armor);
			}
			else {
				dragons.get(type).put(name, new ArrayList<Integer>());
				dragons.get(type).get(name).add(damage);
				dragons.get(type).get(name).add(health);
				dragons.get(type).get(name).add(armor);
			}
			
		}
		
		Set<String> keys = dragons.keySet();
		
		for(String key : keys) {
			
			TreeMap<String, ArrayList<Integer>> results = dragons.get(key);
			Set<String> names = results.keySet();
			
			int allDamage = 0;
			int allHealth = 0;
			int allArmor = 0;
			
			ArrayList<Integer> dragonStats = new ArrayList<Integer>();
			
			for(String name : names) {
				dragonStats = dragons.get(key).get(name);
				allDamage += dragonStats.get(0);
				allHealth += dragonStats.get(1);
				allArmor += dragonStats.get(2);
			}
			
			double averageDamage = (double)allDamage/results.size();
			double averageHealth = (double)allHealth/results.size();
			double averageArmor = (double)allArmor/results.size();
			
			System.out.printf("%s::(%.2f/%.2f/%.2f)", key, averageDamage, averageHealth, averageArmor);
			System.out.println();
			
			for(String name : names) {
				dragonStats = new ArrayList<Integer>();
				dragonStats = dragons.get(key).get(name);
				int damage = dragonStats.get(0);
				int health = dragonStats.get(1);
				int armor = dragonStats.get(2);
				System.out.println("-" + name + " -> damage: " + damage + ", health: " + health + ", armor: " + armor);
			}

		}

	}

}
