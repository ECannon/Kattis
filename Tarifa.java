import java.util.Scanner;

public class Tarifa
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        int numMonths = sc.nextInt();
        
        int total = x * (numMonths+1);
        
        for(int i = 1; i <= numMonths; i++)
        {
            int mb = sc.nextInt();
            
            total -= mb;
        }
        
        System.out.println(total);
    }
}