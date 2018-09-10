import java.util.Scanner;

public class Autori 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.nextLine();
        
        for(int i =0;i<s1.length();i++)
        {
            if(i == 0)
            {
                System.out.print(s1.charAt(0));
            }
            if(s1.charAt(i) == '-')
            {
                System.out.print(s1.charAt(i+1));
            }
        }
    }
}