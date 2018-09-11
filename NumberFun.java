import java.util.Scanner;

public class NumberFun 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        
        int cases = sc.nextInt();
        
        for(int i =1;i<=cases;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            boolean flag = canProduce(a,b,c);
            
            if(flag)
            {
                System.out.println("Possible");
            }
            else
            {
                System.out.println("Impossible");
            }
        }
    }
    public static boolean canProduce(int a, int b, int c)
    {
        if (a + b == c) return true;
        if (a - b == c) return true;
        if (b - a == c) return true;
        if (a * b == c) return true;
        int d = a / b;
        if (d == c && d * b == a) return true;
        d = b / a;
        if (d == c && d * a == b) return true;
        return false;
    }
}