import java.util.*;

public class OddManOut 
{
     public static void main(String[] args)
     {
            Scanner sc = new Scanner(System.in);
            
            Set<Integer> ar1 = new HashSet<Integer>();
            
            int cases = sc.nextInt();
            
            for(int i = 1; i<=cases;i++)
            {
                int guests = sc.nextInt();
                
                for(int j =0; j<guests; j++)
                {
                    int s1 = sc.nextInt();
                    
                    if(ar1.contains(s1))
                    {
                        ar1.remove(s1);
                    }
                    else
                    {
                        ar1.add(s1);
                    }
                }
                System.out.println("Case #"+i+": "+ar1.toArray()[0]);
                ar1.clear();
            }
    }
}