import java.util.*;

public class MixedFractions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            int numerator = sc.nextInt();
            int denominator = sc.nextInt();
            
            if(numerator == 0 && denominator == 0) break;
            
            if(denominator > numerator)
            {
                System.out.println("0 " + numerator + " / " +denominator);
            }
            else
            {
                System.out.println(numerator/denominator + " " + numerator % denominator + " / " + denominator);
            }
        }
    }
}