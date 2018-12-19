import java.util.*;

public class Veci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String length = Integer.toString(n);
		boolean found = false;
		int limit = 0;
		
		if(length.length() == 1) {
			limit = 9;
		} else if(length.length() == 2) {
			limit = 99;
		} else if(length.length() == 3) {
			limit = 999;
		} else if(length.length() == 4) {
			limit = 9999;
		} else if(length.length() == 5) {
			limit = 99999;
		} else if(length.length() == 6) {
			limit = 999999;
		}
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		int yy = n;
		
		while(yy > 0) {
			arr.add(yy%10);
			yy /= 10;
		}
		
		Collections.sort(arr);

		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for(int i = n+1; i <= limit; i++) {
			
			int tt = i;
			while(tt > 0) {
				temp.add(tt%10);
				tt /= 10;
			}
			Collections.sort(temp);
			
			if(arr.equals(temp)) {
				System.out.println(i);
				found = true;
				break;
			}
			temp.clear();
		}
		
		if(!found) System.out.println(0);
		
	}

}
