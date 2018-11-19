import java.util.*;

public class SavingPrincessPeach {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ArrayList<Integer> ar2 = new ArrayList<Integer>();

		int N = sc.nextInt();
		int Y = sc.nextInt();
		
		for(int i = 0; i < N; i++)
			ar1.add(i);
		
		int count = 0;
		for(int i = 0; i < Y; i++) {
			int r = sc.nextInt();
			if(!ar2.contains(r)) {
				ar2.add(r);
			}
		}	
		
		for(int i = 0; i < ar2.size(); i++)
			ar1.remove(ar2.get(i));
		
		for(int i = 0; i < ar1.size(); i++)
			System.out.println(ar1.get(i));
		
		System.out.println("Mario got " + ar2.size() + " of the dangerous obstacles.");
	}

}
