import java.util.*;

public class GuessTheNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int low = 1;
		int high = 1000;

		while (low <= high) {

			int mid = (low + high) / 2;
			System.out.println(mid);

			String s1 = sc.nextLine();

			if (s1.equals("correct"))
				break;
			else if (s1.equals("lower"))
				high = mid - 1;
			else
				low = mid + 1;

		}
	}

}
