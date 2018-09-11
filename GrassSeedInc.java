import java.util.Scanner;

public class GrassSeedInc 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        
        double costSeed = sc.nextDouble();
        int numLawns = sc.nextInt();
        double total=0;
        
        for(int i =1;i<=numLawns;i++)
        {
            double width = sc.nextDouble();
            double length = sc.nextDouble();
            double area = width*length;
            total = total + area*costSeed;
        }
        System.out.println(total);    
    }
}