import java.util.*;

public class SodaSurpler {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		
		int start = sc.nextInt();
		int found = sc.nextInt();
		int cost = sc.nextInt();
		int posess = start+found;
		
		while(posess >= cost) {
			
			int remainder = posess/cost;
			total += posess/cost;
			posess = posess % cost;
			posess+=remainder;
		}
		System.out.println(total);
		
	}

}
