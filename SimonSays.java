import java.util.*;

public class SimonSays {
	
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        
        for(int i =1;i<=n;i++)
        {
            String s1 = sc.nextLine();
            
            if(s1.length()>=10)
            {
            	if(s1.substring(0,10).equals("Simon says"))
            	{
            		System.out.println(s1.substring(11));
            	}
            }
        }
    }
}