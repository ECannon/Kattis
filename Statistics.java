import java.util.*;

public class Statistics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int count = 1;
        
        while(sc.hasNextInt())
        {
            int size = sc.nextInt();
            
            int [] ar1 = new int [size];
            
            for(int i = 0; i < ar1.length; i++)
            {
                ar1[i] = sc.nextInt();
            }
            
            ar1 = sortArray(ar1);
            
            System.out.println("Case " +count + ": " + ar1[0] + " " + ar1[ar1.length-1] + " " + (ar1[ar1.length-1] - ar1[0]) );
            
            count++;    
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