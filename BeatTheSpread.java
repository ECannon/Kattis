import java.util.*;

public class BeatTheSpread {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);        
                
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++)
        {
            int sum = sc.nextInt();
            int difference = sc.nextInt();
            
            if((difference > sum) || (sum + difference)%2 != 0)
            {
                System.out.println("impossible");
            }
            else
            {
                int a = (sum + difference) / 2;
                int b = (sum - difference) / 2;
                System.out.println(Math.max(a, b) + " " + Math.min(a, b));
            }           
        }
    }
}