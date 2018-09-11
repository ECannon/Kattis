import java.util.Scanner;

public class SpeedLimit 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int total=0;
        int rem = 0;
        
        do
        {
            rem=0;
            total=0;
            for(int i =1;i<=n;i++)
            {
                int speed = sc.nextInt();
                int hours = sc.nextInt();
                
                total = total + (speed*(hours-rem));
                rem = hours;
            }
            
            System.out.println(total+" miles");
            
            n = sc.nextInt();
            
            
        }while(n!= -1);
    }
}