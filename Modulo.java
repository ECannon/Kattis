import java.util.Scanner;
import java.util.ArrayList;

public class Modulo 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        
        int count=0;
        
        ArrayList<String> result = new ArrayList<String>();
        
        for(int i =0;i<10;i++)
        {
            int num1 = sc.nextInt();
            String modulo = Integer.toString(num1%42);
            
            if(!result.contains(modulo))
            {
                result.add(modulo);
            }   
        }
        System.out.println(result.size());
    }
}