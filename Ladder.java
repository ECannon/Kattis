import java.util.Scanner;

public class Ladder 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int v = sc.nextInt();
        
        double deg = ((Math.sin(Math.toRadians(v))));
        double length = (h/deg);
        System.out.println(((int)length)+1);    
    }
}