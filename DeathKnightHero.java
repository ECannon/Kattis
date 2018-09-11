import java.util.*;

public class DeathKnightHero 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
                
        int battles = Integer.parseInt(sc.nextLine());
        int count=0;
        
        for(int i =1;i<=battles;i++)
        {
            String s1 = sc.nextLine();
            boolean win = true;
            
            for(int j=0;j<s1.length()-1;j++)
            {
                if(s1.charAt(j) == 'C' && s1.charAt(j+1) == 'D')
                {
                    win = false;
                }
            }
            
            if(win)
            {
                count++;
            }   
        }
        System.out.println(count); 
    }
}