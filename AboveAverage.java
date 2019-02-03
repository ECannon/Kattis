import java.util.*;

public class AboveAverage {
    
     public static void main(String[] args){
         

            Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
            
            for (int i = 0; i < n; i++) 
            {
                int students = sc.nextInt();
                int[] ar1 = new int[students];
                int total = 0;
                for (int j = 0; j < students; j++) 
                {
                    ar1[j] = sc.nextInt();
                    total += ar1[j];
                }
                double avg = total * 1.0 / students;
                
                int count = 0;
                for (int j = 0; j < students; j++) 
                {
                    
                    if(ar1[j] > avg)
                    {
                        count++;
                    }
                }
                System.out.printf("%.3f%%\n", (count * 100.0 / students));
            }
     }        
}
