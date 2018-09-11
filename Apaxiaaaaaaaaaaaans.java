import java.util.Scanner;

public class Apaxiaaaaaaaaaaaans 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.nextLine();
            
        String clean = cleanString(s1);
            
        System.out.println(clean);      
     }
        
     public static String cleanString(String s)
     {
         if(s.length()<=1)
         {
             return s;
         }
         else
         {
             if(s.substring(1,2).equals(s.substring(0,1)))
             {
                 return cleanString(s.substring(1));
             }
             else
             {
                 return s.substring(0,1) + cleanString(s.substring(1));
             }
         }   
    }
}