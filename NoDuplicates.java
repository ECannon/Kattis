import java.util.Scanner;

public class NoDuplicates 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.nextLine();
        
        String[] ar1 = s1.split(" ");
        
        boolean flag = false;
        
        for(int i =0;i<ar1.length;i++)
        {
            for(int j =0;j<ar1.length;j++)
            {
                if(j != i)
                {
                    if(ar1[j].equals(ar1[i]))
                    {
                        flag = true;
                    }
                }
            }
        }
        
        if(flag == true)
        {
            System.out.println("no");
        }
        else
        {
            System.out.println("yes");
        }
    }
}