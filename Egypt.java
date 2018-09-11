import java.util.*;

public class Egypt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            int [] ar1 = new int[3];
            
            ar1[0] = sc.nextInt();
            ar1[1] = sc.nextInt();
            ar1[2] = sc.nextInt();
            
            ar1 = sortArray(ar1);
            
            if((ar1[0]==0) && (ar1[1]==0) && (ar1[2] ==0))
            {
                break;
            }
            
            if(Math.pow(ar1[0], 2) + Math.pow(ar1[1], 2) == Math.pow(ar1[2], 2))
            {
                System.out.println("right");
            }
            else
            {
                System.out.println("wrong");
            }
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