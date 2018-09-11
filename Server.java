import java.util.*;

public class Server {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int numTasks = sc.nextInt();
        int minutes = sc.nextInt();
        
        int completed = 0;
        
        int [] ar1 = new int[numTasks];
        
        for(int i = 0; i <ar1.length; i++)
        {
            ar1[i] = sc.nextInt();
        }
        
        for(int i = 0; i <ar1.length; i++)
        {
            if(minutes - ar1[i] < 0)
            {
                break;
            }
            else
            {
                minutes -= ar1[i];
                completed ++;
            }  
        }
        System.out.println(completed);
    }
}