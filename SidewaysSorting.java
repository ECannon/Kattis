import java.util.*;

public class SidewaysSorting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			String s1 = sc.nextLine();

			int r = Integer.parseInt(s1.substring(0, s1.indexOf(' ')));
			int c = Integer.parseInt(s1.substring(s1.indexOf(' ') + 1));

			if (r == 0 && c == 0)
				break;

			char[][] ar1 = new char[r][c];
			ArrayList<String> ar2 = new ArrayList<String>();

			for (int i = 0; i < ar1.length; i++) {
				s1 = sc.nextLine();
				for (int j = 0; j < ar1[0].length; j++) {
					ar1[i][j] = s1.charAt(j);
				}
			}

			for (int i = 0; i < ar1[0].length; i++) {
				s1 = "";
				for (int j = 0; j < ar1.length; j++) {
					s1 += ar1[j][i];
				}
				ar2.add(s1);
			}

			Collections.sort(ar2, String.CASE_INSENSITIVE_ORDER);

			for (int i = 0; i < ar2.size(); i++) {
				for (int j = 0; j < ar2.get(i).length(); j++) {
					ar1[j][i] = ar2.get(i).charAt(j);
				}
			}

			for (int i = 0; i < ar1.length; i++) {
				for (int j = 0; j < ar1[0].length; j++) {
					System.out.print(ar1[i][j]);
				}
				System.out.println();
			}

			System.out.println();
		}

	}

}
