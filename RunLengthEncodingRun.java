import java.util.*;

public class RunLengthEncodingRun {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s1 = sc.nextLine();

		if (s1.charAt(0) == 'E') {
			encode(s1.substring(2));
		} else {
			decode(s1.substring(2));
		}

	}

	public static void encode(String s1) {

		char c = s1.charAt(0);
		int count = 1;

		for (int i = 1; i < s1.length(); ++i) {

			if (s1.charAt(i) == c) {
				count++;
			} else {
				System.out.print(c + "" + count);
				count = 1;
				c = s1.charAt(i);
			}
		}

		System.out.print(c + "" + count);

	}

	public static void decode(String s1) {

		for (int i = 0; i < s1.length(); i += 2) {

			int count = Integer.parseInt(s1.charAt(i + 1) + "");

			while (count > 0) {
				System.out.print(s1.charAt(i));
				count--;
			}

		}

	}

}
