import java.util.*;
import java.math.*;

public class FallingApart {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int [] ar1 = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            ar1[i] = sc.nextInt();
        }
        
        ar1 = sortArray(ar1);
        
        int alice = 0;
        int bob = 0;
        
        boolean flag = true;
        for(int i = ar1.length-1; i >= 0; i--)
        {
            if(flag)
            {
                alice += ar1[i];
            }
            else
            {
                bob += ar1[i];
            }
            flag = !flag;   
        } 
        System.out.println(alice + " " + bob);
    }
    
    public static int[] sortArray(int[] ar1)
    {
        for(int i=1;i<ar1.length;i++)
        {
            for(int j =0;j<ar1.length-1;j++)
            {
                if(ar1[j] > (ar1[j+1]))
                {
                    int temp = ar1[j];
                    ar1[j] = ar1[j+1];
                    ar1[j+1] = temp;
                }
            }
        }
        return ar1;
    }
}