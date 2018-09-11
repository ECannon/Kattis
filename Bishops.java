import java.util.*;

public class Bishops {
    
     public static void main(String[] args){
         
            Scanner sc = new Scanner(System.in);
            
            while(sc.hasNext())
            {
                int n = sc.nextInt();
                
                if(n<=0) System.out.println("0");
                else if (n==1) System.out.println("1");
                else System.out.println(2*n-2);   
            } 
    }
}