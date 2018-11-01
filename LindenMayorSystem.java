import java.util.*;

public class LindenMayorSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String,String> map1 = new HashMap<String,String>();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		
		String[] ar1 = new String[n];
		
		for(int i = 0; i < n; i++)
		{
			String s1 = sc.nextLine();
			map1.put(s1.substring(0, s1.indexOf(' ')), s1.substring(s1.lastIndexOf(' ')+1,s1.length()));
		}
				
		String start = sc.nextLine();
		String s2 = "";
		
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < start.length(); j++)
			{
				if(map1.containsKey(start.charAt(j)+""))
				{
					s2 += map1.get(start.charAt(j)+"");
				}
				else
				{
					s2 += start.charAt(j);
				}
			}
			start = s2;
			s2 = "";
		}	
		System.out.println(start);
	}
}