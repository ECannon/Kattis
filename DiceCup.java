import java.util.*;

public class DiceCup {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        
        if(side1<side2)
        {
            for(int i =side1+1;i<=side2+1;i++)
            {
                System.out.println(i);
            }
        }
        else if(side2<side1)
        {
            for(int i =side2+1;i<=side1+1;i++)
            {
                System.out.println(i);
            }
        }
        else
        {
            System.out.println(side1+1);
        }
    }
}