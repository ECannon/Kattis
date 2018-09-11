import java.util.*;

public class HelpAPhdCandidateOut {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cases = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < cases; i++) {
            String s1 = sc.nextLine();

            if (s1.equals("P=NP")) {
                System.out.println("skipped");
            } else {
                System.out.println(Integer.parseInt(s1.substring(0,
                        s1.indexOf('+')))
                        + Integer.parseInt(s1.substring(s1.indexOf('+') + 1,
                                s1.length())));
            }
        }
    }
}