import java.util.Scanner;

public class JudgingMoose 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
        if(num1==0 && num2==0)
        {
            System.out.println("Not a moose");
        }
        else if(num1 == num2)
        {
            System.out.println("Even "+(num1+num2));
        }
        else
        {
            if(num1>num2)
            {
                System.out.println("odd "+num1*2);
            }
            else
            {
                System.out.println("odd "+num2*2);
            }
        } 
    }
}