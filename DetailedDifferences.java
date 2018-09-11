import java.util.*;

public class DetailedDifferences {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int cases = sc.nextInt();
        sc.nextLine();
        
        for(int i =0;i<cases;i++)
        {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(s1);
            System.out.println(s2);
            
            differences(s1,s2);
            System.out.println(); 
        }
    }
    public static void differences(String s1, String s2)
    {
        for(int i =0;i<s1.length();i++)
        {
            if(s1.charAt(i) == s2.charAt(i))
            {
                System.out.print(".");
            }
            else
            {
                System.out.print("*");
            }
        }
    }
}