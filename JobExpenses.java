import java.util.*;

public class JobExpenses {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int total = 0;
		
		for(int i = 0; i < n; i++) {
			
			int num1 = sc.nextInt();
			if(num1 < 0) {
				total += Math.abs(num1);
			}
		}
		
		System.out.println(total);
		
		
	}

}
