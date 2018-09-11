import java.util.*;

public class Ptice 
{
     public static void main(String[] args)
     {
            Scanner sc = new Scanner(System.in);
            
            int questions = Integer.parseInt(sc.nextLine());
            
            
            
            String adrian = "ABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABC";
            String bruno = "BABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABC";
            String goran = "CCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABB";          
            
            String answers = sc.nextLine();
            
            int numAdrian = 0;
            int numBruno = 0;
            int numGoran = 0;
            
            for(int i = 0; i < answers.length(); i++)
            {
                if(answers.charAt(i) == adrian.charAt(i))
                {
                    numAdrian ++;
                }
                
                if(answers.charAt(i) == bruno.charAt(i))
                {
                    numBruno ++;
                }
                
                if(answers.charAt(i) == goran.charAt(i))
                {
                    numGoran ++;
                }
            }
            
            int max = Math.max(numAdrian, Math.max(numBruno, numGoran));
            System.out.println(max);
            
            if(max == numAdrian)
            {
                System.out.println("Adrian");
            }
            if(max == numBruno)
            {
                System.out.println("Bruno");
            }
            if(max == numGoran)
            {
                System.out.println("Goran");
            }
     }   
}