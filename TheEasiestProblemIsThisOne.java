import java.util.*;

public class TheEasiestProblemIsThisOne {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = 1;
        
        do
        {
            n = sc.nextInt();
            int m = n;
            int sumN = 0;
            
            while(m>0)
            {
                sumN += m%10;
                m /= 10;
            }
            
            boolean found = false;
            
            int i = 11;
            while(!found)
            {
                int j = i;
                int product = n*j;
                int sumProduct = 0;
                
                while(product > 0)
                {
                    sumProduct += product%10;
                    product /= 10;
                }
                
                if(sumN == sumProduct)
                {
                    found = true;
                    
                    if(n!=0)
                    {
                    	System.out.println(i);
                    }
                }
                i++;    
            }   
        }while(n !=0);
        
    }
}