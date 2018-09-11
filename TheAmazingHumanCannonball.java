import java.util.*;

public class TheAmazingHumanCannonball 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) 
        {
            double v = sc.nextDouble();
            double d = sc.nextDouble();
            double x = sc.nextDouble();
            double h1 = sc.nextDouble();
            double h2 = sc.nextDouble();
            double t = x / (v * Math.cos(d / 180 * Math.PI));
            double h = v * t * Math.sin(d / 180 * Math.PI) - 0.5 * 9.8 * t * t;

            if (h >= h1 + 1 && h <= h2 - 1)
            {
                System.out.println("Safe");
            }

            else
            {
                System.out.println("Not Safe");
            }
        }
    }
}