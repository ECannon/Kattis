import java.util.Scanner;

public class Filip 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        
        int num1=sc.nextInt();
        int num2 = sc.nextInt();
        
        if(num1%10 > num2%10)
        {
            System.out.print(num1%10);
            System.out.print(num1/10%10);
            System.out.print(num1/100%10);
        }
        else if (num2%10 > num1%10)
        {
            System.out.print(num2%10);
            System.out.print(num2/10%10);
            System.out.print(num2/100%10);
        }
        else if(num1%10 == num2%10)
        {
            if(num1/10%10 > num2/10%10)
            {
                System.out.print(num1%10);
                System.out.print(num1/10%10);
                System.out.print(num1/100%10);
            }
            else if(num2/10%10 > num1/10%10)
            {
                System.out.print(num2%10);
                System.out.print(num2/10%10);
                System.out.print(num2/100%10);
            }
            else if(num1/10%10 == num2/10%10)
            {
                if(num1/100%10>num2/100%10)
                {
                    System.out.print(num1%10);
                    System.out.print(num1/10%10);
                    System.out.print(num1/100%10);
                }
                else if(num2/100%10 > num1/100%10)
                {
                    System.out.print(num2%10);
                    System.out.print(num2/10%10);
                    System.out.print(num2/100%10);
                }
                else
                {
                    System.out.print(num1%10);
                    System.out.print(num1/10%10);
                    System.out.print(num1/100%10);
                }
            }
        }
        
    }
}
