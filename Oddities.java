import java.util.Scanner;

public class Oddities 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int cases = sc.nextInt();
        
        for(int i =1;i<=cases;i++)
        {
            int n = sc.nextInt();
            
            if(n%2==0)
            {
                System.out.println(n + " is even");
            }
            else
            {
                System.out.println(n+ " is odd");
            }
        }
    }
}