import java.util.Scanner;

public class LastFactorialDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			int num = sc.nextInt();
			int factorial = 1;
			
			for(int j = num; j > 0; j--) {
				factorial *= j;
				  
			}
			
			System.out.println(factorial % 10);
		}

	}

}
