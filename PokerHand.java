import java.util.*;

public class PokerHand {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		
		for(int i = 0; i < 5; i++){
			char c1 = sc.nextLine().charAt(0);
			
			if(map1.containsKey(c1)){
				map1.put(c1, map1.get(c1)+1);
			}
			else{
				map1.put(c1, 1);
			}
		}
		
		SortedSet<Integer> values = new TreeSet<Integer>(map1.values());
		
		System.out.println(values.last());	
	}
}
