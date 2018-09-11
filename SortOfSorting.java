import java.util.*;

public class SortOfSorting 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            int n = Integer.parseInt(sc.nextLine());
            
            if(n == 0)
            {
                break;
            }
            else
            {
                String[] ar1 = new String[n];
                
                for(int i = 0; i <n; i++)
                {
                    ar1[i] = sc.nextLine();   
                }
                
                ar1 = sortArray(ar1);
                
                for(int i = 0; i < ar1.length; i++)
                {
                    System.out.println(ar1[i]);
                }
                
                System.out.println();
            }
        }
        
    }
    
     public static String[] sortArray(String[] ar1)
        {
            for(int i=1;i<ar1.length;i++)
            {
                for(int j =0;j<ar1.length-1;j++)
                {
                    if(ar1[j].substring(0, 2).compareTo(ar1[j+1].substring(0, 2))>0)
                    {
                        String temp = ar1[j];
                        ar1[j] = ar1[j+1];
                        ar1[j+1] = temp;
                    }
                }
            }
            return ar1;
        }
}