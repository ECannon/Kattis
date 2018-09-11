import java.util.*;

public class Backspace {
    
     public static void main(String[] args){
         
            Scanner sc = new Scanner(System.in);
                        
            String s1 = sc.nextLine();
            
            char[] ar1 = s1.toCharArray();
            int count = 0;
            for(int i = ar1.length-1 ; i >= 0;i--)
            {
                if(ar1[i] == '<')
                {
                    ar1[i] = ' ';
                    count++;
                }
                else if(count > 0)
                {
                    ar1[i] = ' ';
                    count--;
                }
            }       
            s1 = new String(ar1);
            System.out.println(s1.replaceAll(" ", ""));
    }
}