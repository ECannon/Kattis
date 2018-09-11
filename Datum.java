import java.util.*;

public class Datum {
    
     public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            int[] calendar = {31,28,31,30,31,30,31,31,30,31,30,31};
            int day = sc.nextInt(), month = sc.nextInt();

            for(int i = 1; i < month; i++)
            {
                if(i > 0) 
                {
                    day += calendar[i - 1];
                }
            }

            switch(day % 7)
            {
                case 0:
                    System.out.println("Wednesday");
                    break;
                case 1:
                    System.out.println("Thursday");
                    break;
                case 2:
                    System.out.println("Friday");
                    break;
                case 3:
                    System.out.println("Saturday");
                    break;
                case 4:
                    System.out.println("Sunday");
                    break;
                case 5:
                    System.out.println("Monday");
                    break;
                case 6:
                    System.out.println("Tuesday");
                    break;
            }  
    }
}