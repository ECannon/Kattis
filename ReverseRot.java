import java.util.*;

public class ReverseRot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";

		while (true) {

			String s = sc.nextLine();
			if (s.equals("0"))
				break;

			int n = Integer.parseInt(s.substring(0, s.indexOf(' ')));

			s = s.substring(s.indexOf(' ') + 1);
			s = pal(s);

			for (int i = 0; i < s.length(); i++) {

				int temp = a.indexOf(s.charAt(i));

				temp += n;
				System.out.print(a.charAt(temp));

			}

			System.out.println();

		}

	}

	public static String pal(String s1) {

		String s2 = "";

		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 += s1.charAt(i);
		}

		return s2;

	}

}
