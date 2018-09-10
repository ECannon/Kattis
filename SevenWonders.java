import java.util.Scanner;

public class SevenWonders 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.nextLine();
        int T=0;
        int C=0;
        int G=0;
        int pts = 0;
        
        for(int i =0;i<s1.length();i++)
        {
            if(s1.charAt(i) == 'T')
            {
                T++;
            }
            else if(s1.charAt(i) == 'C')
            {
                C++;
            }
            else
            {
                G++;
            }
        }
        
        for(int i =0;i<s1.length();i++)
        {
            if(T>=i && C>=i && G>=i)
            {
                pts=i;
            }
        }
        System.out.println((T*T)+(G*G)+(C*C)+7*pts);
    }
}