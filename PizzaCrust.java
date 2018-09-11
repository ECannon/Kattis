import java.util.*;
import java.text.DecimalFormat;

public class PizzaCrust {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
                
        DecimalFormat numberFormat = new DecimalFormat("#.000000");
        
        int radius = sc.nextInt();
        int cheeseRadius = radius - sc.nextInt();
        
        double totalArea = Math.PI*radius*radius;
        double cheeseArea = Math.PI*cheeseRadius*cheeseRadius;
        
        double answer = cheeseArea/totalArea*100;
        System.out.println(numberFormat.format(answer));
    }
}