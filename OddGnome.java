import java.util.Scanner;
import java.util.ArrayList;

public class OddGnome 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        int cases = sc.nextInt();
        int previous=0;
        int temp=0;
        
        for(int i =0;i<cases;i++)
        {
            int numGnomes = sc.nextInt();
            int[]ar1 = new int [numGnomes];
            
            for(int j =0;j<numGnomes;j++)
            {
                ar1[j] = sc.nextInt();
            }
            
            for(int k =1;k<ar1.length-1;k++)
            {
                if(!(ar1[k] - ar1[k-1] == 1) && !(ar1[k]-ar1[k+1] == -1))
                {
                    System.out.println(k+1);
                }
            }  
        }   
    }
}