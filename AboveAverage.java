import java.util.*;

public class AboveAverage {
    
     public static void main(String[] args){
         

            Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
            
            for (int t = 0; t < n; t++) 
            {
                int students = sc.nextInt();
                int[] ar1 = new int[students];
                int total = 0;
                for (int i = 0; i < students; i++) 
                {
                    ar1[i] = sc.nextInt();
                    total += ar1[i];
                }
                double avg = total * 1.0 / students;
                
                int count = 0;
                for (int i = 0; i < students; i++) 
                {
                    
                    if(ar1[i] > avg)
                    {
                        count++;
                    }
                }
                System.out.printf("%.3f%%\n", (count * 100.0 / students));
            }
     }        
}