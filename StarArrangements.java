import java.util.*;
public class StarArrangements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(n+":");
		
		for(int i = 2; i < n; i++)
		{
			boolean flag = false;
			
			for(int j = i-1; j <= i; j++)
			{
				int total = 0;

				while(total <= n)
				{
					total +=i;
					if(total == n)
					{
						System.out.println(i+","+j);
						break;
					}
					else
					{
						total+=j;
						if(total == n)
						{
							System.out.println(i+","+j);
							break;
						}
					}	
				}
			}
		}

	}
}
