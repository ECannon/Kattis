import java.util.*;

public class EstimatingTheAreaOfACircle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true)
        {
            double radius = sc.nextDouble();
            double markedPoints = sc.nextDouble();
            double markedCircle = sc.nextDouble();
            
            if(radius == 0 && markedPoints == 0 && markedCircle == 0)
            {
                break;
            }
            
            System.out.print(Math.PI*Math.pow(radius, 2) + " ");
            System.out.println((markedCircle / markedPoints)*4*radius*radius);
        }
    }
}