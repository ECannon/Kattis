import java.util.*;

public class Kemija {
    
     public static void main(String[] args){
         
            Scanner sc = new Scanner(System.in);
            
            String s1 = sc.nextLine();
            char [] ar1 = s1.toCharArray();
            
            for(int i =0 ;i<s1.length()-2;i++)
            {
                if(ar1[i] == 'a' || ar1[i] == 'e' || ar1[i] == 'i' || ar1[i] == 'o' || ar1[i] == 'u')
                {
                    ar1[i+1] = '!';
                    ar1[i+2] = '!';
                }
            }
            s1 = new String(ar1);
            System.out.println(s1.replaceAll("!", ""));
    }
}