import java.util.*;

public class LeftBeehind {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if((a == 0) && (b == 0))
            {
                break;
            }
            
            if(a+b == 13)
            {
                System.out.println("Never speak again.");
            }
            else if(a > b)
            {
                System.out.println("To the convention.");
            }
            else if( a < b)
            {
                System.out.println("Left beehind.");
            }
            else if(a == b)
            {
                System.out.println("Undecided.");
            }
        }
    }
}