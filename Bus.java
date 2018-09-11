import java.util.*;

public class Bus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int cases = sc.nextInt();
        
        for(int i = 0; i < cases; i++)
        {
            double n = 0;
            int stops = sc.nextInt();
            
            for(int j = 0; j < stops; j++)
            {
                n = (n+.5)*2;
            }
            System.out.println((int)n);   
        }
    }
}