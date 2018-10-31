import java.util.*;

public class Skener {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		int zR = sc.nextInt();
		int zC = sc.nextInt();
		sc.nextLine();
		
		String[][] ar1 = new String[r][c];
		
		for(int i = 0; i < ar1.length; i++)
		{
			String s2 = sc.nextLine();
			for(int j = 0; j < ar1[i].length; j++)
			{
				ar1[i][j] = s2.charAt(j)+"";
			}
		}
		
		for(int i = 0; i < ar1.length; i++)
		{
			for(int j = 0; j < zR; j++)
			{
				for(int k = 0; k < ar1[0].length; k++)
				{
					for(int l = 0; l < zC; l++)
					{
						System.out.print(ar1[i][k]);
					}
				}
				System.out.println();
			}
		}	
	}
}
