import java.util.*;

public class PopularVote {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        
        int cases = sc.nextInt();
        
        for(int i = 0; i < cases; i++)
        {
            int n = sc.nextInt();
                        
            int [] ar1 = new int [n];
            
            int numVotes = 0;
            
            for(int j = 0; j < n; j++)
            {
                int vote = sc.nextInt();
                ar1[j] = vote;
                numVotes += vote;
            }
            
            int max = 0;
            int index = -1;
            
            for(int j = 0; j < ar1.length; j++)
            {
                if(ar1[j] > max)
                {
                    max = ar1[j];
                    index = j;
                }
            }
            boolean flag = false;
            for(int j = 0; j < ar1.length; j++)
            {
                if(j != index)
                {
                    if(ar1[j] == ar1[index])
                    {
                        flag = true;
                    }
                }
            }
            
            index++;
            if(!flag)
            {
                
                if(max > numVotes/2)
                {
                    System.out.println("majority winner " + index);
                }
                else
                {
                    System.out.println("minority winner " + index);
                }   
            }
            else
            {
                System.out.println("no winner");
            }
        }
    }
}