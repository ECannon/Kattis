import java.util.Scanner;

public class Zamka
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int lower = sc.nextInt();
        int upper = sc.nextInt();
        int num = sc.nextInt();
        
        for(int i =lower;i<=upper;i++)
        {
            if(sumDigits(i) == num)
            {
                System.out.println(i);
                break;
            }
        }
        
        for(int i =upper;i>=lower;i--)
        {
            if(sumDigits(i) == num)
            {
                System.out.println(i);
                break;
            }
        }
    }
    public static int sumDigits(int n)
    {
        int sum = 0;
        
        while(n !=0)
        {
            sum += (n%10);
            n = n/10;
        }
        return sum;
    }
}