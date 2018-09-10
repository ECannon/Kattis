import java.util.Scanner;

public class Trik 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.nextLine();
        int pos = 1;
        
        for(int i =0;i<s1.length();i++)
        {
            if(s1.charAt(i) == 'A')
            {
                if(pos == 1)
                {
                    pos = 2;
                }
                else if(pos == 2)
                {
                    pos = 1;
                }
            }
            else if(s1.charAt(i) == 'B')
            {
                if(pos == 2)
                {
                    pos = 3;
                }
                else if(pos == 3)
                {
                    pos = 2;
                }
            }
            else if(s1.charAt(i)== 'C')
            {
                if(pos == 1)
                {
                    pos = 3;
                }
                else if(pos == 3)
                {
                    pos =1;
                }
            }
        }
        System.out.println(pos);
    }
}