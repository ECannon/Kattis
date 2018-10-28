import java.util.*;
public class AnotherCandies {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		
		for(int i = 0; i < cases; i++)
		{
			int N = sc.nextInt();
			int total = 0;
			
			for(int j = 0; j < N; j++)
			{
				total += sc.nextLong() % N;
			}

			
			System.out.println(total % N == 0 ? "YES" : "NO");
		}

	}

}
