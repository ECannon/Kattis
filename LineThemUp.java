import java.util.*;

public class LineThemUp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        int names = Integer.parseInt(sc.nextLine());
        int lastNameIndex = 0;
        String[] ar1 = new String[names];
        
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        
        for(int i = 0; i < names; i++)
        {
            ar1[i] = sc.nextLine(); 
        }
        
        for(int i = 0; i < names-1; i++)
        {
            if(ar1[i].compareTo(ar1[i+1]) < 0)
            {
                isDecreasing = false;
            }
            else
            {
                isIncreasing = false;
            }
        }
        
        if(!isDecreasing && !isIncreasing)
        {
            System.out.println("NEITHER");
        }
        else if(isDecreasing)
        {
            System.out.println("DECREASING");
        }
        else
        {
            System.out.println("INCREASING");
        }
    }
}