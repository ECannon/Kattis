import java.util.Scanner;

public class Planina 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        
        int iter = sc.nextInt();
        int num = 1;
        int pnt = 1;
        
        for(int i =1;i<=Math.pow(2, iter);i++)
        {
            num+=2;
            pnt = pnt + num;
        }
        System.out.println(pnt);
    }
}