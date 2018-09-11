import java.util.*;

public class Soylent {
	
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int cases = sc.nextInt();
        
        for(int i =0;i<cases;i++)
        {
            int n = sc.nextInt();
            
            if(n%400 != 0)
            {
                System.out.println((n/400)+1);
            }
            else
            {
                System.out.println(n/400);
            }
        }
    }
}