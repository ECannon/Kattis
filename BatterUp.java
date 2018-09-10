import java.util.Scanner;

public class BatterUp 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        
        double num = sc.nextInt();
        int walks=0;
        double result=0;
        
        for(int i =1;i<=num;i++)
        {
            int n = sc.nextInt();
            
            if(n == -1)
            {
                walks++;
            }
            else
            {
                result = result + n;
            }
        }
        System.out.println(result/(num-walks));
    }
}