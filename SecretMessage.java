import java.util.*;

public class SecretMessage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int cases = Integer.parseInt(sc.nextLine());
        
        for(int g = 0; g < cases; g++)
        {
            String s1 = sc.nextLine();
            int l = s1.length();
            int square = 0;

            int index = l;
            while(true)
            {
                double sqrt = Math.sqrt(index);
                int x = (int) sqrt;
                if(Math.pow(sqrt, 2) == Math.pow(x, 2))
                {
                    square = index; 
                    break;
                }   
                index++;
            }

            for(int i = 0; i < square-l; i++)
            {
                s1 += '*';
            }

            char [][] ar1 = new char [(int)Math.sqrt(square)][(int)Math.sqrt(square)];

            int index2 = 0;
            for(int i = 0; i < ar1.length; i++)
            {
                for(int j = 0; j < ar1.length; j++)
                {
                    ar1[i][j] = s1.charAt(index2);
                    index2++;
                }

            }

            for(int i = 0; i < ar1.length; i++)
            {
                for(int j = ar1.length-1; j >= 0; j--)
                {
                    if(ar1[j][i] != '*')
                    {
                        System.out.print(ar1[j][i]);
                    }
                }
            }
            System.out.println();
        }
    }
}