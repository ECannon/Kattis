import java.util.*;

public class Parking 
{
    
     public static void main(String[] args)
     {
         

            Scanner sc = new Scanner(System.in);
            
            int numCases = sc.nextInt();
            
            for(int i = 0; i < numCases; i++)
            {
                int numStores = sc.nextInt();
                int [] ar1 = new int [numStores];
                
                for(int j = 0; j <numStores; j++)
                {
                    ar1[j] = sc.nextInt();
                }
                
                ar1 = sortArray(ar1);
                
                int steps = 0;
                for(int j = ar1[0]; j < ar1[numStores-1]; j++)
                {
                    steps += 2;
                }
                System.out.println(steps);  
            }
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