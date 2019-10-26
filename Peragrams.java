import java.util.*;

public class Peragrams {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s1 = sc.nextLine();

		HashMap<Character, Integer> map = new HashMap<>();

		for(int i = 0; i < s1.length(); i++) {
			if(map.containsKey(s1.charAt(i))) {
				map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
			} else {
				map.put(s1.charAt(i), 1);
			}
		}
		int count = 0;
		for(Character i: map.keySet()) {
			if(map.get(i) %2 == 1) {
				count++;
			}

		}
		if(count == 0) System.out.println(0);
		else System.out.println(count-1);


	}
}