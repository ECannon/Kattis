import java.util.*;

public class StandOnZanzibar 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) 
        {

            int difference = 0;
            int prevPopulation = 0;

            while (true) 
            {

                int population = sc.nextInt();
                if (population == 0) 
                {
                    break;
                }
                if (population > (prevPopulation * 2)) 
                {
                    difference = difference + (population - prevPopulation * 2);
                }
                prevPopulation = population;
            }
            System.out.println(difference - 1);
        }
    }
}