import java.util.*;

public class ChanukahChallenge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < n; i++) {
			
			String s1 = sc.nextLine();
			int dataSet = Integer.parseInt(s1.substring(0, s1.indexOf(' ')));
			
			int days = Integer.parseInt(s1.substring(s1.indexOf(" ")+1));
			int sum = days * (days + 3) / 2;
			System.out.println(dataSet + " " + sum);
		}
	}
}
