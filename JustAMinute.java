import java.util.*;

public class JustAMinute {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        int totalWaitingTime = 0;
        int totalSeconds = 0;

        for (int i = 1; i <= cases; i++) {
            int minutesDisplayed = sc.nextInt();
            int secondsWaited = sc.nextInt();

            totalWaitingTime += minutesDisplayed;
            totalSeconds += secondsWaited;
        }

        totalWaitingTime = totalWaitingTime * 60;

        double value = (double) totalSeconds / totalWaitingTime;

        value = (double) Math.round(value * 1000000000) / 1000000000;
        
        if(totalWaitingTime >= totalSeconds)
        {
            System.out.println("measurement error");
        }
        else
        {
            System.out.println(value);
        }
    } 
}
