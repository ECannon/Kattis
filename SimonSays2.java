import java.util.*;

public class SimonSays2 {
    
     public static void main(String[] args){
         
            Scanner sc = new Scanner(System.in);
                        
            int cases = Integer.parseInt(sc.nextLine());
            
            for(int i = 0; i<cases; i++)
            {
                String s1 = sc.nextLine();
                            
                if(s1.startsWith("simon says ")) 
                    System.out.println(s1.substring(11));
                else
                    System.out.println("");
            }      
    }
}