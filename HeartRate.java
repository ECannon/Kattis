import java.util.*;

public class HeartRate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		
		for(int i = 0; i < cases; i++) {
			
			int b = sc.nextInt();
			double p = sc.nextDouble();
			
			System.out.print((60*(b-1))/p+ " ");
			System.out.print((60*(b))/p+ " ");
			System.out.println((60*(b+1))/p);


		}
		
		
		
	}

}
