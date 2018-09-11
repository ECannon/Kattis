import java.util.*;

public class Ornaments {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);        
        
        while(true)
        {
            double r = sc.nextDouble();
            double h = sc.nextDouble();
            double s = sc.nextDouble();
            double length = 0;
            
            if(r == 0 && h == 0 && s == 0)
            {
                break;
            }
            
            double x = Math.sqrt(Math.pow(h, 2) - Math.pow(r, 2));
            length += 2*x;
            
            double theta = 360 - 2 * Math.acos(r/h) * (180 / Math.PI);
            length += 2 * Math.PI * (theta/360) * r;
            
            length += length*(s/100);

            double y = (double)Math.round(length * 100)/100;
            
            String s1 = Double.toString(y);
            String s2 = s1.substring(s1.indexOf('.')+1);
            
            if(s2.length()<2)
            {
                System.out.println(s1+"0");
            }
            else
                System.out.println(s1);         
        }
    }
}