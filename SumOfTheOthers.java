import java.util.*;

public class SumOfTheOthers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String[] ar1 = sc.nextLine().split(" ");
            int sum = 0;
            for (int i = 0; i < ar1.length; i++) {
                sum += Integer.parseInt(ar1[i]);
            }
            System.out.println(sum / 2);
        }
    }
}