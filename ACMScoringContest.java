import java.math.BigInteger;
import java.util.*;

public class ACMScoringContest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> ar1 = new ArrayList<String>();
		ArrayList<Character> done = new ArrayList<Character>();

		int solved = 0;
		int total = 0;

		String s1 = "";

		while (true) {

			s1 = sc.nextLine();
			if (s1.equals("-1"))
				break;
			ar1.add(s1);
		}

		for (int i = 0; i < ar1.size(); i++) {

			if (ar1.get(i).endsWith("right")) {

				solved++;
				char c1 = ar1.get(i).charAt(ar1.get(i).indexOf(' ') + 1);
				total += Integer.parseInt(ar1.get(i).substring(0, ar1.get(i).indexOf(' ')));

				for (int j = 0; j < i; j++) {
					if (ar1.get(j).charAt(ar1.get(j).indexOf(' ') + 1) == c1) {
						total += 20;
					}
				}
			}
		}

		System.out.println(solved + " " + total);

	}

}
