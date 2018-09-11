import java.util.*;
import java.io.*;

public class AlmostPerfect {
    
     public static void main(String[] args){
         
            Scanner sc = new Scanner(System.in);

            while(sc.hasNextInt())
            {
                int p = sc.nextInt();
                
                int sum = 1;
                
                for(int i =2;i*i<=p;i++)
                {
                    if(p%i==0)
                    {
                        sum += i;
                        int d = p/i;
                        if(d!=i)
                        {
                            sum+=d;
                        }
                    }
                }
                
                if(sum == p)
                {
                    System.out.println(p + " perfect");
                }
                else if(Math.abs(sum-p)<= 2)
                {
                    System.out.println(p + " almost perfect");
                }
                else
                {
                    System.out.println(p + " not perfect");
                }    
            }
    }
}