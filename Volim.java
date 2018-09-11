import java.util.*;

public class Volim {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int timeLimit = 210;
        int startingContestant = Integer.parseInt(sc.nextLine());
        int numQuestions = Integer.parseInt(sc.nextLine());
        int numPasses = 0;
        int numPassesFinal = 0;

        for (int i = 1; i <= numQuestions; i++) {
            String s1 = sc.nextLine();
            timeLimit -= Integer.parseInt(s1.substring(0, s1.indexOf(' ')));

            if (timeLimit > 0 && s1.charAt(s1.length() - 1) == 'T') {
                numPasses++;
            }
        }
        for (int i = 1; i <= numPasses; i++) {
            startingContestant++;

            if (startingContestant == 9) {
                startingContestant = 1;
            }
        }
        System.out.println(startingContestant);
    }
}