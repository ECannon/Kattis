import java.util.*;

public class PrintedStatues3D {
    
     public static void main(String[] args){
         
            Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
            int printers = 1;
            int statuesPrinted = 0;
            int days = 0;
            
            while(statuesPrinted < n)
            {
                if((n-statuesPrinted) > printers)
                {
                    days += 1;
                    printers += printers;
                }
                else
                {
                    days += 1;
                    statuesPrinted += printers;
                }
            }
            System.out.println(days);  
    }
}