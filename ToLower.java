import java.util.*;

public class ToLower {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int cases = sc.nextInt();
        int problems = sc.nextInt();
        sc.nextLine();
        
        int solved = 0;
        
        for(int i = 0; i < cases; i++)
        {
            int count = 0;
            
            for(int j = 0; j < problems; j++)
            {
                String s1 = sc.nextLine();
                
                if(s1.matches("[A-Z][a-z]*"))
                {
                    count++;
                }
                else if(s1.matches("[a-z]*"))
                {
                    count++;
                }   
            }
            if(count == problems)
            {
                solved++;
            }
        }
        System.out.println(solved);
    }
}