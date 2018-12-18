import java.util.*;

public class HangingOutOnTheTerrace {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int limit = Integer.parseInt(sc.next());
		int numEvents = Integer.parseInt(sc.next());
		
//		int limit = Integer.parseInt(sc.next());
//		int numEvents = Integer.parseInt(sc.next());

		int numDenied = 0;
		int numTerrace = 0;
		
		for(int i = 0; i < numEvents; i++) {
			
			String s = sc.next();
			int n = sc.nextInt();
			
			if(s.startsWith("enter")) {
				if((numTerrace + n) > limit) {
					numDenied++;
				} else {
					numTerrace += n;
				}
			} else {
				numTerrace -= n;
			}
		}
		
		System.out.println(numDenied);
		
		
	}

}
