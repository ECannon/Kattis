import java.util.Scanner;
public class HissingMicrophone
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.nextLine();
        boolean hiss = false;
        
        for(int i = 0; i < s1.length()-1; i++)
        {
            if(s1.charAt(i) == 's' && s1.charAt(i+1) == 's')
            {
                hiss = true;
                break;
            }
        }
        if(hiss)
        {
            System.out.println("hiss");
        }
        else
        {
            System.out.println("no hiss");
        }
    }
}