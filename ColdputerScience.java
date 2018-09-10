import java.util.Scanner;

public class ColdputerScience 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        
        int days = sc.nextInt();
        int count=0;
        
        for(int i =1;i<=days;i++)
        {
            int n = sc.nextInt();
            
            if(n<0)
            {
                count++;
            }
        }   
        System.out.println(count);
    }
}