import java.util.*;

public class FreeFood {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		ArrayList<Integer> arr = new ArrayList<>();
		int n = sc.nextInt();
		
		for(int i = 0; i < n; ++i) {
			
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			for(int j = num1; j <= num2; ++j) {
				arr.add(j);
			}

		}
		
		Collections.sort(arr);
				
		Set<Integer> set = new HashSet<>(arr);
		arr.clear();
		arr.addAll(set);
	
		System.out.println(arr.size());

	}
	
}
