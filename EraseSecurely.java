import java.util.*;

public class EraseSecurely {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        boolean succeeded = true;

        if(n%2 == 0)
        {           
            for(int i = 0; i < s1.length(); i++)
            {
                if(!(s1.charAt(i) == s2.charAt(i)))
                {
                    succeeded = false;
                }
            }
        }
        else
        {           
            for(int i = 0; i < s1.length(); i++)
            {
                if(s1.charAt(i) == s2.charAt(i))
                {
                    succeeded = false;
                }
            }
        }
        
        if(succeeded)
        {
            System.out.println("Deletion succeeded");
        }
        else
        {
            System.out.println("Deletion failed");
        }
    }
}