import java.util.*;

public class ADifferentProblem {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextLine())
        {
            String s1 = sc.nextLine();
            String[] ar1 = s1.split(" ");
            
            long num1 = Long.parseLong(ar1[0]);
            long num2 = Long.parseLong(ar1[1]);
            
            if(num1 > num2)
            {
                System.out.println(num1 - num2);
            }
            else
            {
                System.out.println(num2 - num1);
            }
        }
    }
}