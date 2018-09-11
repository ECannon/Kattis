import java.util.*;

public class QuickBrownFox {
    
     public static void main(String[] args){
         
            Scanner sc = new Scanner(System.in);
            
            int n = Integer.parseInt(sc.nextLine());
            
            for(int i = 1; i <= n; i++)
            {
                String alpha = "abcdefghijklmnopqrstuvwxyz";
                String s1 = sc.nextLine();
                s1 = s1.toLowerCase();
                
                for(int j = 0; j<s1.length(); j++)
                {
                    alpha = alpha.replace(s1.substring(j,j+1), "");
                }
                
                if(alpha.length() == 0)
                {
                    System.out.println("pangram");
                }
                else
                {
                    System.out.println("missing " + alpha);
                }
            }
     }        
}