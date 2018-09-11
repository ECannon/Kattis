import java.util.*;
import java.math.*;

public class QuiteAProblem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextLine())
        {
            String s1 = sc.nextLine();
            
            if(s1.toLowerCase().contains("problem"))
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
    }
}