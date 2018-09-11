import java.util.*;

public class EncodedMessage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int cases = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i < cases; i++)
        {
            String s1 = sc.nextLine();
            
            int sqrt = (int)Math.sqrt(s1.length());
            
            char [][] ar1 = new char [sqrt] [sqrt];
            int index = 0;
            for(int j = 0; j < ar1.length; j++)
            {
                for(int k = 0; k < ar1.length; k++)
                {
                    ar1[j][k] = s1.charAt(index);
                    index++;
                }
            }
            String s2 = "";
            for(int j = ar1.length-1; j >= 0; j--)
            {
                for(int k = 0; k < ar1.length; k++)
                {
                    s2 = s2 + ar1[k][j];
                }
            }
            System.out.println(s2);
        }
    }
}