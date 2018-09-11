import java.util.*;

public class QuickEstimates 
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        
        for(int i =0;i<n;i++)
        {
            String s1 = sc.nextLine();
            System.out.println(s1.length());    
        }
    }
}