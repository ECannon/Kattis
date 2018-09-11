import java.util.*;
import java.math.*;

public class GreedilyIncreasingSubsequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> ar2 = new ArrayList<Integer>();
        
        int n = sc.nextInt();
        
        int [] ar1 = new int [n];
        
        for(int i = 0; i < ar1.length; i++)
        {
            ar1[i] = sc.nextInt();
        }
        
        int temp = ar1[0];
        for(int i = 0; i < ar1.length; i++)
        {
            if(i == 0)
            {
                ar2.add(ar1[i]);
            }
            
            if(ar1[i] > temp)
            {
                ar2.add(ar1[i]);
                temp = ar1[i];
            }
        }
        
        System.out.println(ar2.size());
        for(int j = 0; j < ar2.size(); j++)
        {
            System.out.print(ar2.get(j) + " ");
        }
    }
}