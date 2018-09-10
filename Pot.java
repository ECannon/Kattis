import java.util.Scanner;

public class Pot 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        
        int cases = sc.nextInt();
        int total=0;
        
        for(int i =1; i<=cases;i++)
        {
            int n = sc.nextInt();
            total = total+(int)Math.pow(n/10, n%10);
        }
        System.out.println(total);
    } 
}