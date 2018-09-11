import java.util.*;

public class DiceGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int gunnar = 0;
        int emma = 0;
        
        for(int i = 1; i <= 4; i++)
        {
            gunnar += sc.nextInt();
        }
        
        for(int i = 1; i <= 4; i++)
        {
            emma += sc.nextInt();
        }
        
        if(emma > gunnar)
        {
            System.out.println("Emma");
        }
        else if (gunnar > emma)
        {
            System.out.println("Gunnar");
        }
        else
        {
            System.out.println("Tie");
        }
    }
}