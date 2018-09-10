import java.util.Scanner;
public class QuadrantSelection 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m = sc.nextInt();
        
        if(n<0&&m>0)
        {
            System.out.println("2");
        }
        else if(n>0&&m>0)
        {
            System.out.println("1");
        }
        else if(n<0&&m<0)
        {
            System.out.println("3");
        }
        else
        {
            System.out.println("4");
        } 
    }
}