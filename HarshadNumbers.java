import java.util.*;

public class HarshadNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		boolean found = false;

		while(!found) {
			
			int m = n;
			int total = 0;
			
			while (m > 0) {

				total += m % 10;
				m /= 10;
			}
			
			if(n % total == 0) {
				
				found = true;
				System.out.println(n);
				
			}
			
			n++;

			
		}
	}

}
