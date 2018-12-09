import java.util.*;

public class UnbearableZoo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		int n = Integer.parseInt(sc.nextLine());
		int count = 1;
		
		while(n != 0) {
			
			for(int i = 0; i < n; i++) {
				
				String s1 = sc.nextLine();
				String animal = s1.substring(s1.lastIndexOf(' ')+1).toLowerCase();
				
				if(map.containsKey(animal)) {
					map.put(animal, map.get(animal)+1);
				} else {
					map.put(animal, 1);
				}
			}
			
			System.out.println("List "+count+":");
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
			     System.out.println(entry.getKey() + " | " + entry.getValue());
			}
			
			count++;
			map.clear();
			n = Integer.parseInt(sc.nextLine());
			
		}
	}
}
